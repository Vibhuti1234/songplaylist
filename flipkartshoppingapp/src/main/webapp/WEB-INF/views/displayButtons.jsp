<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>

body{
 background: url(https://bwregency.bc.ca/wp-content/uploads/2013/06/FreeGreatPicture.com-24621-hd-women-shopping.jpg);
  background-repeat: no-repeat;
  background-size:100%;

}
header {
text-align: center;
}
</style>
<title >Kalinga Shopping Cart</title>
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
  <h1 style="text-align:center;">Kalinga Shopping Cart</h1>
  <hr>
  <div class="container">
    <form action="/getShirts" method="get"> 
      <button type="submit"   class="btn btn-info btn-lg" name="brandId" id="brandId"  value="${brandId}"><span class="glyphicon glyphicon-log-in" ></span> Shirts</button>
    </form>
  </div>
  <br><br>
  
   <div class="container">
  <form action="/">
     <div class="form-group">
        <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Product Id</th>
        <th>Product Color</th>
        <th>Product Name</th>
        <th>Discount</th>
        <th>Price</th>
      </tr>
    </thead>
   <c:forEach var = "product" items="${productshirt}">
   <tbody>
      <tr>
       <td><c:out value="${product.getProductId()}"/></td>
      <td><c:out value="${product.getProductColor()}"/></td>
    <td><c:out value="${product.getProductName()}"/></td>
    <td><c:out value="${product.getDiscount()}"/></td>
    <td><c:out value="${product.getPrice()}"/></td>
      </tr>
     </tbody>
      </c:forEach>
  </table>     
        </div>
         <!-- <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in" onmouseover="this.style.backgroundColor='red';return true;"></span> HomePage</button>  -->
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/getJackets" method="get">
      <button type="submit"    class="btn btn-info btn-lg" ><span class="glyphicon glyphicon-log-in" ></span> Jackets</button>
    </form>
    </div>
    <br><br>
     <div class="container">
  <form action="/">
     <div class="form-group">
        <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Product Id</th>
        <th>Product Color</th>
        <th>Product Name</th>
        <th>Discount</th>
        <th>Price</th>
      </tr>
    </thead>
   <c:forEach var = "product" items="${productjacket}">
   <tbody>
      <tr>
       <td><c:out value="${product.getProductId()}"/></td>
      <td><c:out value="${product.getProductColor()}"/></td>
    <td><c:out value="${product.getProductName()}"/></td>
    <td><c:out value="${product.getDiscount()}"/></td>
    <td><c:out value="${product.getPrice()}"/></td>
      </tr>
     </tbody>
      </c:forEach>
  </table>     
        </div>
        <!--  <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in" onmouseover="this.style.backgroundColor='red';return true;"></span> Jacket</button>  -->
    </form>
  </div>
  <br><br>
 
  
</body>
</html>