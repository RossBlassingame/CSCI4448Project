<%--
  Created by IntelliJ IDEA.
  User: michaeltang
  Date: 12/9/17
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Welcome to Place</title>
    <style>
        body{
            background-color: rgba(31,36,54,1);
        }
        p {
            font-family: Helvetica, Helvetica Neue, Ariel;
            color: rgba(50, 50, 50, 1);
        }

        .greenButton{
            background-color: rgba(25,167,119,1);
            color:white;
            font-size: 24px;
            font-weight: 300;
            width:400px;
            height:60px;
            padding: 5px;
            border: none;

        }

        .whiteButton{
            width:200px;
            height:30px;
            background-color:rgba(250,250,250,1);
            color: rgba(25,167,119,1);
            padding: 5px;
            border: none;
        }

        #front{
            font-family: Helvetica, Helvetica Neue, Ariel;
            font-size: 36px;
            font-weight: 300;
            color:rgba(250,250,250,1);
        }

        #welcomeMessage{
            position: absolute;
            left: 0;
            right: 0;
            top: 30%;
            bottom: 0;
            text-align: center;
            -webkit-animation: fadein 3s;
        }
        @-webkit-keyframes fadein {
            from { opacity: 0; }
            to   { opacity: 1; }
        }
    </style>
    <script type="text/javascript"></script>
</head>
<body>
    <div id="welcomeMessage">
    <p id="front">Welcome to Place, ${account.userName}. Let's write your first Story.</p>
         <form:form method="post" modelAttribute="account">

        <input class="greenButton" type="submit" value="Continue" />

        <br />
    </form:form>
    </div>
</body>
</html>
