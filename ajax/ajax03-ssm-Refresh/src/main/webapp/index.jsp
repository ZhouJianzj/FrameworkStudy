<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    function doajax() {
        var xmlHttpRequest = new XMLHttpRequest();
        xmlHttpRequest.onreadystatechange = function () {
            if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){
                //后端返回来的是一个json格式的字符串，我们使用js把json格式的字符串转换成json对象
                var jsonObject = eval("(" + xmlHttpRequest.responseText + ")");
                document.getElementById("name").value = jsonObject.name
                document.getElementById("age").value = jsonObject.age

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
