<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!doctype html>
    <html lang="en">
      <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
        <style>
            a:active  {border-color: blue;
                
            }
        </style>
    </head>
<body>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="#" style=" color: rgb(196, 200, 200);" >Product</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="bakeryIndex.jsp">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Features</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Pricing</a>
              </li>
              <li class="nav-item">
                <a class="nav-link disabled" aria-disabled="true">Disabled</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <form action="cake" method="post" name="myForm" onclick="return validateForm()">
                  
        <p>
          <span id="valid"></span>
        </p>
          
               
      <p>
        <span id="valid1"></span>
      </p>
        
        
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">Product Name</label>
              <input type="text" name="name"  class="form-control" id="name" aria-describedby="emailHelp" onchange="namee()">
              <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
            </div>
             
      <p>
        <span id="valid2"></span>
      </p>
        
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">Product price</label>
              <input type="number" name="price"  class="form-control" id="price" aria-describedby="emailHelp" onchange="pricee()">
              <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
            </div>

             
      <p>
        <span id="valid3"></span>
      </p>
        

            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">Quantity</label>
              <input type="number" name="quantity"  class="form-control" id="quantity" aria-describedby="emailHelp" onchange="quantityy()">
              <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
            </div>

             
      <p>
        <span id="valid4"></span>
      </p>
        

            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label">Discount</label>
              <select name="discount" class="form-control" id="discount" onchange="discountt()">
                <option value="Select">select</option>
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="20">20</option>
                <option value="25">25</option>
                <option value="30">30</option>
              </select>
            </div>

            <p>
              <span id="valid5"></span>
            </p>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">GST</label>
                <input type="number" name="gst"  class="form-control" id="gst" aria-describedby="emailHelp"  onchange="gstt()">
                
            </div>

            <p>
              <span id="valid6"></span>
            </p>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Manifacture date</label>
                <input type="text" name="manfdate"  class="form-control" id="manfdate" aria-describedby="emailHelp" onchange="manfdatee()">
            </div>

            <p>
              <span id="valid7"></span>
            </p>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Expire date</label>
                <input type="text" name="expiredate"  class="form-control" id="expiredate" aria-describedby="emailHelp"  onchange="expiredatee()">
            </div>
           
            <input type="submit"  name="button" class="btn btn-primary" value="send" id="button" >
        
      </form>
       <script>
        function namee(){
          var name = document.getElementById("name").value;
          console.log(name.value)
          var button=document.getElementById("button");
          if(name.length>=3 && name.length<10){
            document.getElementById("valid1").innerHTML= "<span style='color:green'> name is valid</span> ";
            button.removeAttribute("disabled");
          }else{
            document.getElementById("valid1").innerHTML= "<span style='color:red'> name is invalid</span> ";
            button.setAttribute("disabled","");
            return;
          }
        }

          function pricee(){
          var price=document.getElementById("price").value;
          console.log(price)
          var button=document.getElementById("button");
          if(price>0){
            document.getElementById("valid2").innerHTML= "<span style='color:green'> price is valid</span> ";
            button.removeAttribute("disabled");
          }else{
            document.getElementById("valid2").innerHTML= "<span style='color:red'> price is invalid</span> ";
            button.setAttribute("disabled","");
            return;

          }
       }

         function quantityy(){
           var quantity=document.getElementById("quantity").value;
           console.log(quantity)
           var button=document.getElementById("button");
           if(quantity>0){
             document.getElementById("valid3").innerHTML= "<span style='color:green'> quantity is valid</span> ";
             button.removeAttribute("disabled");
           }else{
             document.getElementById("valid3").innerHTML= "<span style='color:red'> quantity is invalid</span> ";
             button.setAttribute("disabled","");
             return;

           }
         } 




         function discountt(){//onchage 
        
          var discount=document.getElementById("discount").value;//id
          console.log(discount)
          var button=document.getElementById("button");
          if(discount==='Select'){
            document.getElementById("valid4").innerHTML="<span style='color:red'> plese select valid option</span> ";
           button.setAttribute("disabled","");
          }else{
            document.getElementById("valid4").innerHTML="<span style='color:green'> discount  is valid </span> ";
            button.removeAttribute("disabled");
            return;
          } 
        }

        


          function gstt(){
           var gst = document.getElementById("gst").value;
           console.log(gst)
           var button=document.getElementById("button");
           if(gst>0 && gst<=50){
             document.getElementById("valid5").innerHTML= "<span style='color:green'> gst is valid</span> ";
             button.removeAttribute("disabled");
           }else{
             document.getElementById("valid5").innerHTML= "<span style='color:red'> gst is invalid</span> ";
             button.setAttribute("disabled","");
             return;
           }
         }

        function manfdatee(){
          var manfdate = document.getElementById("manfdate").value;
          console.log(manfdate)
          var button=document.getElementById("button");
          if(manfdate===""){
            document.getElementById("valid6").innerHTML= "<span style='color:red'> Manifacture date is invalid</span> ";
            button.setAttribute("disabled","");
          }else{
          document.getElementById("valid6").innerHTML= "<span style='color:green'> Manifacture date is valid</span> ";
            
           button.removeAttribute("disabled");
           return;
         }
       }

       function expiredatee(event){
         var expiredate = document.getElementById("expiredate").value;
         console.log(expiredate)
         var button=document.getElementById("button");
         if(expiredate===""){
           document.getElementById("valid7").innerHTML= "<span style='color:red'> expiredate is invalid</span> ";
           button.setAttribute("disabled","");
         }else{
           document.getElementById("valid7").innerHTML= "<span style='color:green'> expiredate is valid</span> ";
           
           button.removeAttribute("disabled");
           return;
         }
        }

         function validateForm(event){
         var name = document.getElementById("name").value;
         var price=document.getElementById("price").value;
         var quantity=document.getElementById("quantity").value;
         var discount=document.getElementById("discount").value;
         var gst = document.getElementById("gst").value;
         var manfdate = document.getElementById("manfdate").value;
         var expiredate = document.getElementById("expiredate").value; 
        var button=document.getElementById("button");
            if(name.length>=3 && name.length<10 && price>0 && quantity>0 && discount!='Select' && gst>0 && gst<=50 && manfdate!="" && expiredate!=""){
             document.getElementById("valid").innerHTML="<span style='color:green'>given info is valid</span> ";
             button.removeAttribute("disabled");
            

         }else{
            
             document.getElementById("valid").innerHTML="<span style='color:red'>pls fill the valid info</span> ";
             button.setAttribute("disabled","");
             
            
             return;
         }
     }
                    
          

      </script> 

     

</body>
</html>