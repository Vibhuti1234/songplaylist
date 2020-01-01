<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Hotel Management System</title>
</head>
<body style="background-color:red">
<div class="form" style="background-color:blue">
    <form action="/bookUser" method="post" >
      <table style="color:red">
        <tr>
          <td>
          <label for="userName" required>Customer Name:</label>
          </td>
          <td><input id="userName" name="userName"  autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="phoneNumber" required>Customer Phone Number:</label>
          
          </td>
          <td><input type="text" id="phoneNumber" name="phoneNumber" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="checkInDate" required>Check In Date:</label>
          </td>
          <td><input type="date" id="checkInDate" name="checkInDate" autocomplete="off"></td>
        </tr> 
         <tr>
          <td>
          <label for="checkOutDate" required>Check Out Date:</label>
          </td>
          <td><input type="date" id="checkOutDate" name="checkOutDate" autocomplete="off"></td>
        </tr> 
        <tr>
          <td>
          <label for="roomType" required>Room Type:</label>
          </td>
          <td><select name="roomType" id="roomType">
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
              <input type="checkbox" name="hobbies" id="hobbies" value="Movies">Movies </input>
              <input type="checkbox" name="hobbies" id="hobbies" value="Travelling" >Travelling </input><br><br>
              <input type="checkbox" name="hobbies" id="hobbies" value="Fishing">Fishing </input>
              <input type="checkbox" name="hobbies" id="hobbies" value="Reading" >Reading </input>
          </td>
        </tr>
        <tr>
        <td>
          <label for="gender" required>Gender:</label>
          </td>
          <td>
       <input type="radio" id="gender" name="gender" value="Male">Male<br>
       <input type="radio"  id="gender" name="gender" value ="Female">Female<br>
        </td>
        </tr>
 <tr>
 <td> 
    <label for="comment">Add Comments:</label>
 </td>
 <td>
   <textarea id="comment" name="comment" maxlength="1000" cols="36" rows="4">
   </textarea>
</td>
</tr>
  <tr>
  <td>
        <label for="userEmail">Customer Email:</label>
  
  </td>
  <td>
  <input type="email" name="userEmail" id="userEmail" >
  
  </td>
  </tr>
  
   
  </table>
      <button type="submit" value="Book">Click To Book a Customer</button>
  </form>
  </div>
 </body>
 </html>
 