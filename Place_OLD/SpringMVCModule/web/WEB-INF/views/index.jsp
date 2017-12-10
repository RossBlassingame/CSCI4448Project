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
    <style>
        body{
            background-color: rgba(31,36,54,1);
        }
        p {
            font-family: Helvetica, Helvetica Neue, Ariel;
            color: rgba(50, 50, 50, 1);
        }

        .p{
            font-family: Helvetica, Helvetica Neue, Ariel;
            color:rgba(250,250,250,1);
        }
        .soft{
            font-family: Helvetica, Helvetica Neue, Ariel;
            font-weight: 300;
            font-size: 18px;
            color:rgba(180,180,180,1);
        }
        .hd1{
            color:rgba(50,50,50,1);
            font-size: 36px;
            font-family: Helvetica, "Helvetica Neue", Arial;
        }

        #header{
            position: absolute;
            right: 0;
            top: 0;
            bottom: 0;
            width: 40%;
            height: 100%;
            background-color: rgba(25,167,119,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.5);
        }

        #signup{
            position: absolute;
            margin: auto;
            top: 25%;
            left: 10%;
        }


        .input{
            width:400px;
            height:30px;
            margin: 2px;
        }

        .greenButton{
            background-color: rgba(25,167,119,1);
            color:white;
            width:200px;
            height:30px;
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


    </style>
    <script type="text/javascript"></script>
</head>

<body>
<p class="p" style="position:absolute; left:20px; top:-15px; font-size: 36px; font-weight: 300;">Place</p>
<div id="header">
    <div style="position: absolute; right:10%; top:30%;">
        <p class="p" style="font-size: 24px; font-weight: 300">Log In</p>
    <form:form method="post" modelAttribute="account">
        <form:input cssClass="input" path="userName" placeholder="User Name"/>
        <br />
        <form:input cssClass="input" class="input" path="password" placeholder="Password" type="password"/>
        <br />
        <input class="whiteButton" type="submit" value="Log In" />
    </form:form>
    </div>
</div>

<div id="signup">
    <p class="p" style="font-size: 24px; font-weight: 300;">Welcome</p>
        <p class="soft">Place is a simple-social networking application to share your story.</p>

        <form:form method="post" modelAttribute="account">
            <form:input class="input" path="email" placeholder="Email"/>
            <br />
            <form:input class="input" path="userName" placeholder="User Name"/>
            <br />
            <form:input class="input" path="password" placeholder="Password" type="password"/>
            <br />
            <input class="greenButton" type="submit" value="Create Account" />

            <br />
        </form:form>
    </div>
</body>


</html>