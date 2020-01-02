<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#a{text-align:center;
color:blue;
}
body{
 background: url(http://www.goodmorningimagesforlover.com/wp-content/uploads/2018/09/oxford-images.jpg);
  background-repeat: no-repeat;
  background-size:100%;
}
header {
text-align: center;

}
</style>
<title  class="text-primary">Display Details</title>
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
  <h1 style="text-align:center;"  class="text-primary">Display Details</h1>
  <hr>
  <div class="container">
    <form action="/displayBranches" method="get">
      <div class="form-group">
     <h3> <label for="collegeId"  class="text-primary">College:</label></h3>
      <select class="form-control" id="collegeId" name="collegeId" onchange="this.form.submit()">
             <option selected="selected">Select</option>
        <c:forEach items="${colleges}" var="college">
            <option value="${college.getCollegeId()}">${college.getCollegeName()}</option>
        </c:forEach>
      </select>
      </div>
      <br><br>
     
    </form>
  </div>
   <div class="container">
  <form action="/">
     <div class="form-group"> 
        <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Branch Name</th>
        <th>Branch Strength</th>
        <th>HOD Name</th>
         <th>Update</th>
      </tr>
    </thead>
     <c:set var="total" value="${0}"/>
          <c:forEach var ="branch" items = "${branches}">
              <tbody>
                <tr> 
                <c:set var="total" value="${total + branch.getBranchStrength()}" />
                    <td><c:out value="${branch.getBranchName()}"/></td>
                     <td><c:out value="${branch.getBranchStrength()}"/></td>
                     <td><c:out value="${branch.getHodName()}"/></td>
                      <td><a href="http://localhost:8086/update?branchId=${branch.getBranchId()}" class="btn btn-info" role="button">Update</a></td>
                </tr>
              </tbody>
           </c:forEach> 
  </table>  
<h1 id="a">Total Strength:${total}</h1> 
  <br><br>
        </div>
         <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in" onmouseover="this.style.backgroundColor='red';return true;"></span> HomePage</button> 
    </form>
  </div>
</body>
</html> 