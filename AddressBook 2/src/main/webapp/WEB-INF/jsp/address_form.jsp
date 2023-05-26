<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Add Student</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/address/addAddress" var="addURL" />
  <h2>Add Student</h2>
  <form:form modelAttribute="addressForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Client Name</label>
    <form:input path="clientname" cssClass="form-control" id="clientname" />
   </div>
   <div class="form-group">
    <label>State</label>
    <form:input path="state" cssClass="form-control" id="state" />
   </div>
   <div class="form-group">
    <label>Pin Code</label>
    <form:input path="pincode" cssClass="form-control" id="pincode" />
   </div>
   <button type="submit" class="btn btn-success">Add Address</button>
  </form:form>
  
 </div>
</body>
</html>