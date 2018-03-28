<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>

<title>Add User Info</title>
</head>
<body>
	<form id="itemForm" onsubmit="return check()"
		action="${pageContext.request.contextPath }/user/addUser"
		method="post">
		<h2 class="text-center">Add User Info：</h2>
		<div style="width: 40%; margin-left: 30%">
			<div class="form-group">
				<label for="username">User Name</label> <input
					placeholder="username" class="form-control" type="text"
					name="username" id="username" onkeyup="positive(this);" maxlength="20">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input placeholder="password"
					class="form-control" type="text" name="password" id="password"
					onkeyup="positive(this);" maxlength="20">
			</div>
			<div class="form-group">
				<label for="nickname">Nickname</label> <input placeholder="nickname"
					class="form-control" type="text" name="nickname" id="nickname" maxlength="20">
			</div>
			<div class="form-group">
				<label for="email">email</label> <input placeholder="email"
					class="form-control" type="text" name="email" id="email" maxlength="20">
			</div>
			<input type="submit" value="Submit" class="btn btn-primary btn-sm" />
			<a href="list" class="btn btn-primary btn-sm" role="button" onclick="history.back(1);">Go Back</a>
		</div>
	</form>
</body>
</html>

<script type="text/javascript">
function positive(obj){  
    obj.value=obj.value.replace(/[^\w\.\/]/ig,'');  
}  

function check(){
	   var name = document.getElementById("username").value;
	   var password = document.getElementById("password").value;
	   var nickname = document.getElementById("nickname").value;
	   var email = document.getElementById("email").value;
	   if(name ==  null || name == ''){
	        alert("Please input User Name");
	        return false;
	   }else if(password ==  null || password == ''){
	        alert("Please input Password");
	        return false;
	   }else if(nickname ==  null || nickname == ''){
	        alert("Please input Nickname");
	        return false;
	   }else if(email ==  null || email == ''){
	        alert("Please input email");
	        return false;
	   }
	   return true;
	}
</script>