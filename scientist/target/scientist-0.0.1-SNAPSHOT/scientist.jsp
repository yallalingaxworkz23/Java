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
	
	<form action="kumar" method="post">
	
	<div>
	<label>Name</label>
	<input type="text" name="name" >
	</div><br>
    <div>
        <label>Expr</label>
        <input type="number" name="expr" >
        </div><br>

        <div>
            <label>Field</label>
            <select name="field" >
            <option value="">select</option>
                <option value="physics">physics</option>
                <option value="biology">biology</option>
                <option value="chemistary">chemistary</option>
            </select>
        </div><br>
        <div>
            <label>Country</label>
            <select name="country" >
                <option value="">select</option>
                <option value="india">india</option>
                <option value="srilanka">srilanka</option>
                <option value="pack">pack</option>
            </select>
        </div><br>
        <div>
            <label>Achivement</label>
            <input type="text" name="achivement" >
            </div><br>
            
      
	
    <input type="submit" value="save ">
</form>
</body>
</html>