// def HEAD_LABEL = 'yuntu'

// About GIT
def GIT_BRANCH = 'refs/heads/master'
def GIT_SERVER_URL = 'http://git.yuntu.net.cn:809/support/cms-server.git'
def GIT_CREID = '101'

// About docker
def DOCKER_REGISTRY = ""
def DOCKER_REGISTRY_CRE = ""
def DOCKER_IMAGE_TAG = ""

podTemplate(
    cloud:'kubernetes', 
    // label: HEAD_LABEL, 
    namespace: 'jenkins-namespace', 
    imagePullSecrets: ['yuntu-aliyun'], 
    // volumes: [hostPathVolume(hostPath: '/data/k8sData/mvn', mountPath: '/root/.m2')],
    containers: [
        containerTemplate(
            name: 'maven', 
            image: 'registry-vpc.cn-beijing.aliyuncs.com/bjyuntu/package:mvn-14', 
            ttyEnabled: true, 
            command: 'cat'),
        // containerTemplate(
        //     name: 'helm', 
        //     image: '', 
        //     ttyEnabled: true, 
        //     command: 'cat')
        ]
    ){

    node(POD_LABEL) {

        stage('Git pull code') {
            checkout([$class: 'GitSCM',
            branches: [[name: "${GIT_BRANCH}"]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [],
            userRemoteConfigs: [[credentialsId: "${GIT_CREID}", url: "${GIT_SERVER_URL}"]]])
        }

        stage('Build project') {
            container('maven') {
                sh 'mvn install -Dmaven.test.skip=true'
            }
        }

        stage('Docker workflow') {
            docker.withRegistry("https://${DOCKER_REGISTRY}", "${DOCKER_REGISTRY_CRE}") {
                def CUSTOM_IMAGE = docker.build("")
                CUSTOM_IMAGE.push()
            }
        }

        stage('Deploy kubernetes')
            echo "Deploy kubernetes"
    }
}