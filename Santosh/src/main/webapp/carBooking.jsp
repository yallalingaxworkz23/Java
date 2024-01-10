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
    ul{
        margin-left: 800px;
    }
</style>
</head>
<body>
    <form action="car" method="post">
        <nav class="navbar">
            <ul>
               <a href="carHome.jsp"> home</a>
            </ul>

        </nav>
        <div>
            Holder Name: <input type="text" name="name" placeholder="ownar name">
        </div><br>
        <div>
           Holder Pnumber: <input type="number" name="pnum" placeholder="enter u r number"> 
        </div><br>
        <div>
            Car name: <select name="car" id="car">
                <option value="select">Select</option>
                <option value="tata">TATA</option>
                <option value="bmw">BMW</option>
                <option value="audi">Audi</option>
                <option value="benze">Benze</option>
                <option value="ford">Ford</option>
                <option value="farare">Farare</option>
                <option value="tesla">Tesla</option>
                <option value="rr">RR</option>
                <option value="lr">LR</option>
                <option value="bugati">Bugati</option>
            </select>
        </div><br>
        <div>
            Car booking date: <input type="date" name="date">
        </div><br>
        <div>
            <input type="submit" value="save">
        </div><br>


    </form>

</body>
</html>