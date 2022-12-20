<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaguides.net</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.min.js"
                    integrity="sha512-nhY06wKras39lb9lRO76J4397CH1XpRSLfLJSftTeo3+q2vP7PaebILH9TqH+GRpnOhfAGjuYMVmVTOZJ+682w=="
                    crossorigin="anonymous" referrerpolicy="no-referrer"></script>
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css"
                    integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
                    crossorigin="anonymous">
                <!-- Optional theme -->
                <link rel="stylesheet"
                    href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css"
                    integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ"
                    crossorigin="anonymous">
                <!-- Latest compiled and minified JavaScript -->
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js"
                    integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
                    crossorigin="anonymous"></script>
                    <!-- <script src=resources/js/index></script> -->
                    <!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script> -->
                   
                    <script src="<c:url value=" /resources/js/index.js" />"></script>
            
                </head>
<body>
 <div class="container">
  <div class="col-md-offset-1 col-md-10">
   <h2>CRM - Customer Relationship Manager</h2>
   <hr />

   <input type="button" value="Add Customer"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
    <input type="button" value="Submit"
    onclick="get()"; return false;
    class="btn btn-primary" />
    <br/><br/>
    
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Customer List</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
       <th>event_id</th>
       <th>event_name</th>
       <th>description</th>
       <th>location</th>
       <th>date</th>
       <th>time</th>
       <th>venue</th>
       <th>concept</th>
       <th>company</th>
       <th>prize</th>
       <th>Action</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="tempCustomer" items="${customers}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/updateForm">
        <c:param name="customerId" value="${tempCustomer.event_id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/delete">
        <c:param name="customerId" value="${tempCustomer.event_id}" />
       </c:url>

       <tr>
        <td>${tempCustomer.event_id}</td>
        <td>${tempCustomer.event_name}</td>
        <td>${tempCustomer.description}</td>
        <td>${tempCustomer.location}</td>
        <td>${tempCustomer.date}</td>
        <td>${tempCustomer.time}</td>
        <td>${tempCustomer.venue}</td>
        <td>${tempCustomer.concept}</td>
        <td>${tempCustomer.company}</td>
        <td>${tempCustomer.prize}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>
  </div>

 </div>
</body>
</html>