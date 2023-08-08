<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link rel="stylesheet" href="CSS/index.css">
</head>
<body>
    <h1 id="h_1"><u>Registration Form</u></h1>
    <marquee behavior="alternate" direction="right" scrollamount="28">
        <h3 id="h_3">Enter your details for Registration</h3>
    </marquee>
    <br><br>
    <form action="UserServlet" method="post">
        <table>
            <tr>
                <p>Name:*<input type="text" name="name" placeholder="Enter your name" required></p>
            </tr>
            <tr id="add">
                <p>Address: <input type="text" name="address" id="address" placeholder="Enter your address"></p>
            </tr>
            <tr>
                <p>Email:*<input type="email" name="email"  id="email" placeholder="Enter your Email id" required></p>
            </tr>
            <tr>
                <p>Phone Number:*<input type="text" name="phone" placeholder="Enter your phone number" maxlength="10" required></p>
            </tr>
            <tr>
                <p>Password:*<input type="password" name="password" placeholder="Enter your password" required></p>
            </tr>
            <tr>
                <p>Age:<input type="text" name="age" placeholder="Enter your age" maxlength="3"></p>
            </tr>
            <p> 
            <button id="btn1" type="submit">Submit</button>
            <button id="btn2" type="reset">Clear</button>
            <!--<input type="submit" value="Pay Now">
            <input type="reset" value="Clear">-->
            </p>
        </table>
    </form>
</body>
</html>