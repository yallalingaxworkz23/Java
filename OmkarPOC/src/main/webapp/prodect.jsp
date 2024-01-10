
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
                <a class="nav-link active" aria-current="page" href="#">Home</a>
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
      <form action="bay" method="post" name="myForm" onsubmit="return validateForm()">
      <p style="color: red;">${price}</p>
      <p>
        <span id="valid" style="padding-left: 70px;"></span>
      </p>
        
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">Product Name</label>
              <input type="text" name="name"  class="form-control" id="name" aria-describedby="emailHelp" onchange="namee()">
              <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label">Type</label>
              <select name="select" class="form-control" id="type" onchange="selectt()">
                <option >Select</option>
                <option value="small">Small</option>
                <option value="medeam">Medeam</option>
                <option value="larg">Large</option>
              </select>
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Price</label>
                <input type="text" name="price"  class="form-control" id="price" aria-describedby="emailHelp"  onchange="pricee()">
                
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Brand</label>
                <input type="text" name="brand"  class="form-control" id="brand" aria-describedby="emailHelp" onchange="brandd()">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Quantity</label>
                <input type="number" name="quantity"  class="form-control" id="quantity" aria-describedby="emailHelp"  onchange="quantityy()">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Description</label>
                <input type="text" name="desc"  class="form-control" id="desc" aria-describedby="emailHelp" onchange="descc()">

            </div>
            <input type="submit"  name="button" class="btn btn-primary" value="send" id="button" >
        
      </form>
      <script>
        function namee(event){
          var name = document.getElementById("name");
          console.log(name.value)
          if(name.value.length>=3 && name.value.length<10){
            document.getElementById("valid").innerHTML= "<span style='color:green'> name is valid</span> ";
          }else{
            document.getElementById("valid").innerHTML= "<span style='color:red'> name is invalid</span> ";
            return;
          }
        }

        function selectt(){//onchage 
          var disabled=true;
          var type=document.getElementById("type");//id
          console.log(type.value)
          var button=document.getElementById("button");
          if(type.value==='Select'){
            document.getElementById("valid").innerHTML=disabled;

            document.getElementById("valid").innerHTML= "<span style='color:red'> plese select valid option</span> ";
            button.setAttribute("disabled","");
          }else{
            button.removeAttribute("disabled");
            return;
          }

        }


        function pricee(event){
          var price = document.getElementById("price");
          console.log(price.value)
          if(price.value>0 && price.value<=50){
            document.getElementById("valid").innerHTML= "<span style='color:green'> price is valid</span> ";
          }else{
            document.getElementById("valid").innerHTML= "<span style='color:red'> price is invalid</span> ";
            return;
          }
        }

        function brandd(event){
          var brand = document.getElementById("brand");
          console.log(brand.value)
          if(brand.value.length>=3 && brand.value.length<=8){
            document.getElementById("valid").innerHTML= "<span style='color:green'> brand is valid</span> ";
          }else{
            document.getElementById("valid").innerHTML= "<span style='color:red'> brand is invalid</span> ";
            return;
          }
        }

        function quantityy(event){
          var quantity = document.getElementById("quantity");
          console.log(quantity.value)
          if(quantity.value>0 && quantity.value<=50){
            document.getElementById("valid").innerHTML= "<span style='color:green'> quantity is valid</span> ";
          }else{
            document.getElementById("valid").innerHTML= "<span style='color:red'> quantity is invalid</span> ";
            return;
          }
        }


        function descc(event){
          var desc = document.getElementById("desc");
          console.log(desc.value)
          if(desc.value.length>=30){
            document.getElementById("valid").innerHTML= "<span style='color:green'> desc is valid</span> ";
          }else{
            document.getElementById("valid").innerHTML= "<span style='color:red'> desc is invalid</span> ";
            return;
          }
        }



      </script>

     

</body>
</html>