<%--
  Created by IntelliJ IDEA.
  User: zhoujian
  Date: 2021/5/10
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<form action="studentAdd.do" method="get">
    <table>
        <tr>
            <td>学生注册</td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr><td><input type="submit" value="提交"></td></tr>
    </table>
</form>
</body>
</html>
