# 工程简介

打jar

1、<!--巨坑的一件事，这里需要改变打包的版本，除了这个版本其他的都不行-->
<plugin>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-maven-plugin</artifactId>
<version>1.4.2.RELEASE</version>

2、打jar包时使用的内嵌的tomcat所以端口号和前缀都是之前你在application.properties中 配置好的 3、找到。。。jar之后使用命令行 java -jar ...
.jar运行，也可以建立一个bat文件把命令写在里面     
           
               
 