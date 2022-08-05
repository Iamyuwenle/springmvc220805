<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <h3>
            <a href="hello">hello</a>

            &emsp;

            <a href="a/b">测试</a>

            &emsp;

            <a href="hello2?username=zhangsan&age=24">测试2</a>

            &emsp;

            <a href="hello3">测试3</a>

            <br><br>

            <a href="addUserAA">测试add1</a>
            <a href="addUserAB">测试add2</a>

            <br><br>

            <a href="user/a/addUser">测试4</a>
            <a href="user/a/addUser">测试5</a>

            <br><br>

            <a href="emp/addEmp">测试addemp1</a>
            <a href="emp/a/addEmp">测试addemp2</a>
            <a href="emp/a/b/addEmp">测试addemp3</a>

            <br><br>
            <%--请求  /项目/emp{id}--%>
            <a href="emp/101">emp/101</a>
        </h3>

        <form action="emp" method="post">
            <input type="submit" value="提交">
        </form>

        <br>

        <form action="emp/102" method="post">
            <input type="hidden" name="_method" value="put">
            <input type="submit" value="提交">
        </form>

        <br>

        <form action="emp/102" method="post">
            <input type="hidden" name="_method" value="delete">
            <input type="submit" value="提交delete">
        </form>


        <hr>

        ${requestScope.username} --- ${sessionScope.password}
    </div>
</body>
</html>
