#!/bin/bash

Env=$1
BuildEnv=${Env#*_}
BuildCom=$2

# ssh server check log
# exit requird is 0, else jenkins build respond code is failed
function __kting {
    ssh kting-${BuildEnv}1 timeout 80s tail -f /data/logs/micro_service/${BuildEnv}/${BuildEnv}.log
}

function __trunk {
    ssh kting-dev timeout 80s tail -f /data/logs/micro_service/${BuildEnv}/${BuildEnv}.log
}

function __man {
    echo "Usage: check_log [build service type] [build service env]"
}

case $BuildCom in 
    kting)
    __kting
    ;;
    trunk)
    __trunk
    ;;
    backup)
    ;;
    *)
    __man
esac

exit 0
