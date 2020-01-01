<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body{
 background: url(https://images.all-free-download.com/images/graphiclarge/corridor_of_shopping_mall_591773.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
header {
text-align: center;
}
</style>
<title >Debit Card Application</title>
      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     <!-- jQuery library -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
     <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
  <h1 style="text-align:center;">Debit Card Application</h1>
  <hr>
  <div class="container">
    <form action="/addCustomer" > 
      <button type="submit"   class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> AddCustomer</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/addDebitCard">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> AddDebitCard</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/display">
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Display</button>
    </form>
  </div>
  
</body>
</html>