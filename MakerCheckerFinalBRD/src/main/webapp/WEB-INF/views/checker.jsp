<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.dao.entity.CustomerTemp"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.css"/>

  <script>
  $(document).ready( function () {
      $('#myTable').DataTable();
  } );
  </script>
<head>
<br>
<br>
<a href="#"><button class="btn btn-secondary">Home</button></a>
<div style="margin-top:10px">
<c:url var="logout" value="/logout"></c:url>
<form:form action="${logout }"  method ="post">
<div ><class="btn btn-primary" input type="submit" value="logout">
<div><button input type="submit" value="logout" class="btn btn-primary">Logout</button></a></div>
</form:form>
</div>
</div>
</div>
<br>
<br>
<br>


<table id="myTable" border=1>
    <thead>
    <tr>
        <th>Customer Code</th>
        <th>Name</th>
        <th>Address1</th>
        <th>Address2</th>
        <th>Email</th>
        <th>ContactNumber</th>
        <th>PrimaryContactPerson</th>
        <th>RecordStatus</th>
        <th>CreatedBy</th>
        <th>CreatedDate</th>
        <th>ModifiedDate</th>
        <th>ModifiedBy</th>

        <th>Approve</th>
        <th>Reject</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${newRegisterCustomerList}" var="customer">
        <tr>
            <td>${customer.customerCode} </td>
            <td>${customer.customerName}</td>
            <td>${customer.address1}</td>
            <td>${customer.address2}</td>
            <td>${customer.email}</td>
            <td>${customer.contactNumber}</td>
            <td>${customer.primaryContactPerson}</td>
            <td>${customer.recordStatus}</td>
            <td>${customer.createdBy}</td>
            <td>${customer.createDate}</td>
            <td>${customer.modifiedDate}</td>
            <td>${customer.modifiedBy}</td>

            <td><a href="approveCustomer?cid=<c:out value="${customer.cid}"/>&status=<c:out value="${customer.recordStatus}"/>"><button class="btn btn-secondary">Approve</button></a></td>
            <td><a href="rejectCustomer?cid=<c:out value="${customer.cid}"/>&status=<c:out value="${customer.recordStatus}"/>"><button class="btn btn-secondary">Reject</button></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</head>
</html>