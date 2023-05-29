<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="m" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
<h1>Name : ${user.user_Id}
<h1>Email-ID : ${user.user_Name}</h1>
<h1>Password : ${user.password}</h1>
<h1>Date : ${user.date}</h1>
<h1>Gender : ${user.gender}</h1>
<h1>Age :${user.age}</h1>
<h1>Holiday Location : ${user.preferredHolidayLocation}</h1>
<h1>Hobbies : </h1>
<m:forEach var="hobby" items="${user.hobby}">
<h2>${hobby}</h2>
</m:forEach>
</body>
</html>