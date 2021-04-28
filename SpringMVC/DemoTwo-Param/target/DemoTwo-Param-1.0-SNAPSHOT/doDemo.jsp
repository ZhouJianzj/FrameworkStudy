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
<p><a href="test/some.do?name=zhoujian">发送请求test/some.do</a></p>
<p><a href="test/other.do?name=zhoujian">发送请求test/other.do</a></p>
<form action="test/paramOne.do">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit">
</form>

<form action="test/paramTwo.do">
    姓名：<input type="text" name="UserName"><br>
    年龄：<input type="text" name="UserAge"><br>
    <input type="submit">
</form>

<form action="test/paramThree.do">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit">
</form>
</body>
</html>
