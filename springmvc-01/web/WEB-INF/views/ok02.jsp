<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/7/27
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>
        ${requestScope.username} -- ${passwrod} -- ${age} -- ${sex}

        <hr>

        ${user.id} -- ${user.name} <br>
        ${sessionScope.user.id} -- ${sessionScope.user.name}

        <hr>

        ${requestScope.u.id} -- ${requestScope.u.name} <br>
        ${sessionScope.u.id} -- ${sessionScope.u.name}
    </h4>
</body>
</html>
