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
	<h4>${texteror }</h4>
 <c:forEach items="${errmessage}" var="errors">
 ${errors.defaultMessage}
 
 </c:forEach>
	
	<form action="kumar" method="post">
	
	<div>
	<label>Name</label>
	<input type="text" name="name" value="${dto.getName() }" >
	</div><br>
    <div>
   
        <label>Expr</label>
        <input type="number" name="expr" value="${dto.getExpr() }">
        </div><br>

        <div>
            <label>Field</label>
            <select name="field" >
            <option selected value="">select </option>
                <option value="physics" <c:if test="${dto.field=='physics'}"> selected="selected" </c:if> >physics</option>
                <option value="biology" <c:if test="${dto.field=='biology'}"> selected="selected"</c:if> >biology</option>
                <option value="chemistary" <c:if test="${dto.field=='chemistary'}">selected="selected" </c:if> >chemistary</option>
            </select>
        </div><br>
        <div>
            <label>Country</label>
            <select name="country"  >
                <option selected value="">select </option>
               <option value="india" <c:if test="${dto.country=='india'}">selected="selected" </c:if> >india</option>
                <option value="srilanka" <c:if test="${dto.country=='srilanka'}"> selected="selected</c:if> >srilanka</option>
                <option value="pack" <c:if test="${dto.country=='pack'}"> selected="selected"</c:if>> pack</option>
            </select>
        </div><br>
        <div>
            <label>Achivement</label>
            <input type="text" name="achivement" value="${dto.getAchivement() }">
            </div><br>
            
      
	
    <input type="submit" value="save ">
</form>
</body>
</html>