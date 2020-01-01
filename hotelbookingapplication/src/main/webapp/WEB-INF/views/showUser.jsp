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
  <h1 style="text-align:center;color:SlateBlue;font-size: 250%">Booking Details</h1>
  <hr>
<form action="/displayUser"  method="get" >
 <table style="background-color:DodgerBlue">
  <tr>
  <td>
      <label for="roomType" required>Enter Room Type:</label>
   </td>
          <td><select name="roomType" id="roomType" onchange="this.form.submit()">
          
            <option value="Budget">Budget</option>
            <option value="Luxury">Luxury</option>
             <option value="Semi Luxury">Semi Luxury</option>
     </select></td>
  </tr>
  </table>
<!--   <button type="submit" value="Search">Search</button>
 -->  </form>
  <br>
  <br>
  <br>
  <form action="/">
  <table style="background-color:yellow">
  <tr>
    <th>Customer Name</th>
    <th>Check In Date</th>
    <th>Room Type</th> 
     <th>Customer Email</th> 
  </tr>
   <c:forEach var = "user" items="${listUser}">
  <tr>
    <td><c:out value="${user.getUserName()}"/></td>
    <td><c:out value="${user.getCheckInDate()}"/></td>
    <td><c:out value="${user.getRoomType()}"/></td>
    <td><c:out value="${user.getUserEmail()}"/></td>
    <td><a href="http://localhost:8080/update?userEmail=${user.getUserEmail()}">Update</a>
    </td>
  </tr>
  </c:forEach>
  
</table>
<button type="submit" value="Back">Back</button>
</form>
</body>
</html>