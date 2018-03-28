<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css"> 
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>

<title>User Info List</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/user/add" class="btn btn-default btn-lg active" role="button">Add User Info</a>
	<label style='float:right;'>TestVersion：1.2</label>
	<br>
	<table width="80%" border=1 align="center" class="table table-hover">
		<tr class="active">
			<td width="20%">User Name</td>
			<td width="20%">Password</td>
			<td width="20%">Nickname</td>
			<td width="20%">email</td>
			<td width="20%">Operation</td>
		</tr>
		<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.username }</td>
				<td>${item.password }</td>
				<td>${item.nickname }</td>
				<td>${item.email }</td>
				<td><a
					href="${pageContext.request.contextPath }/user/edit?iduser=${item.iduser}" class="btn btn-primary btn-sm" role="button">Change</a>
					<a
					href="${pageContext.request.contextPath }/user/deleteByID?iduser=${item.iduser}" class="btn btn-primary btn-sm" role="button">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>