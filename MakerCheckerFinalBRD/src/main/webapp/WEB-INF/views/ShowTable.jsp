<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.dao.entity.CustomerTemp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
  <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.css"/>
  <title>Customer List</title>
</head>
<body>
  <a href="addCustomer">Add new customer</a>
  <br>
  <br>
  <table border="1">
    <thead>
      <tr>
        <th>Customer Id</th>
        <th>Customer Code</th>
        <th>Name</th>
        <th>Address1</th>
        <th>Address2</th>
        <th>PinCode</th>
        <th>Email</th>
        <th>ContactNumber</th>
        <th>PrimaryContactPerson</th>
        <th>RecordStatus</th>
        <th>CreatedBy</th>
        <th>CreatedDate</th>
        <th>ModifiedBy</th>
        <th>ModifiedDate</th>
        <th>AuthorizedBy</th>
        <th>AuthorizedDate</th>
        <th>Update</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${customers}" var="customer">
        <tr>
          <td>${customer.cid}</td>
          <td>${customer.customerCode}</td>
          <td>${customer.customerName}</td>
          <td>${customer.address1}</td>
          <td>${customer.address2}</td>
          <td>${customer.pinCode}</td>
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
          <td><a href="updateCustomer?cid=${customer.cid}">Update</a></td>
          <td><a href="deleteCustomer?cid=${customer.cid}">Delete</a></td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>


