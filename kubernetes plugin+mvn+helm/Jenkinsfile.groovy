// def HEAD_LABEL = 'yuntu'

// About git pull code 
def GIT_BRANCH = 'refs/heads/master'
def GIT_SERVER_URL = 'http://git.yuntu.net.cn:809/support/cms-server.git'
def GIT_CREID = '101'

// About docker workflow
def DOCKER_REGISTRY = "registry-vpc.cn-beijing.aliyuncs.com/bjyuntu/cms"
def DOCKER_REGISTRY_CRE = "103"
def DOCKER_IMAGE_TAG = "${JOB}_${BUILD_ID}"

// About helm release server
def HELM_REPO = ""

podTemplate(
    cloud:'kubernetes', 
    // label: HEAD_LABEL, 
    namespace: 'jenkins-namespace', 
    imagePullSecrets: ['yuntu-aliyun'], 
    volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')],
    //volumes: [hostPathVolume(hostPath: '/home', mountPath: '/root/.m2')],
    containers: [
        containerTemplate(
            name: 'maven', 
            image: 'registry-vpc.cn-beijing.aliyuncs.com/bjyuntu/package:mvn-14', 
            ttyEnabled: true, 
            command: 'cat'),
        containerTemplate(
            name: 'docker', 
            image: 'docker', 
            ttyEnabled: true, 
            command: 'cat'),
        // containerTemplate(
        //     name: 'helm', 
        //     image: '', 
        //     ttyEnabled: true, 
        //     command: 'cat'),
            ]
    ){

    node(POD_LABEL) {

        stage('Git pull code') {
            checkout([$class: 'GitSCM',
            branches: [[name: "${GIT_BRANCH}"]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [],
            userRemoteConfigs: [[credentialsId: "${GIT_CREID}", url: "${GIT_SERVER_URL}"]]])
        }

        stage('Build project') {
            container('maven') {
                sh 'mvn clean install -Dmaven.test.skip=true '
            }
        }

        stage('Docker workflow') {
            container('docker') {
                docker.withRegistry("https://${DOCKER_REGISTRY}", "${DOCKER_REGISTRY_CRE}"){
                def customImage = docker.build("${DOCKER_REGISTRY}:${DOCKER_IMAGE_TAG}")
                customImage.push()
                }
            }
        }

        stage('Kubernetes') {
            echo 'helm release'
        }
    }
}
