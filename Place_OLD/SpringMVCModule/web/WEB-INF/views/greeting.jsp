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
  <link rel="stylesheet" type="text/css" href="../../css/story.css">
</head>

<body>
<div id="Header">
  <p class="hd1" style="position: absolute; left:20px; top:-15px; ">${account.userName}</p>
</div>

<div>
    <div id="story">
        <p>Hello, World</p>
        <p>Hello ${account.userName}! Your password is ${account.password}!</p>
    </div>
</div>

</body>
</html>
