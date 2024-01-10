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
			<a class="navbar-brand" href="#">Institute</a> <a class="navbar-brand"
				href="aboutpg.jsp">About Institute</a>
		</div>
	</nav>
	<h3>${textprint}</h3>
	<div style="color: red">
	<c:forEach items="${errormessage}" var="objecterror">${objecterror.defaultMessage}</c:forEach>
	</div>
	<form action="yallu" method="post">
	<div>
	<label>Institute Name </label>
	<input type="text" name="instname" value="${dto.getInstname()}"> 
	</div>
	
	<div>
	<label>Institute Founder</label>
	<input type="text" name="founder" value="${dto.getFounder()}"> 
	</div>
	
	<div>
	<label>Institute place</label>
	<input type="text" name="place" value="${dto.getPlace()}">
	</div>
	
	<div>
	<label>Institute Year</label>
	<input type="number" name="years" value="${dto.getYears()}" step="any">
	</div>
	
	<div>
	<label>Institute Strength</label>
	<input type="number" name="strength" value="${dto.getStrength()}">
	</div>
	
	<div>
	<label>Institute Staff</label>
	<input type="number" name="staff" value="${dto.getStaff()}">
	</div>
	
	<div>
	<label>Couesr </label>
	<select name="course" >
	<option selected value="" >select</option>
	<option value="java"<c:if test="${dto.course=='java'}">selected="selected" </c:if> >java</option>
	<option value="python" <c:if test="${dto.course=='python'}">selected="selected" </c:if>>python</option>
	<option value="web" <c:if test="${dto.course=='web'}">selected="selected" </c:if>>web</option>
	<option value="react" <c:if test="${dto.course=='react'}">selected="selected" </c:if>>react</option>
	<option value="c++" <c:if test="${dto.course=='c++'}">selected="selected" </c:if>>c++</option>
	</select>
	</div>
	
	<div>
	<label>Duraction</label>
	<select name="duraction">
	<option selected value="">select</option>
	<option value="1month" <c:if test="${dto.duraction=='1month'}">selected="selected" </c:if>>1month</option>
	<option value="2month" <c:if test="${dto.duraction=='2month'}">selected="selected" </c:if>>2month</option>
	<option value="3month" <c:if test="${dto.duraction=='3month'}">selected="selected" </c:if>>3month</option>
	<option value="6month" <c:if test="${dto.duraction=='6month'}">selected="selected" </c:if>>6month</option>
	</select>
	</div>
	
	<input type="submit" value="save">
	</form>

</body>
</html>