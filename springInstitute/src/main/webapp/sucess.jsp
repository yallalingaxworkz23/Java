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
			<a class="navbar-brand" href="#">Institute</a> <a class="navbar-brand"
				href="aboutpg.jsp">About Institute</a>
		</div>
	</nav>
	<h3>${valied}</h3>
	<h4>${dto.instname}</h4>
	<h4>${dto.founder}</h4>
	<h4>${dto.place}</h4>
	<h4>${dto.years}</h4>
	<h4>${dto.strength}</h4>
	<h4>${dto.staff}</h4>
	<h4>${dto.course}</h4>
	<h4>${dto.duraction}</h4>
	

</body>
</html>