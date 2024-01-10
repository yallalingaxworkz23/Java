<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="A1" method="post">
        Prodect name<input type="text" name="name" id="name"><br><br>

        Price<input type="text" name="price" id="price"><br><br>

        <select name="type" id="type">
            <option value="0">type</option><br>
            <option value="cloth">cloth</option><br>
            <option value="book">book</option><br>
            <option value="electric">electric</option><br>
            <option value="other">other</option>
        </select>

        <input type="submit"  value="send">

    </form>

</body>
</html>