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
        p{
            font-family: Helvetica, Helvetica Neue, Ariel;
            color:rgba(50,50,50,1);
        }
        .p{
            font-family: Helvetica, Helvetica Neue, Ariel;
            color:rgba(50,50,50,1);
        }
        .hd1{
            color:rgba(50,50,50,1);
            font-size: 36px;
            font-family: Helvetica, "Helvetica Neue", Arial;
        }
        #header{
            position: absolute;
            left: 0;
            top: 0;
            width: 100%;
            height: 12%;
            background-color: rgba(25,167,119,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.5);
        }

        .story{

            margin: 0px;
            width: 100%;
            height: 25%;
            background-color: rgba(245,245,245,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.2);
        }
        #Feed{

            padding: 50px;
        }
        .input{
            width:100%;
            height:100px;
            margin:0px;
        }
    </style>
</head>

<body>
<div id="Header">
  <p class="hd1" style="position: absolute; left:20px; top:-15px; ">${account.userName}</p>
</div>

<div id="Feed">
    <div class="story">
    <form:form method="post" modelAttribute="story">
        <form:input cssClass="input" path="story" placeholder="What is in your head?"/>
        <br />
        <input class="whiteButton" type="submit" value="Post" />
    </form:form>
    </div>
    <div class="story">
        <p>Hello, World</p>
        <p>Hello ${account.userName}! Your password is ${account.password}!</p>
    </div>
    <div class="story">
        <p>Hello, World</p>
        <p>Hello ${account.userName}! Your password is ${account.password}!</p>
    </div>
</div>

</body>
</html>
