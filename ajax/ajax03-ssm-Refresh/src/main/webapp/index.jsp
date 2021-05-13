<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    function doajax() {
        var xmlHttpRequest = new XMLHttpRequest();
        xmlHttpRequest.onreadystatechange = function () {
            if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){
                alert(xmlHttpRequest.responseText)
                document.getElementById("name").value = xmlHttpRequest.responseText.)
                document.getElementById("age").value = xmlHttpRequest.responseText.anchor("age")

            }
        }
        var value = document.getElementById("stuId").value;
        var url = "findStudent" + "?id=" + value
        xmlHttpRequest.open("get",url,true)
        xmlHttpRequest.send()
    }
</script>
<body>
    <div align="center" >
        <p>ssm-ajax-实现数据库数据传递的异步请求</p>
        <table>
            <tr>
                <td>学号：</td>
                <td><input type="text" id="stuId" name="Id"></td>
                <td><input type="button" value="搜索" onclick="doajax()"></td>
            </tr>
            <tr>
                <td>姓名:</td>
                <td><input type="text" id="name"></td>
            </tr>
            <tr>
                <td>年龄:</td>
                <td><input type="text" id="age"></td>
            </tr>
        </table>
    </div>
</body>
</html>
