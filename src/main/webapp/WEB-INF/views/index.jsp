<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
	</head>
	<body>
		<h1>Welcome Index</h1>
		<a href="<c:url value='/login'/>">Login</a>
		<a href="<c:url value='/user'/>">User</a>
		<a href="<c:url value='/admin'/>">Admin</a>
	</body>
</html>