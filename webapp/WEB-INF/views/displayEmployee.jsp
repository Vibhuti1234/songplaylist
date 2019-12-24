<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
<style>
table, th, td {
  border: 1px solid b
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>
</head>
<body style="background-color:red">
  <h1 style="text-align:center;color:SlateBlue;font-size: 250%">Employee Details</h1>
  <hr>

  <form action="/">
  <table style="background-color:yellow">
  <tr>
    <th>Employee Id</th>
    <th>First Name</th>
    <th>Last Name</th> 
     <th>Date Of Birth</th> 
     <th>Department Id</th>
  </tr>
   <c:forEach var = "employee" items="${listEmployee}">
  <tr>
    <td><c:out value="${employee.getEmployeeId()}"/></td>
    <td><c:out value="${employee.getFirstName()}"/></td>
    <td><c:out value="${employee.getLastName()}"/></td>
    <td><c:out value="${employee.getDateOfBirth() }"/></td>
     <td><c:out value="${employee.getDepartment().getDepartmentName()}"/></td>
    </td>
  </tr>
  </c:forEach>
  
</table>
<button type="submit" value="Display">Back:</button>
</form>
</body>
</html>