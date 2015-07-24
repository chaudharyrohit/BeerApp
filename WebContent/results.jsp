<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Beer Advice result</title>
</head>
<body>
<h1>Beer advice results are here</h1>
<%
	List<String> beerList = (List<String>)request.getAttribute("styles");
	Iterator<String> itr = beerList.iterator();
		while(itr.hasNext()){
			String beer = itr.next();
			out.println("Try ----> "+beer+"<br>");
			
		}
 %>
</body>
</html>