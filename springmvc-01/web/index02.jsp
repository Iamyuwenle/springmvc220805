<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>
        <a href="param?username=管理员&pwd">测试</a>
    </h3>

    <form action="param2" method="post">
        课程:
        <input type="checkbox" name="course" value="计组">计组
        <input type="checkbox" name="course" value="计网">计网
        <input type="checkbox" name="course" value="数据结构">数据结构
        <input type="checkbox" name="course" value="软件工程">软件工程
        <input type="checkbox" name="course" value="计软">计软
        <br>

        <input type="submit" value="提交param2">
    </form>

    <form action="param3" method="post">
        课程:
        <input type="checkbox" name="course" value="计组">计组
        <input type="checkbox" name="course" value="计网">计网
        <input type="checkbox" name="course" value="数据结构">数据结构
        <input type="checkbox" name="course" value="软件工程">软件工程
        <input type="checkbox" name="course" value="计软">计软
        <br>

        <input type="submit" value="提交param3">
    </form>
    <br>

    <form action="param4" method="post">
        学号:<input type="text" name="id"><br>
        姓名:<input type="text" name="name"><br>
        年龄:<input type="text" name="age"><br>
        性别:<input type="text" name="sex"><br>
        狗名:<input type="text" name="dg.name"><br>
        狗龄:<input type="text" name="dg.age"><br>
        <br>
        <input type="submit" value="提交param4">
    </form>

    <br>
    <h3>
        <a href="param4?id=111&name=aaa">测试</a>
    </h3>
</body>
</html>
