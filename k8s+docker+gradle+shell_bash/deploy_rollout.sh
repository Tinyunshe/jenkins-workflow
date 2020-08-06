#!/bin/bash

# 发布时会检查工作目录，名称空间目录，模板文件是否存在，来定义发布的项目所处的名称空间是否存在，来决定是否部署至集群
# 回滚时会检查工作目录，名称空间目录，来定义回滚的项目是否存在于指定名称空间下，即可以区分不同平台来回滚制品文件
_check_data () {

    for DATA in $*;do
        if [ ! -e ${DATA} ];then printf "${DATA} 不存在\n" && return 1 ;fi
    done

}

# 发布 -> 检查参数数量 -> 检查基础数据 -> 更改模板yaml生成部署yaml -> 部署
_deploy () {

    local DOCKER_IMAGE_FULL_NAME=$2
    local DEPLOY_NS=$3
    local JOB_NAME=$4
    local DOCKER_SITE=$5
    local KUBE_YAML_SIG=${DOCKER_IMAGE_FULL_NAME#*:*_}
    local DEPLOY_NS_DIR="${DOCKER_SITE}/manifests/${DEPLOY_NS}"
    local TMPLE_YAML="${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}.yaml.tmple"
    local CURRENT_YAML="${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}_${KUBE_YAML_SIG}.yaml"

    if (($# > 6));then printf "参数错误" && exit 1;fi

    _check_data ${DOCKER_SITE} ${DEPLOY_NS_DIR} ${TMPLE_YAML}

    sed "/image: / s#{{IMAGE_NAME}}#${DOCKER_IMAGE_FULL_NAME}#g" ${TMPLE_YAML} > ${CURRENT_YAML}

    kubectl apply -f ${CURRENT_YAML}

    printf "已生成YAML文件 ${CURRENT_YAML} \n请检查kubectl -n ${DEPLOY_NS} logs [POD_NAME] 是否运行成功\n"
}

# 回滚 -> 检查参数数量 -> 检查基础数据 -> 检查回滚yaml文件是否存在 -> 部署
_rollout () {

    local DEPLOY_NS=$2
    local JOB_NAME=$3
    local ROLLOUT_NUM=$4
    local DOCKER_SITE=$5        
    local DEPLOY_NS_DIR="${DOCKER_SITE}/manifests/${DEPLOY_NS}"
    local ROLLOUT_YAML=$(find ${DOCKER_SITE}/manifests/${DEPLOY_NS} -name "${JOB_NAME}_*_${ROLLOUT_NUM}.yaml")

    if (($# > 5));then printf "参数错误" && exit 1;fi

    _check_data ${DOCKER_SITE} ${DEPLOY_NS_DIR} ; [ $? != 0 ] && exit 1

    if ((${#ROLLOUT_YAML} == 0));then
        printf "回滚YAML文件不存在, 请检查构建号或者回滚发布平台" && exit 1
    else
        kubectl apply -f ${ROLLOUT_YAML}
    fi

    printf "已回滚YAML文件版本 ${ROLLOUT_YAML} \n请检查kubectl -n ${DEPLOY_NS} logs [POD_NAME] 是否回滚成功\n"
}

set -eu

MODE=$1

case ${MODE} in
    deploy)
    _deploy $*
    ;;
    rollout)
    _rollout $*
    ;;
esac