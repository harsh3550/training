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
 <form:form action="AfterRegistration"
modelAttribute="customer">
 Customer ID (*) : <form:input path="customer_id"/>
 <br>
 Customer First Name (*) : <form:input
path="first_name"/>
 <br>
 Customer Last Name (*) : <form:input path="last_name"/>
 <br>
 GENDER : <form:input path="gender"/>
 <br>
 DOB : <form:input path="date_of_birth"/>
 <br>
 Contact Number (*) : <form:input path="contact_number"/>
 <br>
 Email Address : <form:input path="email_address"/>
 <br>
 Monthly Income : <form:input path="monthly_income"/>
 <br>
 Profession : <form:input path="profession"/>
 <br>
 Total Monthly Expense : <form:input
path="total_monthly_expense"/>
 <br>
 Designation : <form:input path="designation"/>
 <br>
 Company Name : <form:input path="company_name"/>
 <br>
 <input type="submit" value="SUBMIT"/>
 <input type="reset" value="RESET"/>
 </form:form>
 </body>
</html>