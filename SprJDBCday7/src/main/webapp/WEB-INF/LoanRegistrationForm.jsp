<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>
<html>
 <head>
 <title>User Registration Form</title>
 <style>
 .error {
 color: red;
 }
 </style>
 </head>
 <body>
 <h1>User Registration Form</h1>
 <form:form action="AfterLoanRegistration"
modelAttribute="agreement">
 Agreement ID (*) : <form:input path="agreement_id"/>
 <br>
 Customer ID (*) : <form:input path="lessee_id"/>
 <br>
 Tenure (in Year) (*) : <form:input path="tenure"/>
 <br>
 ROI : <form:input path="roi"/>
 <br>
 Loan Amount (in INR) : <form:input path="loan_amount"/>
 <br>
 Repayment Frequency : <form:input
path="repayment_frequency"/>
 <br>
 Loan Disbursal Date : <form:input
path="loan_disbursal_date"/>
 <br>
 Status : <form:input path="status"/>
 <br>
 Product Code : <form:input path="product_code"/>
 <input type="submit" value="SUBMIT"/>
 <input type="reset" value="RESET"/>
 </form:form>
 </body>
</html>