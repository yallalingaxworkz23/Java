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
<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Cake</a> <a class="navbar-brand"
				href="index.jsp">Home</a>
				</div>
				</nav>
				<h3>${ texterror}</h3>
<%-- 				<h4>${errormessage}</h4> --%>
<%-- <c:forEach items="${errmessage}" var="errors"> --%>
<%--  ${errors.defaultMessage} --%>
				
				<c:forEach  items="${errormessage}" var="objecterror">
				${ objecterror.defaultMessage}
				</c:forEach>
	<form action="music" method="post">

		<div>
			<label>Name</label> <input type="text" name="name" value="${dto.getName()}">
		</div> <br>

		<div>
			<label>Singer</label> <input type="text" name="singer"  value="${dto.getSinger()}">
		</div><br>

		<div>
			<label>Composer</label> <input type="text" name="composer" value="${dto.getComposer()}">
		</div><br>
		
		<div>
			<label>Duration</label> <input type="text" name="duration" value="${dto.getDuration()}">
		</div><br>
		
		<div>
			<label>Album</label> <input type="text" name="album" value="${dto.getAlbum()}">
		</div><br>
		
		<div>
		<label>Language</label>
		<select name="language">
		<option selected value="" >select</option>
		<option value="kannada"<c:if test="${dto.language=='kannada'}">selected="selected" </c:if> >kannada</option>
		<option value="hindi" <c:if test="${dto.language=='hindi' }">selected="selected"</c:if> >hindi</option>
		<option value="telugu" <c:if test="${dto.language=='telugu' }">selected="selected" </c:if> >telugu</option>
		<option value="tamil" <c:if test="${dto.language=='tamil'}">selected="selected" </c:if> >tamil</option>
		</select>
		</div><br>
		
		<div>
		<label>Releasedate</label>
		<input type="date" name="releasedate" value="${dto.getReleasedate()}">
		</div><br>
		
		<div>
		<label>Lyericist</label>
		<input type="text" name="lyericist"  value="${dto.getLyericist()}">
	    </div><br>
		
		<div>
		<label>Producer</label>
		<input type="text" name="producer" value="${dto.getProducer()}">
		</div><br>
		
		<div>
		<label>Directer</label>
		<input type="text" name="directer" value="${dto.getDirecter()}">
		</div><br>

<input type="submit" value="save">
	</form>
	
</body>
</html>