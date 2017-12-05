<%--
  Created by IntelliJ IDEA.
  User: michaeltang
  Date: 11/28/17
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Place</title>
    <link rel="stylesheet" type="text/css" href="../../css/login.css">
</head>

<body>
<div id="header">
    <p class="hd1" style="position:absolute; left:20px; top:-15px; ">Place</p>
</div>
<div>
    <div id="signup">
        <p>Sign Up</p>
        <form:form method="post" modelAttribute="account">
            <!--<form:label path="email">First name</form:label>-->
            <form:input path="email" placeholder="Email"/>
            <br />
            <!--<form:label path="userName">Last name</form:label>-->
            <form:input path="userName" placeholder="User Name"/>
            <br />
            <!--<form:label path="password">Last name</form:label>-->
            <form:input path="password" placeholder="Password" type="password"/>
            <br />
            <input type="submit" value="Create Account" />
        </form:form>
    </div>
</div>
</body>


</html>