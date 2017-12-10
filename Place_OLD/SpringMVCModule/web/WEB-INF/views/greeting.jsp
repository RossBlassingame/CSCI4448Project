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
        #Header{
            position: fixed;
            left: 0;
            top: 0;
            z-index: 1;
            width: 100%;
            height: 12%;
            background-color: rgba(25,167,119,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.5);
        }

        .story{

            margin: 20px;
            width: 100%;
            height: 400px;
            background-color: rgba(245,245,245,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.2);
        }
        #Feed{
            position: absolute;
            top:100px;
            width:92%;
            padding-left: 30px;
            padding-right: 30px;
        }
        .input{
            width:100%;
            height:100px;
            margin:0px;
            font-size: 22px;
        }
        .greenButton{
            background-color: rgba(25,167,119,1);
            color:white;
            width:200px;
            height:60px;
            padding: 5px;
            border: none;
        }
        .textForm{
            margin: 20px;
            width: 100%;
            height: 200px;
            background-color: rgba(245,245,245,1);
            -webkit-box-shadow: -3px 5px 10px rgba(0,0,0,0.2);
        }

    </style>

</head>

<body>
<div id="Header">
  <p class="hd1" style="position: absolute; left:20px; top:-15px; ">${account.userName}</p>
</div>

<div id="Feed">
    <div class="textForm">
    <form:form method="post" modelAttribute="story">
        <form:input cssClass="input" path="story" placeholder="What is in your head?"/>
        <br />
        <input class="greenButton"  type="submit" value="Post" />
    </form:form>
    </div>
    <div class="story">
        <br />
        <p>${story0}</p>
        <p>${story1}</p>
        <p>${story2}</p>
        <p>${story3}</p>
    </div>
</div>

</body>
</html>
