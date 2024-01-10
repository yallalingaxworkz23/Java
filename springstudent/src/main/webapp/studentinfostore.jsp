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
			<a class="navbar-brand" href="#">Student</a> <a class="navbar-brand"
				href=studentinfo.jsp>About</a>
		</div>
	</nav>

<h1 style=" color: green;">${massage }</h1>
<h3> Name is=${studentDTO.name} </h3>
<h3> Place is=${studentDTO.place} </h3>
<h3> Branch is=${studentDTO.branch} </h3>
<h3> Year is=${studentDTO.year} </h3>
<h3> Country is=${studentDTO.country} </h3>
<h3> Achivement is=${studentDTO.achivement} </h3>

</body>
</html>