<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee Details</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body style="background-color:red">
<div class="form" style="background-color:blue">
    <form action="/addEmployee" method="post">
      <table style="color:red">
        <tr>
          <td>
          <label for="firstName" required>Employee First Name:</label>
          </td>
          <td><input id="firstName" name="firstName"  autocomplete="off"></td>
        </tr>
        <tr>
          <td>
          <label for="lastName" required>Employee Last Name:</label>
          </td>
          <td><input id="lastName" name="lastName"  autocomplete="off"></td>
        </tr>
        
        <tr>
          <td>
          <label for="dateOfBirth" required>Date Of Birth:</label>
          </td>
          <td><input type="date" id="dateOfBirth" name="dateOfBirth" autocomplete="off"></td>
        </tr> 
         <tr>
          <td>
          <label for="departmentName" required>Employee Department:</label>
          </td>
          <td><input type="text" id="departmentName" name="departmentName" autocomplete="off"></td>
        </tr> 
  </table>
      <button type="submit" value="Add">Click To Add a Employee</button>
  </form>
  </div>
 <div >
<form action="/displayEmployee" method="get">
<button type="submit" value="Display">Display</button>
</form>
</div>
 <script type="text/JavaScript">
    var check;
    $(document).ready(function (){
   
        var firstName_err=true;
        var lastName_err=true;
        var departmentName_err=true;
        $('#firstName').keyup(function()
        { 
          firstName_check();
        }); 
        function firstName_check(){
            var firstName_val=$('#firstName').val();
            var name_regex = /^[a-zA-Z]+$/;
            if(!firstName_val.match(name_regex)){
                alert("Invalid First Name");
                return false;
            }
            else{
                return true;
            }
            
        }
        $('#lastName').keyup(function()
        { 
          lastName_check();
        }); 
        function lastName_check(){
            var name_regex = /^[a-zA-Z]+$/;
            var lastName_val=$('#lastName').val();
            if(!lastName_val.match(name_regex)){
              alert("Invalid Last Name");
                return false;
            }
            else{
              return true;
            }
        }
        $('#dateOfBirth').on('change',function()
                { 
                  dob_check();
                }); 
                function dob_check(){
                    var date_val=$('#dateOfBirth').val();
               		//console.log(date_val)
                     var d = new Date(date_val);
                     var dt = new Date(Date.now())
                     //alert();
                    var age = parseInt(dt.getFullYear())- parseInt(d.getFullYear());
                    console.log(age)
                       if(age<23){
                    	    	alert("invalid date of Birth");
                            return false;
                    	         }
                    	    else{
                    	    	  return true;
                    	    }  
                   
                      } 
        $('#departmentName').keyup(function()
                { 
                  department_check();
                }); 
                function department_check(){
                    var name_regex = /^[a-zA-Z]+$/;
                    var department_val=$('#departmentName').val();
                    if(!department_val.match(name_regex)){
                      alert("Invalid Department Name");
                        return false;
                    }
                    else{
                      return true;
                    }
                }

    });</script>

 </body>
 </html>
 