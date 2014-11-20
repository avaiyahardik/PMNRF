<%-- 
    Document   : error
    Created on : Nov 20, 2014, 12:35:57 AM
    Author     : Shidhav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%= request.getParameter("msg") %></h1>
    </body>
</html>
