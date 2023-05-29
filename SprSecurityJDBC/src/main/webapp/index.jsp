<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title></head>
<body>
<h3>Home Page</h3>
	<p> Hello <b><sec:authentication property="principal.username"/> </b> <br>
      Roles: <b><sec:authentication property="principal.authorities" /></b>   </p>
    <form action="logout.html" method="post">
      <input type="submit" value="Logout" />
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</body>
</html>