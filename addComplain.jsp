<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Complain Form</title>
</head>
<body>
  <h1>Spring Boot - MVC web application example</h1>
  <hr>

  <div class="form">
    <form action="/addComplain" method="post">
      <table>
      <tr>
          <td>Enter The Complain Name</td>
          <td><input  id="complainName" name="complainName"></td>
        </tr>
        <tr>
          <td>Enter The Complain Description</td>
          <td><input  id="description" name="description"></td>
        
        </tr>
        <tr>
          <td>Enter The Status</td>
          <td><select name="status">
            <option value="Open">Open</option>
            <option value="Pending">Pending</option>
             <option value="Closed">Closed</option>
     </select></td></tr>
      </table>
      <input type="submit" value="AddUser">Click To Add User
    </form>
  </div>

</body>
</html>