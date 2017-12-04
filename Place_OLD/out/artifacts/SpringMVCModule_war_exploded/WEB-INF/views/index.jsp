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
        <form:form method="post" modelAttribute="person">
            <form:label path="firstName" cssStyle="font-family: 'Helvetica Neue'">First name</form:label>
            <form:input path="firstName" />
            <br />

            <form:label path="lastName">Last name</form:label>
            <form:input path="lastName" />
            <br />

            <input type="submit" value="Submit" />
        </form:form>
    </div>
</div>
</body>


</html>