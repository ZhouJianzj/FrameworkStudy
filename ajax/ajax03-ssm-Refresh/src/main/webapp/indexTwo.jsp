<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/jquery-3.6.0.min.js"></script>
<script>
    $(function () {
        $(":button").on("click",function () {
            $.ajax({
                url:"findStudent",
                type:"get",
                dataType:"json",
                data:{
                   id:$("#stuId").val()
                },
                success:function (response) {
                    $("#name").val(response.name)
                    $("#age").val(response.age)
                }
            })
        })
    })
</script>
<body>
    <div align="center" >
        <p>ssm-ajax-实现数据库数据传递的异步请求</p>
        <p>使用jQuery实现异步请求</p>
        <table>
            <tr>
                <td>学号：</td>
                <td><input type="text" id="stuId" name="Id"></td>
                <td><input type="button" value="搜索"></td>
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
