<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/23
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>局部刷新</title>
    <script type="text/javascript">
       function doAjax(){
            //创建xmlHttpServletRequest对象
            var xmlHttp = new XMLHttpRequest();
            //绑定事件，每一步都需要调用这个方法
            xmlHttp.onreadystatechange = function(){
                //处理服务器返回的数据的,
                alert("readyStatue :" + xmlHttp.readyState )

                // xmlHttp.responseText处理反馈的数据ye也就是write传递来的数据
              //xmlHttp.status最后的状态码
            };
            //初始化,
            xmlHttp.open("get","juBu",true);
            //发送
            xmlHttp.send()
        }

    </script>
</head>
<body>
        <span>这是一个局部刷新</span>
        <div>
            <input type="button" value="局部刷新" onclick="doAjax()">
        </div>
</body>
</html>
