<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <style>
        .navbar{
            background-color: aqua;
            
        }
        ul{
            margin-left: 800px;
        }
        </style>
        </head>
        <body>
            <form action="car" method="post">
                <nav class="navbar">
                   <a href="carBooking.jsp"> <ul><li>booking page</li></ul></a>
                </nav>
               <center> <h1 style="font-style: italic;"> <p style="color: rgb(56, 169, 76);">car booking saved sucessfuall</p></h1></p></center>
               <p>Name: ${name}</p>
               <p>Pnumber:${pnum}</p>
               <p>Car:${car}</p>
               <p>Booked date:${date}</p>
            </form>

</body>
</html>