<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
     <body bgcolor="#CCE5FF">
     
        <h1>Entry Form</h1>
        
        <form name="loginForm" method="post" action="webDb">
            First Name: 
            <input type="text" name="first_name"  /><br/><br/>
            Last Name:
            <input type="text" name="last_name" ><br/><br/>
            <br/>
            <input type="submit" value="Submit" name="submit" />
        </form>
    </body>
</html>
