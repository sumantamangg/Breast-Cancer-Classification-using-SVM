<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/login.css">
</head>
<body>
<div id="header">
	<h2> Welcome to National Hospital</h2>
		</div>
		
		<nav>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">Diagnose</a></li>
				<li><a class="active"  href="#">Profile</a></li>
				<li><a href=index.jsp>LogOut</a></li>
				<li><a href="train.jsp">Train</a></li>
			</ul>
		</nav>
		<div id="login_box">
		<form method="post" action="train.chi">
		<h1> <b> Enter Training Set Id</b></h1><br>
		<p>choose id between 1 and 200 </p><br>
		<input type="text" name="minid" placeholder="From" required><br> 
		<b>to</b> <br>
		<input type="text" name="maxid" placeholder="To" required><br> 
		<input type="submit" name="submit">
		</form>
		</div>
</body>
</html>