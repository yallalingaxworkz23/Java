<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="nicc" method="post">
        <div>
            User id: <input type="text" name="email" placeholder="enter u r email id">
        </div><br>
        <div>
            Password : <input type="password" name="password" placeholder="enter u r password">
        </div><br>
        <span style="color: red;">${incorrest}</span><br>
        <div>
          <input type="submit" value="Login">
       </div>
    </form>

</body>
</html>