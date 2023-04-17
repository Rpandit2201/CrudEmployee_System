<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp" %>
<title>Insert title here</title>
<style type="text/css">
      body{
       background: rgb(2,0,36);
       background: linear-gradient(90deg, rgba(2,0,36,1) 0%, rgba(89,89,177,1) 35%, rgba(0,212,255,1) 100%);
      }
      .container-btn{
      padding-top:5px;
      
      }
      .btnRegister{
      background: rgb(34,193,195);
      background: linear-gradient(0deg, rgba(34,193,195,1) 0%, rgba(191,162,98,1) 100%);
       color:green;
      }
      .btnRegister:hover{
      color:white;
      border-radius:2vh;
      }
</style>
</head>
<body>

<div class="container mt-3">
    <div class="row">
       <div class="col-md-6 offset-md-3 mt-5">
       <h1>Update Employee Details</h1>
       <form action="updateEmployee" method="post">
          <div class="form-group">
          <label>Employee Id</label>
          <input type="number" class="form-control" value="${employee.empid }" name="empid">
          
          <div class="form-group">
          <label>Employee-Name</label>
          <input type="text" class="form-control" value="${employee.name}" name="name">
          </div>
          
          <div class="form-group">
          <label>Employee-Age</label>
          <input type="number" class="form-control" value="${employee.age }" name="age">
          </div>
          
          
          <div class="form-group">
          <label>Salary</label>
          <input type="number" class="form-control" value="${employee.salary }" name="salary">
          </div>
          
          <div class="container-btn text-center">
          <input type="submit" class="btnRegister" value="UPDATE">
          </div>
          </div>
       </form>
       </div>
    </div>
</div>
</body>
</html>