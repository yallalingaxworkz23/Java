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
<h3>${texterroe}</h3>
<c:forEach items="${messageerror}" var="objecterror"> ${ objecterror.defaultMessage}</c:forEach>
<div>
<form action="pg" method="post">
<div>
<label>PG Name</label>
<input type="text" name="pgname" value="${dto.getPgname()}">
</div> <br>
<div>
<label>PG Location</label>
<input type="text" name="location" value="${dto.getLocation()}">
</div><br>

<div>
 <label>Rooms </label>
 <select name="rooms">
 <option selected value="">select</option>
 <option value="1share" <c:if test="${dto.rooms=='1share'}">selected="selected" </c:if> >1share</option>
 <option value="2share" <c:if test="${dto.rooms=='2share'}">selected="selected" </c:if>>2share</option>
 <option value="3share" <c:if test="${dto.rooms=='3share'}">selected="selected" </c:if>>3share</option>
 <option value="4share" <c:if test="${dto.rooms=='4share'}">selected="selected" </c:if>>4share</option>
 </select> 
</div><br>

<div>
<label>Person Name</label>
<input type="text" name="person" value="${dto.getPerson()}">
</div><br>

<div>
<label>Booked</label>
<select name="booked">
<option selected value="">select</option>
<option value="1share"<c:if test="${dto.booked=='1share'}">selected="selected"</c:if> >1share</option>
<option value="2share" <c:if test="${dto.booked=='2share'}">selected="selected"</c:if> >2share</option>
<option value="3share" <c:if test="${dto.booked=='3share'}">selected="selected"</c:if> >3share</option>
<option value="4share" <c:if test="${dto.booked=='4share'}">selected="selected"</c:if> >4share</option>
</select>
</div><br>

<div>
<label>Booked Date</label>
<input type="date" name="bookingdate" value="${dto.getBookingdate()}">
</div><br>

<div>
<label>Phone Number</label>
<input type="number" name="phone" value="${dto.getPhone()}">
</div><br>

<input type="submit" value="save">

</form>
</div>

</body>
</html>