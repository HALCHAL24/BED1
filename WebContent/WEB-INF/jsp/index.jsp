<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CreditCard-Home Page</title>
    </head>

    <body bgcolor="cyan">
        <h1> Check for Credit Card Eligibility </h1>
       
        <form action="checkEligibility">
            <label>Enter PAN Number: &nbsp;&nbsp;</label><input type="text" id="panNo" name="PanNum" 
                                                    pattern="[a-zA-Z0-9]{10}$" title="Must be 10 Character Alphanumeric." required/>
            <br><br>
            <input type="submit" id="submit" value="Check"/>
 
                </form>
                </body>
</html>