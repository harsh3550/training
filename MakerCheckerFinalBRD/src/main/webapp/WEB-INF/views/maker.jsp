<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.dao.entity.CustomerTemp"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

  <script>
  $(document).ready( function () {
      $('#myTable').DataTable();
  } );

  $(document).ready( function () {
        $('#myTable1').DataTable();
    } );
  </script>
<head>
<br>
<div class="container">
<div class="row">
<div class="col-sm-10"><a href="addCustomer"><button class="btn btn-secondary">Add new customer</button></a></div>
<div class="col-sm-1"><a href="#"><button class="btn btn-secondary">Home</button></a></div>
<br>
<div style="margin-top:10px">

<c:url var="logout" value="/logout"></c:url>
<form:form action="${logout }"  method ="post">
<div ><class="btn btn-primary" input type="submit" value="logout">
<div class="col-sm-1"><button input type="submit" value="logout" class="btn btn-primary">Logout</button></a></div>
</form:form>

</div>
</div>
</div>

<br>
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
         <th>AuthorizedDate</th>
        <th>AuthorizedBy</th>
        <th>update</th>
        <th>delete</th>

    </tr>
    </thead>


    <tbody>
    <c:forEach items="${ListOfCustomerFromTempTable}" var="customer">
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
            <td>${customer.authorizedDate}</td>
            <td>${customer.authorizedBy}</td>

            <td><a href="updateCustomer?cid=${customer.cid}"><button class="btn btn-secondary">Update</button></a></td>
            <td><a href="deleteCustomer?cid=${customer.cid}"><button class="btn btn-secondary">Delete</button></a></td>

        </tr>
    </c:forEach>
    <c:forEach items="${ListOfCustomerFromMasterTable}" var="customer">
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
                    <td>${customer.authorizedDate}</td>
                    <td>${customer.authorizedBy}</td>

                    <td><a href="updateCustomerMaster?cid=${customer.cid}"><button class="btn btn-secondary">Update</button></a></td>
                    <td><a href="deleteCustomerMaster?cid=${customer.cid}"><button class="btn btn-secondary">Delete</button></a></td>

                </tr>
            </c:forEach>
    </tbody>
</table>

</head>
</html>