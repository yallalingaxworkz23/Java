<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">yauvanidhi</a> <a class="navbar-brand"
				href="index.jsp">About yauvanidhi</a>
		</div>
	</nav>

<h3>${messageforerror}</h3>
<form action="youa" method="post">
<div>
<label>Name</label>
<input type="text" name="name">
</div><br>

<div>
<label>Father name</label>
<input type="text" name="fname"> 
</div><br>

<div>
<label>year of passing</label>
<select name="pass">
<option value="">select</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023">2023</option>
<option value="2024">2024</option>
</select>
</div> <br>

<input type="submit" value="save">
</form>

</body>
</html>