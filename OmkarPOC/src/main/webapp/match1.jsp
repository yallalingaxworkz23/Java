<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script> 

</head>
<body>

    <nav id="navbar-example2" class="navbar bg-body-tertiary px-3 mb-3">
        <a class="navbar-brand" href="#">Navbar</a>
        <ul class="nav nav-pills">
          <li class="nav-item">
            <a class="nav-link" href="#scrollspyHeading1">First</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#scrollspyHeading2">Second</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Dropdown</a>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="#scrollspyHeading3">Third</a></li>
              <li><a class="dropdown-item" href="#scrollspyHeading4">Fourth</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="#scrollspyHeading5">Fifth</a></li>
            </ul>
          </li>
        </ul>
        
      </nav>
     
      <div data-bs-spy="scroll" data-bs-target="#navbar-example2" data-bs-root-margin="0px 0px -40%" data-bs-smooth-scroll="true" class="scrollspy-example bg-body-tertiary p-3 rounded-2" tabindex="0">
        <h4 id="scrollspyHeading1">First heading</h4>
        <p>...</p>
        <h4 id="scrollspyHeading2">Second heading</h4>
        <p>...</p>
        <h4 id="scrollspyHeading3">Third heading</h4>
        <p>...</p>
        <h4 id="scrollspyHeading4">Fourth heading</h4>
        <p>...</p>
        <h4 id="scrollspyHeading5">Fifth heading</h4>
        <p>...</p>
      </div>
      <iframe frameborder="500px" height="800px" width="400px"></iframe>
    
      

</body>
</html>