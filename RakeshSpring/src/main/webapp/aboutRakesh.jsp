<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${text}</h3>
<h3>${bad }</h3>
<div style="color: red"> <c:forEach items="${errormessage}" var="error">${error.defaultMessage}</c:forEach></div>

<form action="rakeshv" method="post">
<div>
<label>Name</label>
<input type="text" name="name" value="${dto.getName()}">
</div> <br>

<div>
<label>FName</label>
<input type="text" name="fname"value="${dto.getFname()}">
</div> <br>

<div>
<label>MName</label>
<input type="text" name="mname" value="${dto.getMname()}">
</div> <br>

<div>
<label>place</label>
<input type="text" name="place" value="${dto.getPlace()}">
</div> <br>
<input type="submit" value="save">

</form>

</body>
</html>