<%--
  Created by IntelliJ IDEA.
  User: michaeltang
  Date: 12/2/17
  Time: 8:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Result</h1>
<p>${key}</p>
<p th:text="'id: ' + ${greeting.id}" />
<p th:text="'content: ' + ${greeting.content}" />
<a href="/greeting">Submit another message</a>
</body>
</html>
