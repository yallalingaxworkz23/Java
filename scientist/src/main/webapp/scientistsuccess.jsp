<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;">${message}</h1>
<h3>${scientistDTO.name }</h3>
 <h3>${scientistDTO.expr }</h3> 
<h3>${scientistDTO.field }</h3> 
<h3>${scientistDTO.country }</h3> 
 <h3>${scientistDTO.achivement }</h3>
 
  <h3>${message}</h3>
 <h3>${mesage}</h3>
 <form method="POST" action="upload" enctype="multipart/form-data">
    <input type="file" name="file" /><br/>
    <input type="submit" value="Submit" />
</form>
</body>
</html>