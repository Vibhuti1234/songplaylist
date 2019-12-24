<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Package Management System</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
  text-align: left;
}
</style>
</head>
<body style="background-color:LightGray">

    <form action="/getPackage" method="get" >
      <table style="color:DodgerBlue">
        
        <tr>
          <td>
          <label for="season" required>Season:</label>
          </td>
          <td><select name="season" id="season"  onchange="this.form.submit()">
            <option value="Summer">Summer</option>
            <option value="Autumn">Autumn</option>
             <option value="Winter">Winter</option>
             <option value="Rain">Rain</option>
             
     </select></td>
        </tr> 
  </table>
     <br>
     <br>
     <br>
     <br>
     <br>
      <!-- <button type="submit" value="Search">Search</button> -->
  </form>
  
   <br>
  <br>
  <br>
  
  <form action="/book">
  <table style="background-color:yellow">
  <tr>
    <th>Package Name</th>
    <th>Package Cost</th>
    <th>Package Duration</th>
    <th>Food Included</th> 
  </tr>
   <c:forEach var = "packages" items="${packageList}">
  <tr>
    <td><c:out value="${packages.getPackageName()}"/></td>
    <td><c:out value="${packages.getPackageCost()}"/></td>
    <td><c:out value="${packages.getPackageDuration()}"/></td>
    <td><c:out value="${packages.isFoodIncluded()}"/></td>
     <td><a href="http://localhost:8080/update?packageName=${packages.getPackageName()}">Update</a>
     </td> 
  </tr>
  </c:forEach>
  
</table>
<button type="submit" value="Book"> Book</button>
</form>
 </body>
 </html>
 