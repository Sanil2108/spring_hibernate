<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    <c:forEach var="contact" items="${contacts}">
        <tr>
            <td>${contact.id}</td>
            <td>${contact.name}</td>
            <td>${contact.email}</td>
            <td>${contact.phone}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
