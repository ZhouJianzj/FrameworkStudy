<html>
<body>
<h2>Hello World!</h2>

<form action="doForward.do" method="get">
    <table>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr><td><input type="submit" value="forward请求转发"></td></tr>
    </table>
</form>
<form action="doRedirect.do" method="get">
    <table>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr><td><input type="submit" value="redirect重定向"></td></tr>
    </table>
</form>
</body>
</html>
