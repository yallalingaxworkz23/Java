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

	<!-- As a link -->
	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Cake</a> <a class="navbar-brand"
				href="orderpage.jsp">Cake Order</a>
		</div>
	</nav>
<div>${message }</div>
<h2 style="color: red;">${cust.customer }</h2>
<h2>${cust.gemail }</h2>
<h2>${cust.flaver }</h2>

	<!-- As a heading -->
	<!-- <nav class="navbar bg-body-tertiary"> -->
	<!--   <div class="container-fluid"> -->
	<!--     <span class="navbar-brand mb-0 h1">Navbar</span> -->
	<!--   </div> -->
	<!-- </nav> -->

</body>
</html>