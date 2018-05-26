<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login|Hospital MGMT</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Diagnosis</title>
		
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
		
<form action="diagnosis.chi" method="post">
<h1> Diagnose Patient</h1>
<input type="text" name="patientid" placeholder="Patient ID" required><br> 
<b>Clump Thickness:</b><select name="clump"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Uniformity of cell Size:</b><select name="size"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<b></b><option 10alue="5">10</option></select><br><br>
<b>Uniformity of cell Shape:</b><select name="shape"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Marginal Adhesion:</b><select name="adhesion"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Single Epithelial Cell Size:</b><select name="epithelial"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Bare Nuclei:</b><select name="bare"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Bland Chromatic:</b><select name="bland"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Normal Nucleolic:</b><select name="nucleolic"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>
<b>Mitoses:</b><select name="mitoses"><br>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option></select><br><br>

<input type="submit" value="Diagnosis">


</form>
</body>
</html>