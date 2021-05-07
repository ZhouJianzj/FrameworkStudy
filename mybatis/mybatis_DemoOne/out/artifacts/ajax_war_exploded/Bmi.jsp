<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/23
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全局刷新</title>
</head>
<body>
    <br>
    <br>
    <br>
    <br>
<center>
    <form action="/myWeb/bmi" method="get">
        <table >
            <%
                String bmi = (String) request.getAttribute("Bmi");
                if (bmi != null){
            %>
            <tr>
                <td>
                   健康状态：<%=bmi%>
                </td>
            </tr>
            <%
                }
            %>
            <tr>
                <td>
                    姓名：<input type="text" name="name">
                </td>
            </tr>
            <tr>
                <td>
                    体重：<input type="text" name="w">
                </td>
            </tr>
            <tr>
                <td>
                    身高：<input type="text" name="h">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="提交">
                </td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
