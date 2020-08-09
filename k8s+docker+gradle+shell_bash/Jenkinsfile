def GenerateTimestamp() {
    return new Date().format('yyyyMMddHHmmss')
}
//生成全局时间戳

pipeline {

agent any

options {
    timeout (time:5,unit: 'MINUTES')
    buildDiscarder(logRotator(numToKeepStr: '5'))
    disableConcurrentBuilds()
}

parameters {
    choice choices: ['deploy', 'rollout'], description: '选择构建模式', name: 'MODE'
    choice choices: ['online', 'offline'], description: '线上/线下', name: 'TYPE'
    choice choices: ['A-system', 'B-system', 'C-system', 'frontend'], description: '选择部署平台 ', name: 'DEPLOY_NS'
    choice choices: ['master', 'trunk','devel'], description: '选择代码分支', name: 'CODE_BRANCH'
    string (defaultValue: '0', description: '输入回滚左侧构建号',name: 'ROLLOUT_NUM')
}

environment {
    //参数化构建相关环境变量
    MODE = "${params.MODE}"
    DEPLOY_NS = "${params.DEPLOY_NS}"
    CODE_BRANCH = "${params.CODE_BRANCH}"
    TYPE = "${params.TYPE}"

    //获取代码相关环境变量
    CODE_NAME = "auto-cicd"
    GITLAB_CRE = "id-name"
    GITLAB_URL = "http://gitlab.example.cn/${CODE_NAME}.git" 

    //生成Docker Image推送至Docker Registry相关环境变量
    TIME_STAMP = GenerateTimestamp()
    DOCKER_SITE = "/jenkins_dockersite"
    DOCKER_REGISTRY = "harbor.example.cn"
    DOCKER_REGISTRY_CRE = "harbor.example.cn"
    DOCKER_IMAGE_TAG = "${TYPE}_${TIME_STAMP}_${BUILD_NUMBER}"
    DOCKER_IMAGE_FULL_NAME = "${DOCKER_REGISTRY}/${DEPLOY_NS}/${JOB_NAME}:${DOCKER_IMAGE_TAG}"

    //发布至Kubernetes相关环境变量
    KUBE_CRE = "jenkins-workflow"
    KUBE_APISERVER = "https://100.100.100.100:6443"
}

tools {
    gradle "gradle3.5"
}

stages {
    
    stage('获取代码') {
        when {
            allOf{
                environment name:"MODE",value:"deploy"
            }
        }
        steps {
            echo "获取代码"
            git branch: "${CODE_BRANCH}", credentialsId: "${GITLAB_CRE}", url: "${GITLAB_URL}"
        }
    }

    stage('构建项目') {
        when {
            allOf{
                environment name:"MODE",value:"deploy"
            }
        }
        steps {
            echo "构建项目"
            sh 'gradle  -x test clean build'
            sh '/bin/cp -f build/libs/* ${DOCKER_SITE}/${JOB_NAME}'
            //从workspace目录拷贝打包后的程序文件到jenkins操作docker的工作目录
        }
    }

    stage('生成Docker Image推送至Docker Registry') {
        when {
            allOf{
                environment name:"MODE",value:"deploy"
            }
        }
        steps {
            script {
                echo "生成Docker Image推送至Docker Registry"
                docker.withRegistry("https://${DOCKER_REGISTRY}", "${DOCKER_REGISTRY_CRE}") {
                    def CUSTOM_IMAGE = docker.build('${DEPLOY_NS}/${JOB_NAME}:${DOCKER_IMAGE_TAG}','-f ${DOCKER_SITE}/${JOB_NAME}/Dockerfile ${DOCKER_SITE}/${JOB_NAME}')
                    CUSTOM_IMAGE.push()
                    }
                }
            }
        }

    stage ("发布至Kubernetes") {
        when {
            allOf{
                environment name:"MODE",value:"deploy"
            }
        }
        steps {
            script {
                echo "发布至Kubernetes"
                withKubeConfig([credentialsId: "${KUBE_CRE}",serverUrl: "${KUBE_APISERVER}"]) {
                    sh "deploy_rollout.sh ${MODE} ${DOCKER_IMAGE_FULL_NAME} ${DEPLOY_NS} ${JOB_NAME} ${DOCKER_SITE} "
                    //deploy_rollout.sh 参数声明:
                    //arg1:模式状态发布(发布or回滚)
                    //arg2:docker image名称+标签
                    //arg3:将要部署到Kubernetes中的名称空间namespace
                    //arg4:项目名称
                    //arg5:jenkins操作docker的工作目录
                    }
                }
            }
        }

    stage ("回滚") {
        when {
            allOf{
                environment name:"MODE",value:"rollout"
            }
        }
        steps {
            script {
                echo "回滚"
                withKubeConfig([credentialsId: "${KUBE_CRE}",serverUrl: "${KUBE_APISERVER}"]) {
                    sh "deploy_rollout.sh ${MODE} ${DEPLOY_NS} ${JOB_NAME} ${ROLLOUT_NUM} ${DOCKER_SITE}"
                    //deploy_rollout.sh 参数声明:
                    //arg1:模式状态回滚(发布or回滚)
                    //arg2:将要部署到Kubernetes中的名称空间namespace
                    //arg3:项目名称
                    //arg4:回滚构建号
                    //arg5:jenkins操作docker的工作目录
                    }
                }
            }
        }
    }
}