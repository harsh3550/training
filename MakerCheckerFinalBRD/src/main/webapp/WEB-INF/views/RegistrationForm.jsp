<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add/Update Customer</title>

<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>
</head>

<body>
<form:form action="addCustomer" method="post" modelAttribute="customer">
<form:hidden path="cid"/>

	<div class="mb-3">
	<div class="col-md-4">
      <label for="customerCode" class="form-label">Customer Code</label>

      <input type="text" class="form-control" id="customerCode" name = "customerCode" placeholder="Enter Customer Code:">
      <form:errors class="error" path="customerCode" />
      </div>
      <br>
      <div class="col-md-4">
      <label for="customerName" class="form-label">Name</label>
                <input type="text" class="form-control" id="customerName" name = "customerName" placeholder="Enter Customer Name:">
                <form:errors class="error" path="customerName" />
                </div>
    </div>
    <br>
    <div class="col-md-4">
          <label for="address1" class="form-label">Address1</label>
                    <input type="text" class="form-control" id="address1" name = "address1" placeholder="Enter Address1:">
                    <form:errors class="error" path="address1" />
                    </div>
        </div>
<br>
        <div class="col-md-4">
                  <label for="address2" class="form-label">Address2</label>
                            <input type="text" class="form-control" id="address2" name = "address2" placeholder="Enter Address2:">
                            <form:errors class="error" path="address2" />
                            </div>
                </div>
<br>
        <div class="col-md-4">
                  <label for="email" class="form-label">Email</label>
                            <input type="text" class="form-control" id="email" name = "email" placeholder="Enter Email address:">
                            <form:errors class="error" path="email" />
                            </div>
                </div>
<br>
     <div class="col-md-4">
                    <label for="contactNumber" class="form-label">Contact Number</label>
                                <input type="text" class="form-control" id="contactNumber" name = "contactNumber" placeholder="Enter Contact Number:">
                                <form:errors class="error" path="contactNumber" />
                                </div>
                    </div>
<br>
       <div class="col-md-4">
                          <label for="primaryContactPerson" class="form-label">Primary Contact Person</label>
                                      <input type="text" class="form-control" id="primaryContactPerson" name = "primaryContactPerson" placeholder="Primary Contact Person:">
                                      <form:errors class="error" path="primaryContactPerson" />
                                      </div>
                          </div>

<br>

	<input class="btn btn-secondary" type ="submit" value="Submit">
	<br>
	<br>
	<div class="col-sm-10"><button class="btn btn-primary"><a href="maker" style="text-decoration:none;color:white">Back</a></button></div>
</form:form>
</body>
</html>