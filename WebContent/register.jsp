<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register</h1>
<p>${message}</p>
<form action="RegisterController" method="post">
	<label for="email">Email</label>
	<input id="email" type="email" name="regemail">
	<br />
	<label for="password">Password</label>
	<input id="password" type="password" name="regpassword">
	<br />
	<label for="cpassword">Confirm Password</label>
	<input id="cpassword" type="password" name="regcpassword">
	<br />
	<input type="submit" value="Login">
</form>

</body>
</html>