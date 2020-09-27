## 全局配置
### 配置kubernetes cloud

### 配置与kube-apiserver通讯地址
如果jenkins master托管在kubernetes集群并且pod挂载了service account，那么配置为 `https://kubernetes.default.svc.cluster.local`，测试连通性无须填写认证，pod拿sa与kube-apiserver通讯

如果jenkins master部署在外部，配置为kube-apiserver VIP地址并提供鉴权信息

### 配置Jenkins slave与Jenkins slave的通讯地址
jenkins通讯地址：如果jenkins master托管在kubernetes集群，配置为 `https://jenkins.jenkins-namespace.svc.cluster.local:8080`

jenkins通道：配置slave pod与jenkins master通讯地址，默认在当前namespace svc中5000端口通讯

## Pipeline配置
### FAQ
问：jenkins slave通过kubernetes交付是怎么工作的？

答：jenkins master调用kube-apiserver创建出podTemplate所定义的pod，pod中包含一个或多个工作容器，默认有jenkins slave jnlp容器，比如还可以添加maven容器等，这个pod即为jenkins slave；在执行stage时通过container()调用pod中不同工作容器来处理流程，当流程执行结束后或者不同node代理pod执行结束后，pod和pod中多个工作容器也流程结束而释放

---

问：关于kubernetes plugin的脚本式特性，字段node(POD_LABEL){..}的问题

答：当podTemplate中指定label选项时，比如`{label: 'someLabel'}`，那么在node字段中也需要指定`node('someLabel'){..}` ；如果podTemplate没有指定label选项时，那么node字段可以指定`node(POD_LABEL){..}`忽略label选项运行流程。作用是通过定义label设置agent pod唯一性，然后在node中指定需要哪个agent pod来执行流程，后者如果不指定label那么流程中只能使用一个agent pod

