<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TestInit</title>
</head>
<body>
<h3>Testing JSPs</h3>
<%
	int i=5;
	int j=10;
	int k = i+j;
 %>
 Total of I and J is <%=k %>
<br>
</body>
</html>