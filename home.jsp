<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
      .container { text-align:center;
            width: 250px;
             height:100px;
        
    }
    .contain{
     text-align:center;
            width: 250px;
             height:100px;
    }
      
</style>
</head>
<body>
<h1 style="text-align: center">HOME</h1>
<div class="contain">
<form action="/addComplain" >
     <select name="companyId">
        <c:forEach items="${companyList}" var="company">
            <option value="${company.getCompanyId()}">${company.getCompanyName()}</option>
        </c:forEach>
        </select>
    <br><br><br><br><br>
    <input type="submit" value="Add" />
</form>
</div>
 
</body>
</html>