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
          
             <nav id="navbar-example2" class="navbar bg-body-tertiary px-3 mb-3" >
                <a class="navbar-brand" href="#">Navbar</a>
                <ul class="nav nav-pills">
                  <li class="nav-item">
                    <a class="nav-link" href="#scrollspyHeading1">Movies</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="#scrollspyHeading2">News</a>
                  </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-expanded="false">Dropdown</a>
                    <ul class="dropdown-menu">
                      <li><a class="dropdown-item" href="#scrollspyHeading3">Music</a></li>
                      <li><a class="dropdown-item" href="#scrollspyHeading4">Sports</a></li>
                      <li><hr class="dropdown-divider"></li>
                      <li><a class="dropdown-item" href="#scrollspyHeading5">All Chanal</a></li>
                    </ul>
                  </li>
                </ul>
              </nav>    

        <p> Tournament Name=${tournamentName}</p> 
        <p> Hosting Country=${hostingcountry}</p> 
        <p> Match Date=${matchdate}</p> 
        <p> Team 1 Name=${team1name}</p> 
        <p> Team 2 Name=${team2name}</p> 
        <p> Team 1 Captain Name=${team1captainname}</p> 
        <p> Team 2 Captain Name=${team2captainname}</p> 
        <p> Umpire Name=${umpirename}</p> 
        <p> Stadium Name =${stadiumname}</p> 
        <p> Third Umpire Name=${thirdumpirename}</p> 
        <p> Stadium Capacity=${stadiumcapacity}</p> 
        
    </body>
    </html>