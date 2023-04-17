<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp" %>
<title>Insert title here</title>
<!-- ----------------------Styling------------------------------ -->
<style type="text/css">
    body{
   background: rgb(2,0,36);
    background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(89,89,177,1) 35%, rgba(0,212,255,1) 100%);
    margin-top:5%
    }
</style>

</head>
<!-- ---------------------Main Body----------------------- -->
<body >
    <div class="container mt-3 text-center">
    <h1 style="font-size:60px">WELCOME CRUD</h1>
    <br><br>
       <div class="list-group">
       <a href="./home.jsp" class="list-group-item list-group-item-action"><b>HOME</b></a><br>
       <a href="./addEmployee.jsp" class="list-group-item list-group-item-action"><b>ADD-EMPLOYEE</b></a><br>
       <a href="getEmployee" class="list-group-item list-group-item-action"><b>EMPLOYEE-LIST</b></a>
       
       </div>
    </div>

</body>
</html>