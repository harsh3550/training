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
 <form:form action="Form" modelAttribute="user">
 USER ID (*) : <form:input path="user_Id"/>
 <form:errors path="user_Id" cssClass="error"/>
 <br>
 USER NAME (*) : <form:input path="user_Name"/>
 <form:errors path="user_Name" cssClass="error"/>
 <br>
 PASSWORD (*) : <form:password path="password"/>
 <form:errors path="password" cssClass="error"/>
 <br>
 DOB : <form:input path="date" type="date"/>
 <form:errors path="date" cssClass="error"/>
 <br>
 GENDER (*) :
 Male : <form:radiobutton path="gender"
value="Male"/>
 Female : <form:radiobutton path="gender"
value="Female" />
 <form:errors path="gender" cssClass="error"/>
 <br>
 AGE (*) : <form:input path="age"/>
 <form:errors path="age" cssClass="error"/>
 <br>
 HOBBIES (*) :
 Video Games<form:checkbox path="hobby" value="Video
Games"/>
 E-Sports<form:checkbox path="hobby" value="E-Sports"/>
 Coding<form:checkbox path="hobby" value="Coding"/>
 <form:errors path="hobby" cssClass="error"/>
 <br>
 PREFERRED HOLIDAY DESTINATION (*) : <form:select
path="preferredHolidayLocation">
 <form:option value="Murmudoma"></form:option>
 <form:option value="Bagunhatu"></form:option>
 <form:option value="Honululu"></form:option>
 </form:select>
 <form:errors path="preferredHolidayLocation"
cssClass="error"/>
 <br>
 <input type="submit" value="SUBMIT"/>
 <input type="reset" value="RESET"/>
 </form:form>
 </body>
</html>