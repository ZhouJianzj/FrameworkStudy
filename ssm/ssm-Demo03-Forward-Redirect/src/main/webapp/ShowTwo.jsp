<%--
  Created by IntelliJ IDEA.
  User: zhoujian
  Date: 2021/5/11
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <p>使用正常的方法去访问参数是访问不到的</p>
    姓名：${myName}<br>
    年龄：${myAge}
    <p>需要使用$加上{para.参数名字}的方式访问</p>
    姓名：${param.myName}<br>
    年龄：${param.myAge}
</div>
</body>
</html>
