<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css"> <!-- Link to your CSS file -->
        <!-- /* Basic CSS styling for the elements */ -->
    <style>
    .menu-bar {
        background-color: #333;
        color: rgb(244, 129, 129);
        padding: 10px;
        margin-left: 0;
    }
     .menu-bar ul {
        list-style-type: none;
        padding: 0;
        margin-left: 1100px;
        font-size: x-large;
    }
    
    .menu-bar li {
        display: inline;
        margin-right: 20px;
    }
    
    .navbar {
        background-color: #f8f9fa;
    }
    
    .navbar-toggler-icon {
        border: 0;
        /* Add your icon styles here */
    }
    
    .form-floating {
        margin-bottom: 20px;
    }
    
    .form-floating input[type="text"],
    .form-floating select {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    
    input[type="submit"] {
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }
    </style>
    
    <!-- /* Add more styles as needed */ -->
    
    </head>
    <body>
        <div class="menu-bar">
            <ul>
                
                <li>Home</a></li>
                
            </ul>
        </div>
        <form action="loaan" method="post">
            <nav class="navbar navbar-expand-lg bg-light">
                <div class="container-fluid">
                    <!-- <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation"> -->
                        <span class="navbar-toggler-icon"></span> <!-- Use an appropriate icon here -->
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                    
                        <ul class="navbar-nav">Name:<input type="text" name="name" placeholder="holdar name"></ul>
                        <ul class="navbar-nav">Amount: <input type="number" name="cost"  placeholder="Amount"></ul>
                        <ul class="navbar-nav">Working: <input type="radio" name="radio" value="yes">Employ
                            <input type="radio" name="radio" value="no">UnEmploy </ul>
                        <ul class="navbar-nav">Intrest: <input type="text" name="intrest" placeholder="interst in persent"></ul>
                        <ul class="navbar-nav">Surety: <input type="text" name="surety" placeholder="Surety name"></ul>
                        <ul class="navbar-nav">Company: <input type="text" name="company" placeholder="Company name"></ul>
                        <ul class="navbar-nav">Loan Tenure : <input type="number" name="tenuer" placeholder="emi"></ul>
                        <ul class="navbar-nav">Loan Type: <input type="text" name="type" placeholder="loan type"></ul>
                        <ul><input type="submit" value="save"></ul>
                    </div>
                </div>
                
            </nav>
            
           
     
        </form>
    </body>
</html>