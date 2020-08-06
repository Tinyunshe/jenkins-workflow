#!/bin/bash
DOCKER_IMAGE_FULL_NAME=$1
DEPLOY_NS=$2
JOB_NAME=$3
KUBE_YAML_SIG=$4
DOCKER_SITE=$5
SOME_DATA="/${DOCKER_SITE}  \
           /${DOCKER_SITE}/manifests/${DEPLOY_NS}  \
           /${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}.yaml.tmple"

set -eu

for DATA in ${SOME_DATA};do
    [ ! -e ${DATA} ] && echo ${DATA} not exist && exit 1
done

sed "/image: / s#{{IMAGE_NAME}}#${DOCKER_IMAGE_FULL_NAME}#g" /${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}.yaml.tmple > \
/${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}_${KUBE_YAML_SIG}.yaml

kubectl apply -f /${DOCKER_SITE}/manifests/${DEPLOY_NS}/${JOB_NAME}_${KUBE_YAML_SIG}.yaml