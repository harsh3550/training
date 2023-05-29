<%@ page contentType="text/html;charset=UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
  <title>Spring MVC Hello World</title>
</head>

<body>
  <h2><spring:message code="lbl.page2" /></h2>

  <table border="1">
    <tr>
      <th><spring:message code="lbl.Id2" text="Employee Id" /></th>
      <th><spring:message code="lbl.firstName2" text="First Name" /></th>
      <th><spring:message code="lbl.lastName2" text="Last Name" /></th>
    </tr>
    <c:forEach items="${employees}" var="employee">
      <tr>
        <td>${employee.id}</td>
        <td>${employee.firstName}</td>
        <td>${employee.lastName}</td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
