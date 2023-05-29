<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add/Update Customer Master</title>

<style>
.error {
color: #EF1313;
font-style: italic;
}
</style>

</head>

<body>
<form:form action="updateCustomerMaster" method="post" modelAttribute="customerBean" >
   <input type="hidden" name="cid" value="${customerBean.cid}">

	Customer Code:<input type="text" id="customerCode" name="customerCode" value="${customerBean.customerCode}" readonly>
	</br>

	Name:<input type="text" id="customerName" name="customerName" value="${customerBean.customerName}">
	<form:errors class="error" path="customerName" />
	</br>

	Address1:<input type="text" id="address1" name="address1" value="${customerBean.address1}">
	<form:errors class="error" path="address1" />
	</br>

    Address2:<input type="text" id="address2" name="address2" value="${customerBean.address2}">
    <form:errors class="error" path="address2" />
    </br>

	Email:<input type="text" id="email" name="email" value="${customerBean.email}">
	<form:errors class="error" path="email" />
	</br>

	Contact Number:<input type="text" id="contactNumber" name="contactNumber" value="${customerBean.contactNumber}">
	<form:errors class="error" path="contactNumber" />
	</br>

	Primary Contact Person:<input type="text" id="primaryContactPerson" name="primaryContactPerson" value="${customerBean.primaryContactPerson}"
	<form:errors class="error" path="primaryContactPerson" />
	</br>
	<input type ="Submit"/>
</form:form>
</body>
</html>