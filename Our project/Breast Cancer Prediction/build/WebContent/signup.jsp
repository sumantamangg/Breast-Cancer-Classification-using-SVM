<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login|Hospital MGMT</title>
		<link rel="stylesheet" href="css/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="header">
			<h2>Hospital Management</h2>
		</div>
		<div id="login_box">
		<h1><b>Member Signup</b></h1>
			<p>Acess your Hospital Account</p><br><br>
			<form method="POST" action="signup.chi">
			<input type="text" name="name" placeholder="Username or E-mail" required><br>
			<input type="text" name="address" placeholder="address" required><br>
			<input type="text" name="phone" placeholder="phone No." required><br>
			<input type="text" name="email" placeholder="E-mail" required><br>
			
			<input type="password" name="password" placeholder="Password" required><br>
			Gender:<input type="radio" value="male" name="gender">male
                     <input type="radio" value="female" name="gender">female<br>
			
			
			<input type="submit" value="SignUp">
			</form>
			
		</div>





</form>

</body>
</html>