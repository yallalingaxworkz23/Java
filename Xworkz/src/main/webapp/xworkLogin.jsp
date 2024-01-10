  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <style>
      @import url('https://fonts.googleapis.com/css?family=Raleway:400,700');
*,*:before,*:after{box-sizing:border-box}

body{
min-height:100vh;
font-family: 'Raleway', sans-serif;
}

.container{
position:absolute;
width:100%;
height:100%;
overflow:hidden;

&:hover,&:active{
  .top, .bottom{
    &:before, &:after{
      margin-left: 200px;
      transform-origin: -200px 50%;
      transition-delay:0s;
    }
  }
  
  .center{
    opacity:1;
    transition-delay:0.2s;
  }
}
}

.top, .bottom{
&:before, &:after{
  content:'';
  display:block;
  position:absolute;
  width:200vmax;
  height:200vmax;
  top:50%;left:50%;
  margin-top:-100vmax;
  transform-origin: 0 50%;
  transition:all 0.5s cubic-bezier(0.445, 0.05, 0, 1);
  z-index:10;
  opacity:0.65;
  transition-delay:0.2s;
}
}

.top{
&:before{transform:rotate(45deg);background:#e46569;}
&:after{transform:rotate(135deg);background:#ecaf81;}
}

.bottom{
&:before{transform:rotate(-45deg);background:#60b8d4;}
&:after{transform:rotate(-135deg);background:#3745b5;}
}

.center{
position:absolute;
width:400px;
height:400px;
top:50%;left:50%;
margin-left:-200px;
margin-top:-200px;
display:flex;
flex-direction: column;
justify-content: center;
align-items: center;
padding:30px;
opacity:0;
transition:all 0.5s cubic-bezier(0.445, 0.05, 0, 1);
transition-delay:0s;
color:#333;

input{
  width:100%;
  padding:15px;
  margin:5px;
  border-radius:1px;
  border:1px solid #ccc;
  font-family:inherit;
}
}
    /* Reset some default styles */
body, ul, li {
    margin: 0;
    padding: 0;
    list-style: none;
    margin-top: -53px;
    position: relative;
}

/* Style the navigation bar */
nav {
    background-color: #e0d0d0;
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
            <li><a href="#">Home</a></li>
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
    <div class="container" onclick="onclick">
      <div class="top"></div>
      <div class="bottom"></div>
      <div class="center">
        <h2>Please Sign In</h2>
        enter Email
        <input type="email" placeholder="email"/><br>
        enter password
        <input type="password" placeholder="password"/><br>
        <input type="button" value="submit" style="color: green;"><br>
        <a href="xworkRigester.jsp" style='color:black';>Rigesterform</a>
      </div>
    </div>
  
</body>
</html>