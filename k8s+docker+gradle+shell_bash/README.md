## 不同业务项目Jenkinsfile的配置

`environment {CODE_NAME} `

修改Git repo名字，拉取不同repo的代码，以区分项目程序

## 使用注意事项
`environment {DOCKER_SITE} `

Jenkins操作docker构建以及上传至registry的工作目录，从宿主机本地目录挂载至jenkins容器内部，**关于设置必须为绝对路径**

manifest 目录存放kubernetes部署的yaml文件和模板yaml文件，并区分了namespace工作空间

tools 目录中存放了jenkins的外部执行工具，脚本(根据系统设置全局环境变量来映射此目录)

其他目录均以${JOB_NAME}命名，也就是jenkins任务名称，其中存放了Dockerfile文件，程序文件。在某些情况下代码要求整洁且不允许放置环境文件的话，可以创建此类单个项目目录来实施构建

请严格按照此结构创建工作目录:

    ${DOCKER_SITE}
        | -> ${JOB_NAME_A} -> Dockerfile + jar
        | -> ${JOB_NAME_B} -> Dockerfile + jar
        | -> manifest -> ${DEPLOY_NS_C} -> ${JOB_NAME_A}.yaml.tmple + ${JOB_NAME_B}.yaml.tmple
        |        |    -> ${DEPLOY_NS_D} -> ${JOB_NAME_A}.yaml.tmple + ${JOB_NAME_B}.yaml.tmple
        | -> tools -> kubectl + deploy_rollout.sh


`environment {TIME_STAMP} `

GenerateTimestamp()是生成全局唯一时间戳的函数，它会返回内容并赋值给TIME_STAMP

`environment {DOCKER_IMAGE_TAG} `

发布类型_时间戳_构建ID 此变量在发布脚本中被截取出时间戳+构建ID给yaml文件使用，发布类型和时间戳之间的_下划线是必须的

