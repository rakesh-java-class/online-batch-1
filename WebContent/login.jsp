<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<h1>Login</h1>
<p>${loginError}</p>
<% for(int i=0; i< 10; i++){
	out.print(i);
} %><!-- scriplet tag -->
<form action="Login" method="post">
	<input type="email" name="useremail">
	<input type="password" name="userpassword">
	<input type="submit" value="Login">
</form>
</body>
</html>