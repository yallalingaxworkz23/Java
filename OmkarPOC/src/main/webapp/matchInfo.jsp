<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
body{
	background:rgb(240, 236, 236);
}

.container{
	display:flex;
	flex-direction:row;
	justify-content:center;
	align-items:center;
}
.form-control{
	border:none;
	border-bottom:3px solid dodgerblue;
	background:rgb(72, 244, 221);
	color:rgb(31, 28, 28);
	border-radius:0px;
}

.row{
	width:60%;
	margin-top:50px;
	border: 3px solid rgb(215, 205, 14);
	border-radius:14px;
	height:auto;
}

form h2{
	color:rgb(107, 40, 40);
    margin-left: 200px;
}

.checkbox span{
	color:rgb(213, 24, 24);
}

.checkbox{
	float:left;
}

button{
	float:right;
	width:120px;
}

@media(max-width:768px){
	body{
		font-size:10px;
	}
	
	h2{
		font-size:15px;
	}
	
	input[type=text]{
		font-size:13px;
	}
	
	input[type=password]{
		font-size:13px;
	}
	
	input[type=email]{
		font-size:13px;
	}
	
	button{
		width:80px;
		height:30px;
		float:right;
		font-size:10px;
		margin-bottom:10px;
	}
	
	.checkbox{
		display:inline;
	}
	
}
</style>
</head>
<body>
    
<!------ Include the above in your HEAD tag ---------->

<div class="container">
  <div class="row">
  <form action="info" method="post" class="col-xs-12 col-sm-12 col-md-12" onclick="return validateForm()">
  <h2>Please fill all  fields</h2>
  <p>
    <span id="valid0" style="padding-left: 70px;"></span>
  </p>
    
  <div class="form-group">
    Tournament Name <input type="text" class="form-control" id="tournamentName"  name="tournamentName" onchange="tournamentNamee()">
    </div>

    <p>
        <span id="valid1" style="padding-left: 70px;"></span>
      </p>
	
	<div class="form-group">
    Hosting Country  <input type="text" class="form-control" id="hostingcountry"  name="hostingcountry" onchange="hostingcountryy()" >
    </div>
    <p>
        <span id="valid2" style="padding-left: 70px;"></span>
      </p>
   
    <div class="form-group">
    Match Date<input type="text" class="form-control" id="matchdate"  name="matchdate"  onchange="matchdatee()">
    </div>
    <p>
        <span id="valid3" style="padding-left: 70px;"></span>
    </p>
	<div class="form-group">
    Team 1 Name <input type="text" class="form-control" id="team1name" name="team1name"  onchange="team1namee()">
   </div>
   <p>
    <span id="valid4" style="padding-left: 70px;"></span>
  </p>
   <div class="form-group">
     Team 2 Name <input type="text" class="form-control" id="team2name"  name="team2name" onchange="team2namee()" >
   </div>
   <p>
    <span id="valid5" style="padding-left: 70px;"></span>
  </p>
   <div class="form-group">
    Team 1 Captain Name <input type="text" class="form-control" id="team1captainname"  name="team1captainname" onchange="team1captainnamee()">
  </div>
  <p>
    <span id="valid6" style="padding-left: 70px;"></span>
  </p>
  <div class="form-group">
    Team 2 Captain Name <input type="text" class="form-control" id="team2captainname"  name="team2captainname"  onchange="team2captainnamee()">
  </div>
  <p>
    <span id="valid7" style="padding-left: 70px;"></span>
  </p>
  <div class="form-group">
    Umpire Name <input type="text" class="form-control" id="umpirename"  name="umpirename" onchange="umpirenamee()" >
  </div>
  <p>
    <span id="valid8" style="padding-left: 70px;"></span>
  </p>
  <div class="form-group">
    Stadium Name <input type="text" class="form-control" id="stadiumname"  name="stadiumname"  onchange="stadiumnamee()">
  </div>
  <p>
    <span id="valid9" style="padding-left: 70px;"></span>
  </p>
  <div class="form-group">
   Third Umpire Name <input type="text" class="form-control" id="thirdumpirename"  name="thirdumpirename" onchange="thirdumpirenamee()">
  </div>
  <p>
    <span id="valid11" style="padding-left: 70px;"></span>
  </p>
  <div class="form-group">
    Stadium Capacity <input type="number" class="form-control" id="stadiumcapacity" name="stadiumcapacity" onchange="stadiumcapacityy()">
  </div>

  

    <div class="checkbox">
      <label><input type="checkbox" name="remember"> <span>Remember me</span></label>
    </div>
    <button type="submit" class="btn btn-success" id="button">Submit <i class="glyphicon glyphicon-send"></i></button>
  </form>
  </div>
</div>

<script>
    function tournamentNamee(event){
        
        var tournamentName = document.getElementById("tournamentName");
        console.log(tournamentName.value)
        var button=document.getElementById("button");
        if(tournamentName.value.length>=3 && tournamentName.value.length<=15){
           
           document.getElementById("valid0").innerHTML="<span style='color:green'>tournament Name is valid</span> ";
           button.removeAttribute("disabled");
        }else{
            document.getElementById("valid0").innerHTML="<span style='color:red'>tournament Name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function hostingcountryy(event){
       
        var hostingcountry = document.getElementById("hostingcountry");
        console.log(hostingcountry.value)
        var button=document.getElementById("button");
        if(hostingcountry.value.length>=3 && hostingcountry.value.length<=15){
            
            document.getElementById("valid1").innerHTML="<span style='color:green'>hosting countryy is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid1").innerHTML="<span style='color:red'> hosting countryy is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }

    }

    function matchdatee(event){
        var date=document.getElementById("matchdate");
        console.log(date.value)
        var button=document.getElementById("button");
        if(date.value>0 && date.value<30){
            document.getElementById("valid2").innerHTML="<span style='color:green'> given date is valid</span>";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid2").innerHTML="<span style='color:red'>given date is invalid</span>";
            button.removeAttribute("disabled");
            return;
        }
    }

    function team1namee(event){
        
        var team1name = document.getElementById("team1name");
        console.log(team1name.value)
        var button=document.getElementById("button");
        if(team1name.value.length>=3 && team1name.value.length<=15){
            
            document.getElementById("valid3").innerHTML="<span style='color:green'>team1 name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid3").innerHTML="<span style='color:red'>team1 name is invalid </span> ";
           button.setAttribute("disabled","");
            return;
        }
    }

    function team2namee(event){
        
        var team2name = document.getElementById("team2name");
        console.log(team2name.value)
        var button=document.getElementById("button");
        if(team2name.value.length>=3 && team2name.value.length<=15){
            
            document.getElementById("valid4").innerHTML="<span style='color:green'>team2 name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid4").innerHTML="<span style='color:red'>team2 name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function team1captainnamee(event){
       
        var team1captainname = document.getElementById("team1captainname");
        console.log(team1captainname.value)
        var button=document.getElementById("button");
        if(team1captainname.value.length>=3 && team1captainname.value.length<=15){
            
            document.getElementById("valid5").innerHTML="<span style='color:green'>team1 captain name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid5").innerHTML="<span style='color:red'>team1 captain name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function team2captainnamee(event){
        
        var team2captainname = document.getElementById("team2captainname");
        console.log(team2captainname.value)
        var button=document.getElementById("button");
        if(team2captainname.value.length>=3 && team2captainname.value.length<=15){
           
            document.getElementById("valid6").innerHTML="<span style='color:green'>team2 captain name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid6").innerHTML="<span style='color:red'>team2 captain name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function umpirenamee(event){
        
        var umpirename = document.getElementById("umpirename");
        console.log(umpirename.value)
        var button=document.getElementById("button");
        if(umpirename.value.length>=3 && umpirename.value.length<=15){
           
            document.getElementById("valid7").innerHTML="<span style='color:green'>umpire name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid7").innerHTML="<span style='color:red'>umpire name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function stadiumnamee(event){
        
        var stadiumname = document.getElementById("stadiumname");
        console.log(stadiumname.value)
        var button=document.getElementById("button");
        if(stadiumname.value.length>=3 && stadiumname.value.length<=15){
           
            document.getElementById("valid8").innerHTML="<span style='color:green'>stadium name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid8").innerHTML="<span style='color:red'>stadium name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function thirdumpirenamee(event){
        
        var thirdumpirename = document.getElementById("thirdumpirename");
        console.log(thirdumpirename.value)
        var button=document.getElementById("button");
        if(thirdumpirename.value.length>=3 && thirdumpirename.value.length<=15){
           
            document.getElementById("valid9").innerHTML="<span style='color:green'>third umpire name is valid</span> ";
            button.removeAttribute("disabled");
        }else{
            document.getElementById("valid9").innerHTML="<span style='color:red'>third umpire name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
        }
    }

    function stadiumcapacityy(){
        
        var stadiumcapacity = document.getElementById("stadiumcapacity");
        console.log(stadiumcapacity.value)
        var button=document.getElementById("button");
        if(stadiumcapacity.value >10 && stadiumcapacity.value<=50000){
            
            document.getElementById("valid11").innerHTML="<span style='color:green'>stadiumcapacity is valid</span> ";
            button.removeAttribute("disabled");
            

        }else{
            
            document.getElementById("valid11").innerHTML="<span style='color:red'>stadiumcapacity is invalid</span> ";
            button.setAttribute("disabled","");
            return;
        }
    }   

 function validateForm(){
 var tournamentName = document.getElementById("tournamentName").value;
 var hostingcountry = document.getElementById("hostingcountry").value; 
 var date=document.getElementById("matchdate").value;
 var team1name = document.getElementById("team1name").value;
 var team2name = document.getElementById("team2name").value;
 var team1captainname = document.getElementById("team1captainname").value;
 var team2captainname = document.getElementById("team2captainname").value;
 var umpirename = document.getElementById("umpirename").value;
 var stadiumname = document.getElementById("stadiumname").value;
 var thirdumpirename = document.getElementById("thirdumpirename").value;
 var stadiumcapacity = document.getElementById("stadiumcapacity").value;
 var button=document.getElementById("button");
 if(tournamentName.length>=3 && tournamentName.length<=15 && hostingcountry.length>=3 && hostingcountry.length<=15 && date>0  && date<30 &&
 team1name.length>=3 && team1name.length<=15 && team2name.length>=3 && team2name.length<=15 && team1captainname.length>=3 && team1captainname.length<=15
 && team2captainname.length>=3 && team2captainname.length<=15  && umpirename.length>=3 && umpirename.length<=15 && stadiumname.length>=3 && stadiumname.length<=15
 && thirdumpirename.length>=3 && thirdumpirename.length<=15 && stadiumcapacity >10 && stadiumcapacity<=50000){
    document.getElementById("valid0").innerHTML="<span style='color:green'>given info is valid</span> ";
            button.removeAttribute("disabled");
            

        }else{
            
            document.getElementById("valid0").innerHTML="<span style='color:red'>pls fill the valid info</span> ";
            button.setAttribute("disabled","");
            return;
        }

 }

    
</script>

</body>
</html>