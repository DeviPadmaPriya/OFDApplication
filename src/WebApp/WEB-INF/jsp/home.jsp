<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
    *{
        margin: 0px;
        padding: 0px;
    }
    header{
        background-color: rgb(26, 26, 26);
        height: 100px;
        display: block;
    }
    #headTitle{
        font-size: 60px;
        color: white;
        font-family: 'Gill Sans', 'Gill Sans MT','Trebuchet MS', sans-serif;
        position: relative;
        width: 100px;
        top: 15px;
        left: 50px;
        display: inline;
    }
    footer{
        background-color: rgb(26, 26, 26);
        height: 150px;
        color: white;
    }
    #advert{
        background-color: rgb(26, 26, 26);
        color: white;
        padding: 100px;
        margin: 100px;
        width: 600px;
        height: 100px;
        font-size: 30px;
    }
    .press{
        border: 2px solid white;
        border-radius: 10px;
        padding: 10px 20px;
        font-size: 20px;
        text-decoration: none;
        color: white;
        margin: 10px;
    }
    #buttonContainer{
        position: absolute;
        right: 50px;
        top: 50px;
    }
</style>
</head>
<body>
<header>
    <p id="headTitle">Wheelin</p>
    <div id="buttonContainer">
        <a class="press" href="/login">Login</a>
        <a class="press" href="/register">Register</a>
    </div>
</header>
<div id="advert">*Some random slogan*</div>
<footer></footer>
</body>
</html>