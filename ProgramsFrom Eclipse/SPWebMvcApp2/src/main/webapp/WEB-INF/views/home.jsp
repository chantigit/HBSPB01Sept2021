<%@ taglib prefix="myform" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>

	<h2>Welcome to Spring Web Mvc</h2>
	<h1>Student SPTL Form</h1>
	<myform:form action="url4" modelAttribute="student">  
        First name: 	<myform:input path="firstName" />
		<br>
		<br>  
        Last name: 		<myform:input path="lastName" />
		<br>
		<br>  
        City: 			<myform:input path="city" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</myform:form>

	<a href="url1">View1</a>

	<hr>

	<form action="url2">
		Person Name: <input type="text" name="personName"><br> <br>
		Person Age: <input type="number" name="personAge"><br> <br>
		Person City: <input type="text" name="personCity"><br> <br>
		<input type="submit" value="Send">
	</form>
	<hr>
	<br>
	<form action="url3">
		Employee Name: <input type="text" name="empName"><br> <br>
		Employee Age: <input type="number" name="empAge"><br> <br>
		Employee City: <input type="text" name="empCity"><br> <br>
		<input type="submit" value="Send">
	</form>
	<hr>

</body>
</html>
