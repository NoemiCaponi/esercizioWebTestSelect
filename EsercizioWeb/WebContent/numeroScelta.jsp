<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Hai scelto: </h3>
<%= request.getAttribute("numero_scelto_attr") %>

<a href="index.jsp">Vuoi tentare di nuovo?</a>
</body>
</html>