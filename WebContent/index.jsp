<%@page import="weplay.spring.Main"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%
	String contextPath =request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Welcome to JokerWebTest Index</title>
</head>
<body>
<h1>Hello!</h1>
<h2>You can do every thing you want!</h2>


testString: <%=Main.testString() %>
<a href="<%=contextPath%>/Test/query" >to welcome</a>
</body>
</html>