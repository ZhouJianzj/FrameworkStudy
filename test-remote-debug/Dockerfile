# 指定基础镜像，这里的镜像做好了所有的java项目所需要的基础依赖
FROM java:8-alpine

# 复制java项目
COPY ./app.jar /tmp/app.jar

# 暴露端口
EXPOSE 8080

# 入口，java项目的启动命令
ENTRYPOINT java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar /tmp/app.jar
#java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar spring-boot-mybatis-plus-0.0.1-SNAPSHOT.jar