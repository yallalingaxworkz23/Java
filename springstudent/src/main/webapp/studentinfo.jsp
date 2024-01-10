<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

 
 
	
	<form action="kumar" method="post">
	
	<div>
	<label>Name</label>
	<input type="text" name="name"  >
	</div><br>
	<div>
	<label>Place</label>
	<input type="text" name="place"> 
	</div>
    <div>
        <label>Year</label>
        <input type="number" name="year" >
        </div><br>

        <div>
            <label>Branch</label>
            <select name="branch" >
            <option value="">select</option>
                <option value="cse">cse</option>
                <option value="ise">ise</option>
                <option value="mech">mech</option>
                 <option value="civil">civil</option>
                  <option value="ec">ec</option>
                   <option value="ai">ai</option>
            </select>
        </div><br>
        <div>
            <label>Country</label>
            <select name="country"  >
                <option value="">select </option>

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