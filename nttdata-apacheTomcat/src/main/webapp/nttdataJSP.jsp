<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.nttdata.tomcat.*" %>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenid@s a NTT Data - Primer JSP | Contar de 1 a 10.</h1>
	
	<%
	
	for(int i= 0; i <= 10; i++){
		out.println("A la de ... " + i + " <br>");
	}
	
	
	%>
	
	<p><%= NTTDataJSP.helloNTTData("Alejandro")%></p>
</body>
</html>