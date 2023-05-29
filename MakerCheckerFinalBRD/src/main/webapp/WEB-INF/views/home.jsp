<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title> Welcome user!</title>

<body>
<br>
<center>
<br>
<br>
<h1>Welcome user!</h1>
<br><br>

<h2> Click on the below button to login </h2>
<div class="container">
<div class="row">
<div ><a href="maker" style="middle "><button class="btn btn-secondary">Maker</button></a>
<a href="checker" style="middle"><button class="btn btn-secondary">Checker</button></a>
<br>
<br>
<c:url var="logout" value="/logout"></c:url>
</div>

<form:form action="${logout}"  method ="post">
<div ><class="btn btn-primary" input type="submit" value="logout">
<div><button input type="submit" value="logout" class="btn btn-primary">Logout</button></a></div>
</form:form>

</div>
</div>
</div>
</div>
</center>
</body>
</head>
</html>