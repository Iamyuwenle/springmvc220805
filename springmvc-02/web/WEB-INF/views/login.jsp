<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        #link{
            position: absolute;
            right: 620px;
            top: 15px;
        }
    </style>
</head>
<body>
    <div align="center">
        <h4><fmt:message key="login.title"/></h4>
        <div id="link">
            <a href="toLogin?locale=zh-CN">中文</a>
            /
            <a href="toLogin?locale=en-US">英文</a>
        </div>
        <from>
            <fmt:message key="login.username"/>:
            <input type="text"> <br><br>

            <fmt:message key="login.password"/>:
            <input type="text"> <br><br>

            <input type="submit" value="<fmt:message key="login.btn"/>">
        </from>
    </div>
</body>
</html>
