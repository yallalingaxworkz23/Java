<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .navbar{
        background-color: aqua;
    }
   .page {
        margin-left: 700px;
    }
    .navbar:hover{
        color: rgb(168, 25, 25);
        
    }
</style>
</head>
<body>
    <nav class="navbar">
        <div class="page">
            <a href="loanApply.jsp"> applaication page</a>
        </div>
 
    </nav>
    <h1 style="color: rgb(85, 215, 85);">Info About loan is saved</h1>
    <p>Name:${name}</p>
    <p>Amount: ${cost}</p>
    <p>Working: ${radio} </p>
    <p> Interst :${intrest}</p>
    <p>Surety:${surety}</p>
    <p>Company: ${company}</p>
    <p>LoanTenure: ${tenuer}</p>
    <p>LoanType:${type}</p>
    	


</body>
</html>