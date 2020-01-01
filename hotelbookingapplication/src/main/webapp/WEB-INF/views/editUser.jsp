<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Hotel Management System</title>
</head>
<body style="background-color:red">
<div class="form" style="background-color:blue">
    <form action="/updateCustomer" method="post">
      <table style="color:red">
        <tr>
          <td>
          <label for="userName" required>Customer Name:</label>
          </td>
          <td><input id="userName" name="userName"  value="${user.getUserName()}" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="phoneNumber" required>Customer Phone Number:</label>
          
          </td>
          <td><input type="text" id="phoneNumber" name="phoneNumber" value="${user.getPhoneNumber()}" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="checkInDate" required>Check In Date:</label>
          </td>
          <td><input type="date" id="checkInDate" name="checkInDate" value="${user.getCheckInDate()}" autocomplete="off"></td>
        </tr> 
         <tr>
          <td>
          <label for="checkOutDate" required>Check Out Date:</label>
          </td>
          <td><input type="date" id="checkOutDate" name="checkOutDate" value="${user.getCheckOutDate()}"autocomplete="off"></td>
        </tr> 
        <tr>
          <td>
          <label for="roomType" required>Room Type:</label>
          </td>
          <td><select name="roomType" id="roomType" >
            <option value="${user.getRoomType()}" selected>${user.getRoomType()}</option> 
            <option value="Budget">Budget</option>
            <option value="Luxury">Luxury</option>
             <option value="Semi Luxury">Semi Luxury</option>
     </select></td>
        </tr> 
        <tr>
          <td>
          <label for="hobbies" required>Customer Hobbies:</label>
          </td>
          <td>
              <input  type="checkbox" name="hobbies" id="hobbies" value="Movies" <c:if test="${user.getHobbies().contains('Movies')}">checked</c:if>>Movies </input>
              <input type="checkbox" name="hobbies" id="hobbies" value="Travelling" <c:if test="${user.getHobbies().contains('Travelling')}">checked</c:if>>Travelling </input>
              <br><br>
              <input type="checkbox" name="hobbies" id="hobbies" value="Fishing" <c:if test="${user.getHobbies().contains('Fishing')}">checked</c:if>>Fishing </input>
              <input type="checkbox" name="hobbies" id="hobbies" value="Reading" <c:if test="${user.getHobbies().contains('Reading')}">checked</c:if>>Reading </input>
          </td>
        </tr>
        <tr>
        <td>
          <label for="gender" required>Gender:</label>
          </td>
          <td>
       <input type="radio" id="gender" name="gender" value="Male" <c:if test="${user.getGender().contains('Male')}">checked</c:if>>Male<br>
       <input type="radio"  id="gender" name="gender" value ="Female" <c:if test="${user.getGender().contains('Female')}">checked</c:if>>Female<br>
        </td>
        </tr>
 <tr>
 <td> 
    <label for="comment">Add Comments:</label>
 </td>
 <td>
   <textarea id="comment" name="comment" maxlength="1000" cols="36" rows="4"  placeholder="${user.getComment()}"></textarea>
   
</td>
</tr>
  <tr>
  <td>
        <label for="userEmail">Customer Email:</label>
  
  </td>
  <td>
  <input type="email" name="userEmail" id="userEmail" value="${user.getUserEmail()}" >
  
  </td>
  </tr>
  </table>
      <button type="submit" value="Update">Update</button>
  </form>
  </div>
 </body>
 </html>
 