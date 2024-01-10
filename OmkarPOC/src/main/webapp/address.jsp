<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>${DTO}</h3>
    
    </p>
    <form action="adres" method="post">

         <a href="loginSuccess.jsp"><h4>home</h4></a>
         <h2>WelCome</h2>
         <h3>User id=${email}</h3>
        
         <div>
             Number: <input type="number" name="num" placeholder="enter u r number">
         </div><br>
         <div>
             Street: <input type="text" name="landmark" placeholder="enter u r Street">
         </div><br>
         <div>
             City : <input type="text" name="city" placeholder="enter u r city">
         </div><br>
         <div>
             State: <input type="text" name="state" placeholder="enter u r state">
         </div>    <br>
         <div>
             Country: <input type="text" name="country" placeholder="enter u r country">
         </div><br>
        <input type="submit" value="send">

        

    </form>
</body>
</html>