<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
response.setHeader("Cache-Control","no-cache,no-store, must-revalidate"); 
if(session.getAttribute("user")==null){
response.sendRedirect("login.jsp");
}
%> 



Hi user
<a href="Videos.jsp" >click to view video</a>
<form action="Logout" method="get">
<input type="Submit" value="Logout">


</form>
</body>
</html>