<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sanil
  Date: 29/9/18
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Save customer</title>
</head>
<body>

    <form:form action="/customer/save" method="post" modelAttribute="customer">
        First name :
        <form:input path="firstName"></form:input>
        <br>Last name :
        <form:input path="lastName"></form:input>
        <br>Email :
        <form:input path="email"></form:input>
        <br>
        <input type="submit">
    </form:form>

    <br><br>

    <%--<form action="/customer/save" method="post">--%>
        <%--First name--%>
        <%--<input type="text" name="fname"><br>--%>
        <%--Last name--%>
        <%--<input type="text" name="lname"><br>--%>
        <%--Email--%>
        <%--<input type="text" name="email"><br>--%>
        <%--<input type="submit">--%>
    <%--</form>--%>
</body>
</html>
