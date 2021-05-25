<html>
<body>
<h2>Hello World!</h2>
<script src="jQuery/jquery-3.6.0.js"></script>
<form action="somedo.do" method="get">
    <table>
        <tr>
            <td>name:</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>age:</td>
            <td><input type="text" name="age" id="age"></td>
        </tr>
        <tr><td><input type="submit" value="submit"></td></tr>
    </table>
</form>
<input type="button" id="button1" value="ajax"/>
<script>
    $(function () {
        $("#button1").on("click",function () {
            $.ajax({
                url:"somedo.do",
                type:"get",
                data:{
                   "name": $("#name").val(),
                   "age": $("#age").val()
                },
                success:function (re) {
                    alert(re)
                },
                error:function (XmlHttpRequest,textStatus, errorThrown) {
                    alert(XmlHttpRequest)
                   alert(textStatus)
                    alert(errorThrown)
                }
            })
        })
    })
</script>
</body>
</html>
