# 工程简介

1、把mapper文件放到resources下面\
2、在application.properties文件下指定声明一下

```#mybatis 的 mapper 文件搬家之后需要指定位置,
   # 这里是   mapperScan  和   resources 结合使用的
   mybatis.mapper-locations=classpath:mapper/*.xml
```


