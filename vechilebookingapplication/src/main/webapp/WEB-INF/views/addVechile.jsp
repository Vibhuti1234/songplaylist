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
<title >Add Vechiles</title>
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
  <h1 style="text-align:center;">Add Vechiles</h1>
  <hr>
  <div class="container">
    <form action="/addVechiles" method="post">
      <div class="form-group">
      <label for="userId">User:</label>
      <select class="form-control" id="userId" name="userId">
             <option selected="selected">Select</option>
        <c:forEach items="${users}" var="user">
            <option value="${user.getUserId()}">${user.getUserName()}</option>
        </c:forEach>
      </select>
      </div>
      <br><br>
     <div class="form-group">
        <label for="vechileName">Vechile Name:</label>
          <input type ="text" id="vechileName" name="vechileName" class="form-control" >
        </div>
        <div class="form-group">
        <label for="vechileState">Vechile State:</label>
          <input type ="text" id="vechileState" name="vechileState" class="form-control" >
        </div>
       
      <div class="form-group">
        <label for="vechileCountry">Vechile Country:</label>
          <input type ="text" id="vechileCountry" name="vechileCountry" class="form-control" >
        </div>
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Add</button>
    </form>
  </div>
  <!-- <script>
  function DateValidate() {
	    // The function returns the product of p1 and p2
	  var expiryDate = document.getElementById("expiryDate").value;
	  var today = new Date(); // gets the current date
	  var today_mm = today.getMonth() + 1; // extracts the month portion
	  var today_yy = today.getFullYear() % 100; // extracts the year portion and changes it from yyyy to yy format

	  if(today_mm < 10) { // if today's month is less than 10
	      today_mm = '0' + today_mm // prefix it with a '0' to make it 2 digits
	  } 

	  var mm = expiryDate.substring(0, 2); // get the mm portion of the expiryDate (first two characters)
	  var yy = expiryDate.substring(3); // get the yy portion of the expiryDate (from index 3 to end)

	  if (yy > today_yy || (yy == today_yy && mm >= today_mm)) {
	     // all good because the yy from expiryDate is greater than the current yy
	     // or if the yy from expiryDate is the same as the current yy but the mm
	     // from expiryDate is greater than the current mm
	     return true;
	  }
	  else
	  {
	     alert("The expiry date needs to be greater than today.\n");
	     return false;
	  }
	}
  </script> -->
    <script> $('form').validate({
    	rules: {
    		vechileName: {
    			required: true,
                alphanumeric: true,
                rangelength: [5, 15]
                },
                vechileState: {
                    required:true,
                    lettersonly:true,
                    rangelength: [5, 10]   
                },
                vechileCountry:{
                	required:true,
                    lettersonly:true,
                    rangelength: [5, 10]  
                }
            },
             messages: {
            	 vechileName: "Please Give Letters And Numbers  Only."
            } 
        });
    </script>
  
</body>
</html>