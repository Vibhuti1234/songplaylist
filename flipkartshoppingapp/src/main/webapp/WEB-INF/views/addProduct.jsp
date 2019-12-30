<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<style>
header {
text-align: center;
}
</style>
<title >Add Brands</title>
       <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js" integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
        crossorigin="anonymous"></script>
     <!--  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
     jQuery library
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    Latest compiled JavaScript
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
</head>
<body>
  <h1 style="text-align:center;">Add Students</h1>
  <hr>
  <div class="container">
    <form action="/addProducts" method="post">
     <div class="form-group">
        <label for="productName">Product Name:</label>
          <input type ="text" id="productName" name="productName" class="form-control" placeholder="Enter Product Name">
        </div>
        <div class="form-group">
        <label for="productColor">Product  Color:</label>
          <input type ="text" id="productColor" name="productColor" class="form-control" placeholder="Enter Product Color">
        </div>
         <div class="form-group">
        <label for="discount">Product  Discount:</label>
          <input type ="number" id="discount" name="discount" class="form-control" placeholder="Enter Discount" min="5" max="10">
        </div>
        <div class="form-group">
        <label for="productType">Product  Discount:</label>
          <input type ="text" id="productType" name="productType" class="form-control" placeholder="Enter Product Type"  >
        </div>
         <div class="form-group">
        <label for="price">Product  Price:</label>
          <input type ="number" id="price" name="price" class="form-control" placeholder="Enter Price" min="100" max="10000">
        </div>
        <div class="form-group">
      <label for="brandId">Brand:</label>
      <select class="form-control" id="brandId" name="brandId">
             <option selected="selected">Select</option>
        <c:forEach items="${brands}" var="brand">
            <option value="${brand.getBrandId()}">${brand.getBrandName()}</option>
        </c:forEach>
      </select>
      </div>
        <br><br>
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Add</button>
    </form>
  </div>
    <script> $('form').validate({
            rules: {
            	productName: {
                    required: true,
                    lettersonly: true,
                    minlength:5,
                    maxlength: 10
                },

                productColor: {
                    required:true,
                    lettersonly: true,
                    minlength:5,
                    maxlength: 10
                   
                },
                discount: {
                    required:true 
                },
                price: {
                    required:true 
                },
                brandId: {
                    required:true 
                }
                
            }

           /*  messages: {
                teacherName: "Please Give Letters Only."
            } */

        });
    </script>
  
</body>
</html>