<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script> 

<style>
    nav {
    background-color: #e0d0d0;
    margin-top: -50px;
}

ul {
    display: flex;
    justify-content: space-around;
    align-items: center;
    height: 50px;
}

li {
    position: relative;
    margin-left: 110px;
    margin-top: 5px;
}

a {
    text-decoration: none;
    color: #fff;
}

/* Style the search box */
form {
    display: flex;
}

input[type="text"] {
    padding: 5px;
    border: none;
    border-radius: 5px;
}

button {
    background-color: #aab0aa;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 5px 10px;
    cursor: pointer;
}

/* Style for the search icon (you may use an appropriate font-awesome class) */
.fa-search {
    font-size: 14px;
    margin-right: 5px;
}
img{
  position: relative;
  margin-top: 70px;
}
</style>
</head>
<body>
    <div id="img">
        <img src="xwoekz.jpg" alt="logo" height="50" width="100">
      </div>
      
        <nav>
         
            <ul>
                <li><a href="">Home</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">Gallery</a></li>
                <li><a href="#">Contact</a></li>
                <li>
                    <form>
                        <input type="text" placeholder="Search">
                        <button type="submit" ><i class="fa fa-search">click</i></button>
                    </form>
                </li>
            </ul>
        </nav>
</body>
</html>
<p>Name=${name}</p>
<p>Mobile nu=${mobileNo}</p>
<p>Email=${email}</p>
<p>Date=${dob}</p>
<p>Location=${location}</p>
<p>Password=${password}</p>
<p>ConfirmPassword=${confirmPassword}</p>
