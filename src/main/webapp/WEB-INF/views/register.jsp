<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>

        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <title>Spring MVC 5 - form handling | Java Guides</title>
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

            </head>

            <body>
                <div class="container">
                    <div class="col-md-offset-2 col-md-7">
                        <h2 class="text-center">Register</h2>
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <div class="panel-title"></div>
                            </div>
                            <div class="panel-body">
                                <form:form action="savereg" cssClass="form-horizontal" method="post"
                                    modelAttribute="user">

                                    

                                    <div class="form-group">
                                        <label for="username" class="col-md-3 control-label">username</label>
                                        <div class="col-md-9">
                                            <form:input path="username" cssClass="form-control" />
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-md-3 control-label">password</label>
                                        <div class="col-md-9">
                                            <form:input path="password" cssClass="form-control" />
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label for="cpassword" class="col-md-3 control-label">cpassword</label>
                                        <div class="col-md-9">
                                            <form:input path="cpassword" cssClass="form-control" />
                                        </div>
                                        <div class="form-group">
                                            <label for="email" class="col-md-3 control-label">email</label>
                                            <div class="col-md-9">
                                                <form:input path="email" cssClass="form-control" />
                                            </div>

                                            
                                                                <div class="form-group">
                                                                    <!-- Button -->
                                                                    <div class="col-md-offset-3 col-md-9">
                                                                        <form:button cssClass="btn btn-primary">Submit
                                                                        </form:button>
                                                                    </div>
                                                                </div>

                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </body>

            </html>