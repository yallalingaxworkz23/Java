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
				href="index.jsp">Home</a>
		</div>
	</nav>
	<div>
	
	<form action="yallalinga" method="post">
	<h3>${frenterror }</h3>
	<div>
	<label>Customer</label>
	<input type="text" name="customer" >
	</div><br>
    <div>
        <label>Email</label>
        <input type="email" name="gemail" >
        </div><br>

        <div>
            <label>Flaver</label>
            <select name="flaver" >
            <option value="">select</option>
                <option value="chocolate">chocolate</option>
                <option value="venella">venella</option>
                <option value="dark">dark</option>
            </select>
        </div><br>
        <div>
            <label>Weight</label>
            <select name="weight" >
                <option value="">select</option>
                <option value="1">1kg</option>
                <option value="2">2kg</option>
                <option value="3">3kg</option>
            </select>
        </div><br>
        <div>
            <label>Price</label>
            <input type="number" name="price" >
            </div><br>
            
         <div>
            <label>Take Away</label>
            <input type="radio" name="taken" id="taken">taken
            <input type="radio" name="taken" id="nottaken">not taken
         </div>   <br>
	
    <input type="submit" value="save ">
</form>
</body>
</html>