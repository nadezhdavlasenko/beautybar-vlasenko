<%--
  Created by IntelliJ IDEA.
  User: nadezhdavlasenko
  Date: 20.08.2018
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
</head>
<body>
    <h3>Sign up</h3>
    <hr/>
        <form name="signupForm" method="POST" action="../Servlettest">
            <input type="hidden" name="command" value="signup"/>
            Name:<br/>
            <input type="text" name="name" value=""> <br/>
            Email:<br/>
            <input type="email" name="email" value="">
            <br/>
            Password:<br/>
            <input type="password" name ="password" value="">
            <br/>
            Phone:<br/>
            <input type="tel" name ="phone" value="">
            <br/>
            <input type="submit" value="Enter">

        </form>
    <hr/>
</body>
</html>
