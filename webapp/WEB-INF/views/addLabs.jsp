<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<!-- <link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script> -->
<style>
header {
text-align: center;
}
</style>
<title >Add Lab</title>
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
<body>
  <h1>Add More Labs </h1>
  <hr>
  <div class="container">
    <form action="/addLab" method="post">
     <div class="form-group">
          <input type ="text" id="collegeName" name="collegeName" class="form-control" value="${collegeName}">
        </div>
        <div class="form-group">
        <label for="labName">Lab Name:</label>
          <input type ="text" id="labName" name="labName" class="form-control" placeholder="Enter Lab Name">
        </div>
        <br><br>
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Add</button>
    </form>
  </div>
  <br><br>
  <div class="container">
    <form action="/displayLab" method="get">
        <br><br>
      <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> DisplayLab</button>
    </form>
  </div>
  <br><br>
  <div class="container">
  <form action="/"  >
     <div class="form-group">
        <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Lab Id</th>
        <th>Lab Name</th>
      </tr>
    </thead>
   <c:forEach var = "lab" items="${labList}">
   <tbody>
      <tr>
       <td><c:out value="${lab.getLabId()}"/></td>
    <td><c:out value="${lab.getLabName()}"/></td>
    <td><c:out value="${packages.getPackageDuration()}"/></td>
    <td><c:out value="${packages.isFoodIncluded()}"/></td>
    <td><a href="http://localhost:8082/addStudent?labId=${lab.getLabId()}" class="btn btn-info" role="button">Add Student</a></td>
      </tr>
     </tbody>
      </c:forEach>
  </table>     
        </div>
         <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> AddCollege</button>
    </form>
  </div>
</body>
</html>