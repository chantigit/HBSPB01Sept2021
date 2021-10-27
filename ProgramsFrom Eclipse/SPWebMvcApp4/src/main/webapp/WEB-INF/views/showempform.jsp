<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employee Data:</h1>
<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
	</tr>
	<tr>
		<td>${emp.id}</td>
		<td>${emp.name}</td>
		<td>${emp.salary}</td>
		<td>${emp.designation}</td>
	</tr>
</table>
