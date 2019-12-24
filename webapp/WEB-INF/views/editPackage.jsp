<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Hotel Management System</title>
</head>
<body style="background-color:LightGray">
<div class="form" style="background-color:blue">
    <form action="/updatePackage" method="post">
      <table style="color:red">
        <tr>
          <td>
          <label for="packageName" required>Package Name:</label>
          </td>
          <td><input id="packageName" name="packageName"  value="${pack.getPackageName()}" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="season" required>Season:</label>
          </td>
          <td><select name="season" id="season" >
            <option value="${pack.getSeason()}" selected>${pack.getSeason()}</option> 
            <option value="Winter">Winter</option>
            <option value="Autumn">Autumn</option>
            <option value="Summer">Summer</option>
             <option value="Rain">Rain</option>
     </select></td>
        </tr> 
        <tr>
          <td>
          <label for="packageCost" required>Package Cost:</label>
          
          </td>
          <td><input type="number" step="any" id="packageCost" name="packageCost" value="${pack.getPackageCost()}" autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="packageDuration" required>Package Duration:</label>
          </td>
          <td><input type="text" id="packageDuration" name="packageDuration" value="${pack.getPackageDuration()}" autocomplete="off"></td>
        </tr> 
         <tr>
          <td>
          <label for="foodIncluded" required>Food Included:</label>
          </td>
          <td><input type="text" id="foodIncluded" name="foodIncluded" value="${pack.isFoodIncluded()}"autocomplete="off"></td>
        </tr> 
  </table>
      <button type="submit" value="Update">Update</button>
  </form>
  </div>
 </body>
 </html>
 