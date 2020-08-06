#!/bin/bash

# BuildEnv: service type
# BuildCom: service copy env
BuildEnv=$1
BuildCom=$2
SaltDir=/data/salt

# BuildCom kting env
function __kting {
    if [ ! -e $SaltDir/jar ];then mkdir -p $SaltDir/jar;fi
    rm -f $SaltDir/jar/*
    cp -f build/libs/*.jar $SaltDir/jar

# salt copy dest server to file
    if [ ! -e $SaltDir/${BuildEnv}.sls ];then echo "! salt copy $BuildEnv sls file not exist check $SaltDir ";exit 1;fi
    salt -N kting-${BuildEnv} state.sls $BuildEnv
    salt -N kting-${BuildEnv} cmd.run 'ls /opt'

    if [ ! -e $SaltDir/script/${BuildEnv}_update.sh ];then echo "! $SaltDir/${BuildEnv}_update.sh update salt script not exist check $SaltDir/script ";exit 2;fi
    salt -N kting-${BuildEnv} cmd.script salt://script/${BuildEnv}_update.sh
}

# BuildCom trunk env
function __trunk {
    if [ ! -e $SaltDir/jar ];then mkdir -p $SaltDir/jar;fi
    rm -f $SaltDir/jar/*
    cp -f build/libs/*.jar $SaltDir/jar

# salt copy dest server to file
    if [ ! -e $SaltDir/${BuildEnv}.sls ];then echo "! salt copy $BuildEnv sls file not exist check $SaltDir ";exit 1;fi
    salt -L hmf_kting_dev state.sls $BuildEnv
    salt -L hmf_kting_dev cmd.run 'ls /opt'

    if [ ! -e $SaltDir/script/${BuildEnv}_update.sh ];then echo "! $SaltDir/${BuildEnv}_update.sh update salt script not exist check $SaltDir/script ";exit 2;fi
    salt -L hmf_kting_dev cmd.script salt://script/${BuildEnv}_update.sh
}

# use man
function __man {
    echo "Usage: salt_deploy [build service type] [build service env]"
}

case $BuildCom in
    kting)
    __kting
    ;;
    trunk)
    __trunk
    ;;
    backup)
    __backup
    ;;
    *)
    __man
    ;;
esac
