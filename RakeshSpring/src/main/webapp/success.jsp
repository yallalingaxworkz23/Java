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
<h1>${news}</h1>	

<h3>${dto.name }</h3>
<h3>${dto.fname }</h3>
<h3>${dto.mname }</h3>
<h3>${dto.place }</h3>

<h3>${message}</h3>
<form method="POST" action="upload" enctype="multipart/form-data">

    <input type="file" name="file" /><br/>
    <input type="submit" value="Submit" />
</form>

</body>
</html>