<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
    function doajax() {
        //创建异步请求对象
        var xmlHttpRequest = new XMLHttpRequest();
        //给异步对象绑定事件
        xmlHttpRequest.onreadystatechange = function () {
        //需要在这里面去获取数据，因为每一次异步对象的方法执行都会改变状态码，只要状态码一改变就执行这个方法
        //     alert(xmlHttpRequest.readyState)
            if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200){
                document.getElementById("show").value = xmlHttpRequest.responseText
            }
        }
        //获取参数
        var h = document.getElementById("h").value;
        var w = document.getElementById("w").value;
        var msg ="h=" + h + "&w=" + w
        //初始化异步对象
        //这里是可以实现textBim访问的
        xmlHttpRequest.open("get","textBim?"+msg)
        //发送异步请求
        xmlHttpRequest.send()
    }
</script>
<body>
<div align="center">
    <h2>BIM</h2>
   身高（m）:<input type="text" id="h"><br>
    体重（kg):<input type="text" id="w"><br>
    <button onclick="doajax()">提交</button>
    <p>展示异步请求处理过来的数据</p>
    <input type="text" id="show">
</div>
</body>
</html>
