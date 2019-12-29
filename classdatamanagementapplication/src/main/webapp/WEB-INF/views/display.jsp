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
<title >Add Students</title>
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
    <form action="/displayStudents" method="get">
        <div class="form-group">
      <label for="classId">Section:</label>
      <select class="form-control" id="classId" name="classId"  onchange="this.form.submit()">
        <option selected="selected">Select</option>
        <c:forEach items="${classes}" var="classes">
            <option value="${classes.getClassId()}">${classes.getSection()}</option>
        </c:forEach>
      </select>
      </div>
      <!-- <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> Display</button> -->
    </form>
  </div>
  <br><br><br><br><br><br> 
   <div class="container">
  <form action="/"  >
     <div class="form-group">
        <table class="table table-dark table-hover">
    <thead>
      <tr>
        <th>Student Id</th>
        <th>Student Name</th>
        <th>Date Of Birth</th>
         <th>Age</th>
        
      </tr>
    </thead>
   <c:forEach var = "student" items="${students}">
   <tbody>
      <tr>
       <td><c:out value="${student.getStudentId()}"/></td>
    <td><c:out value="${student.getStudentName()}"/></td>
    <td><c:out value="${student.getDateOfBirth()}"/></td>
    <td><c:out value="${student.getAge()}"/></td>
      </tr>
     </tbody>
      </c:forEach>
  </table>     
        </div>
         <button type="submit"   class="btn btn-info btn-lg"><span class="glyphicon glyphicon-log-in"></span> HomePage</button> 
    </form>
  </div>
</body>
</html>