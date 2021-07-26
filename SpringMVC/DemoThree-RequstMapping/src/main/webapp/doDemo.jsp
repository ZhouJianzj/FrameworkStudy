<%--
  Created by IntelliJ IDEA.
  User: zhoujian
  Date: 2021/4/26
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用派遣器调度来处理请求</title>
</head>
<body>
<p>第一个派遣器请求</p>
<%--最好配合/一起使用，也可以直接的去掉/--%>
<p><a href="test/some.do">发送请求test/some.do</a></p>
<p><a href="test/other.do">发送请求test/other.do</a></p>
<p><a href="test/doOne.do">发送请求test/doOne.do</a></p>
<form action="test/doTwo.do" method="post">发送请求/test/doTwo.do<input type="submit"></form>
<p><a href="test/doEvery.do">发送请求test/doEvery.do</a></p>
<form action="test/testRequire.do">
    name:<input type="text" name="name">
    age:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
