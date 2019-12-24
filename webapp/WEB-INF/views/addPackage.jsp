<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Package Management System</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form action="/addPackage" method="post" >
          <div class="form-group">
          <label for="packageName" required>Package Name:</label>
          <input id="packageName" name="packageName" class="form-control" placeholder="Enter Package Name" autocomplete="off">
           </div>
           <div class="form-group">
          <label for="packageCost" required>Package Cost:</label>
          <input type="number" step="any" class="form-control" id="packageCost" name="packageCost" placeholder="Enter Package Cost"autocomplete="off">
          </div>
          <div class="form-group">
          <label for="packageDuration" required>Package Duration:</label>
          <input type="text" class="form-control" id="packageDuration" name="packageDuration" placeholder="Enter Package Duration"autocomplete="off">
           </div>
           <div class="form-group">
          <label for="foodIncluded" required>Food Included:</label>
          <input type="text" class="form-control" id="foodIncluded" name="foodIncluded"  autocomplete="off">
            </div>
            <div class="form-group">
          <label for="season" required>Season:</label>
          <select name="season" id="season">
            <option value="Summer">Summer</option>
            <option value="Autumn">Autumn</option>
             <option value="Winter">Winter</option>
             <option value="Rain">Rain</option>  
         </select>
      </div>
      <br>
      <br>
      <br>
      <button type="submit" value="Add" class="btn btn-info">Click To Add a Package</button>
  </form>
  </div>
 </body>
 </html>
 