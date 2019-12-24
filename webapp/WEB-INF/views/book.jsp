<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Package Management System</title>
</head>
<body style="background-color:red">
<div class="form" style="background-color:blue">
    <form action="/addCustomer" method="post" >
      <table style="color:red">
        <tr>
          <td>
          <label for="phoneNumber" required>Customer Phone Number:</label>
          </td>
          <td><input type="text" id="phoneNumber" name="phoneNumber"  autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="customerName" required>Customer Name:</label>
          
          </td>
          <td><input type="text"  id="customerName" name="customerName" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="email" required>Customer Email:</label>
          </td>
          <td><input type="email" id="email" name="email" autocomplete="off"></td>
        </tr> 
        
         <tr>
          <td>
          <label for="packageName" required>Package Name:</label>
          </td>
          <td><input type="text" id="packageName" name="packageName" autocomplete="off"></td>
        </tr> 
        
  </table>
      <button type="submit" value="Book">Confirm</button>
  </form>
  </div>
 </body>
 </html>
 