<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp" %>
<title>Add Employee</title>
<style>
body{
    background: rgb(2,0,36);
    background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(89,89,177,1) 35%, rgba(0,212,255,1) 100%);
}
.container .btn{
background:white;
color:green;
}
.btn:hover{
background:brown;
color:white;
}

</style>
</head>
<body>
<div class="container mt-3">
    <div class="row">
       <div class="col-md-6 offset-md-3">
       <h1 style="margin-top:10%">FILL THE EMPLOYEE DETAILS</h1>
       <form action="add-employee" method="post">
          <div class="form-group">
          <label>Employee Id</label>
          <input type="number" class="form-control" name="empid">
          
          <div class="form-group">
          <label>Employee-Name</label>
          <input type="text" class="form-control" name="name">
          </div>
          
          <div class="form-group">
          <label>Employee-Age</label>
          <input type="number" class="form-control" name="age">
          </div>
          
           <div class="form-group">
          <label>Salary</label>
          <input type="number" class="form-control" name="salary">
          </div>
          
          <div class="container text-center">
          <button type="submit" class="btn " style="margin-top:2%;">ADD</button>
          
          <a href="home.jsp" class="btn " style="margin-top:2%">Go-Back</a>
          </div>
          </div>
       </form>
       </div>
    </div>
</div>
</body>
</html>