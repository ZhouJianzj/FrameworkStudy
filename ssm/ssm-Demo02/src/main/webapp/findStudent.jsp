<%--
  Created by IntelliJ IDEA.
  User: zhoujian
  Date: 2021/5/10
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询学生</title>
    <script src="js/jquery-3.6.0.min.js"></script>
<%--    base标签不写了--%>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function(){
                $.ajax({
                    url:"studentFind.do",
                    type:"get",
                    dataType:"json",
                    success:function (data) {
                        // 每次查询删除旧的
                        $("#info").html(" ")
                        //i表示循环的一个参数 n表示对象
                        $.each(data,function (i,n) {
                            $("#info").append("<tr>")
                            .append("<td>" + n.id + "</td>" )
                            .append("<td>" + n.name + "</td>")
                            .append("<td>" + n.age + "</td>")
                            .append("</tr>")
                        })
                    }
                })
            })
        })
    </script>
</head>
<body>
<div align="center">
    <table border="1xp">
        <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>年龄</td>
            </tr>
        </thead>
<%-- 为下面ajax填充数据做好准备--%>
        <tbody id="info"></tbody>
    </table>
    <button id="btn">查询数据</button>
</div>
</body>
</html>
