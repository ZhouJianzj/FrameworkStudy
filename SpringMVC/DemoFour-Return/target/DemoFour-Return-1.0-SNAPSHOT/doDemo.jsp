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
    <script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        $(function () {
            //给对应的标签绑定事件
            $("#but").click(function () {
                //书写具体的事件所要干的事情
                $.ajax({
                    // url:"test/returnVoidAjax.do",
                    url:"test/doReturnListAsJson.do",
                    // data:{
                    //     name:"zhouJian",
                    //     age:"22"
                    // },
                    type:"post",
                    //这里可写可不写，因为在控制器对象中会书写setContentType（“javaScript/json”）
                    dataType:"json",
                    success:function (resp) {
                        //返回的是json类型的数据{name:"zhoujian",age:"22"}
                        //jquery会给字符串传换成json类型的数据赋值给resp
                        // alert(resp.name + "  " + resp.age)\
                        //下面是循环遍历
                        $.each(resp,function (i,n) {
                            alert(n.name + " " + n.age)
                        })
                    }
                })

            })
        })
        $(function () {
            $("#butOne").click(function () {
                $.ajax(
                    {
                        url: "test/doReturnString.do",
                        success:function (resp) {
                            alert(resp)
                        }
                    }
                )
            })
        })
    </script>

</head>
<body>
<%--返回值String类型的请求--%>
<form action="test/StringReturn.do">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit">
</form>

<%--返回值是void的请求--%>
<button id="but">测试ajax请求</button>
<%--注意的是需要添加一下RequestMapping的属性produce，还需要改一下--%>
<button id="butOne">测试返回值是String类型</button>
<%--返回值是Object对象的时候--%>
<form action="test/ReturnObject.do">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit">
</form>
<p>返回值是一个ArrayList</p>
<a href="test/doReturnListAsJson.do">ArrayListReturn</a>
</body>
</html>
