<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
    <style>
        .form-container {
            width: 50%;
            margin: 0 auto;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            font-weight: bold;
        }
        input, select {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .submit-btn {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    

    <div class="form-container">
        <h2>Registration Form</h2>
        <p>
            <span id="valid0" style="margin-top: 50px;"></span>
          </p>
        <form id="registration-form" action="xworkz" method="post" onclick="return validateForm()">
            <p>
                <span id="valid1" style="margin-top: 50px;"></span>
              </p>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" onchange="namee()" >
            </div>
            <p>
                <span id="valid2" style="margin-top: 50px;"></span>
              </p>
            <div class="form-group">
                <label for="mobileNo">Mobile Number:</label>
                <input type="tel" id="mobileNo" name="mobileNo"  onchange="mobileNoo()">
            </div>
            <p>
                <span id="valid3" style="margin-top: 50px;"></span>
              </p>
            
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="text" id="email" name="email" onchange="emaill()">
            </div>
            <p>
                <span id="valid8" style="margin-top: 50px;"></span>
              </p>
            
            <div class="form-group">
                <label for="dob">Date of Birth:</label>
                <input type="date" id="date" name="dob" onchange="datee()">
            </div>
            <p>
                <span id="valid4" style="margin-top: 50px;"></span>
              </p>
            <div class="form-group">
                <label for="location">Location:</label>
                <select id="location" name="location" onchange="locationn()">
                    <option >select</option>
                    <option >Goa</option>
                    <option >Banglour</option>
                    <option >Raichur</option>
                </select>
            </div>
            <p>
                <span id="valid5" style="margin-top: 50px;"></span>
              </p>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" name="password" id="passwoord" onchange="passwordd()">
            </div>
            <p>
                <span id="valid5" style="margin-top: 50px;"></span>
              </p>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password:</label>
                <input type="password" id="confirmPassword" name="confirmPassword"  onchange="passwordd()">
            </div>
            <div>
            <div class="g-recaptcha"
            data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" onchange="Error()"></div>
        
            <div class="form-group">
                <button type="submit" class="submit-btn" id="button" onchange="validateForm()" onlclick="submit()">Submit</button>
            
            </div>
            <div class="form-group">
                <input type="reset" id="reset" value="reset">
            </div>
            </div>
        </form>
    </div>
    <script>
        function submit(){
            alert('are u conform to submit');
        
       
       function Error(){
        const error=grecaptcha.getResponse();
        console.log(error)
        var button=document.getElementById("button");
        if(error.length===0){
            button.setAttribute("disabled","");
            
        }else{
            button.removeAttribute("disabled");

        }
       }
              
    
        function namee(event){
            var name =document.getElementById("name").value;
            console.log(name)
            var button=document.getElementById("button");
            if(name.length>=3 && name.length<=15){
                document.getElementById("valid1").innerHTML="<span style='color:green'>Name is valid</span> ";
                 button.removeAttribute("disabled");
            }else{
                document.getElementById("valid1").innerHTML="<span style='color:red'>Name is invalid </span> ";
            button.setAttribute("disabled","");
            return;
            }

        }

        function mobileNoo(event){
            var mobileNo=document.getElementById("mobileNo").value;
            console.log(mobileNo)
            var button=document.getElementById("button");
            if(mobileNo>1000000000 && mobileNo<9999999999){
                document.getElementById("valid2").innerHTML="<span style='color:green'>number is valid</span> ";
                 button.removeAttribute("disabled");
            }else{
                document.getElementById("valid2").innerHTML="<span style='color:red'>number is invalid </span> ";
            button.setAttribute("disabled","");
            return;
            }
        }

        function emaill(event){
            var email=document.getElementById("email").value;
            console.log(email)
            var button=document.getElementById("button");
        if(email.length>7 && email.length<50){
            document.getElementById("valid3").innerHTML="<span style='color:green'>email is valid</span> ";
                 button.removeAttribute("disabled");
            }else{
                document.getElementById("valid3").innerHTML="<span style='color:red'>email is invalid </span> ";
            button.setAttribute("disabled","");
            return;
            }

        }

        function datee(event){
            var date=document.getElementById("date").value;
            console.log(date)
            var button=document.getElementById("button");
            if(date!=""){
            	console.log("date is valid")
                document.getElementById("valid8").innerHTML="<span style='color:green'>date is valid</span> ";
                 button.removeAttribute("disabled");
            }else{
            	console.log("It is Invalid")
                document.getElementById("valid8").innerHTML="<span style='color:red'>date is invalid </span> ";
            button.setAttribute("disabled","");
            return;
            }
        }




        function locationn(event){
            var location=document.getElementById("location").value;
            console.log(location)
            var button=document.getElementById("button");
            if(location==='select'){
                document.getElementById("valid4").innerHTML="<span style='color:red'>option is invalid</span> ";
                button.setAttribute("disabled","");

            }else{
                document.getElementById("valid4").innerHTML="<span style='color:green'>option is valid </span> ";
                button.removeAttribute("disabled");

            return;
            }
        }

     
       

        function passwordd(event){
            var password=document.getElementById("passwoord").value;
            var cpassword=document.getElementById("confirmPassword").value;
            console.log(cpassword)
            var button=document.getElementById("button");
            if(password.length>=8 && password.length<20 && password===cpassword){
                document.getElementById("valid5").innerHTML="<span style='color:green'>password is valid</span> ";
                 button.removeAttribute("disabled");
            }else{
                document.getElementById("valid5").innerHTML="<span style='color:red'>password is invalid </span> ";
            button.setAttribute("disabled","");
            return;
            }
        }
        
        function validateForm(event){
            var name =document.getElementById("name").value;
            var mobileNo=document.getElementById("mobileNo").value;
            var email=document.getElementById("email").value;
            var date=document.getElementById("date").value;
            var location=document.getElementById("location").value;
            var password=document.getElementById("passwoord").value;
            var cpassword=document.getElementById("confirmPassword").value;
            var button =document.getElementById("button");

            if(name.length>=3 && name.length<=15 && mobileNo>1000000000 && mobileNo<9999999999 && email.length>7 && email.length<50 && date!="" && location!='select' && password.length>=8 && password.length<20 && password===cpassword){
            document.getElementById("valid0").innerHTML="<span style='color:green'>given info is valid</span> ";
            button.removeAttribute("disabled");
            

        }else{
            
            document.getElementById("valid0").innerHTML="<span style='color:red'>pls fill the valid info</span> ";
            button.setAttribute("disabled","");
            return;
        }
    }
        }           
    </script>
    <script src='https://www.google.com/recaptcha/api.js'></script>
</body>
</html>
