<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
<head>First JSP</head>
<body>
<h1>Testing JSP</h1>
        <%
        java.util.Date now= new java.util.Date();
        String timeString="Time now is: "+now;
        %>
        <%= timeString %>

        <%@ page import="java.util.Date, logic.TestClass"%>
        <% TestClass test=new TestClass(); %>
        <%= test.getInfo() %>

        <% String name=request.getParameter("name"); %>
        <%= "my name is " + name %>
</body>
</html>