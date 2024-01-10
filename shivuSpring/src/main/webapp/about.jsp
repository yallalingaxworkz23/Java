<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<h3>${text}</h3>
<c:forEach items="${erroemessage}" var="errors">
 ${errors.defaultMessage}</c:forEach>



<form action="shivu" method="post">
<div>
<label>Name</label>
<input type="text" name="name" value="${shivudto.getname() }">
</div>

<div>
<label>Fname</label>
<input type="text" name="fname" value="${shivudto.getFname() }">
</div>

<div>
<label>Age</label>
<input type="number" name="age" value="${shivudto.getAge() }">
</div>

<div>
<label>Place</label>
<select name="place">
<option value="">select</option>
<option value="Raichur"<c:if test="${shivudto.place=='Raichur' }">selected=="selected</c:if> >Raichir</option>
<option value="Gulbarga"<c:if test="${shivudto.place=='Gulbarga' }">selected=="selected</c:if>>Gulbarga</option>
<option value="Dharward"<c:if test="${shivudto.place=='Dharward' }">selected=="selected</c:if>>Dharward</option>
<option value="Banglour"<c:if test="${shivudto.place=='Banglour' }">selected=="selected</c:if>>Banglour</option>
</select>
</div>

<input type="submit" value="save">

</form>

</body>
</html>