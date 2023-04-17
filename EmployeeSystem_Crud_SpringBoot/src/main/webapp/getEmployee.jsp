<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./Base.jsp" %>
<title>Insert title here</title>
<style type="text/css">

/**/
footer{
    width: 100%;
    height: 60px;
    line-height: 60px;
    background: #242539;
    position: fixed;
    bottom: 0;
    left: 0;
}
footer .container{
   font-weight: 700;
   text-align: center;
   text-transform: uppercase;
   font-size: 20px;
   color: #fff;
}
</style>
</head>
<body>
<table class="table table-striped" style="text-align:center; margin-top:5%;">
  <thead class="head" style="background-color:skyblue;">
    <tr >
      <th scope="col">EMP_ID</th>
      <th scope="col">NAME</th>
      <th scope="col">AGE</th>   
      <th scope="col">SALARY</th>  
      <th scope="col">ACTION</th>      
    </tr>
  </thead> 
<tbody>
    <c:forEach var="lst" items="${list}">
        <tr>
           <td>${lst.empid}</td>
           <td>${lst.name}</td>
           <td>${lst.age}</td>
           <td>${lst.salary}</td>
           <td scope="col">
              <a href="delete/${lst.empid}"><i class="fa-sharp fa-solid fa-trash" style="font-size:20px; color:red;"></i></a>
              <a href="update?empid=${lst.empid}"><i class="fa-sharp fa-solid fa-marker" style="font-size:20px"></i></a>      
           </td>
        </tr>    
    </c:forEach>
</tbody>
</table>
<footer>
<div class="container text-center">
    <a href="home.jsp" class="btn btn-outline-warning">Go-Back</a>
    <a href="addEmployee.jsp" class="btn btn-outline-success">Add-Employee</a>
</div>
</footer>
 
</body>
</html>