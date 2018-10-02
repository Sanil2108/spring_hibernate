<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>List customers</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>Customers</h2>
    </div>
    <div id="container">
        <div id="content">
            <table>
                <tr>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>

                <c:forEach var="tempCustomers" items="${customers}">
                    <c:url var="updateLink" value="/customer/showFormForUpdate">
                        <c:param name="customerId" value="${tempCustomers.id}"></c:param>
                    </c:url>
                    <tr>
                        <td>${tempCustomers.firstName}</td>
                        <td>${tempCustomers.lastName}</td>
                        <td>${tempCustomers.email}</td>
                        <td><a href="${updateLink}">update</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>


<a href="/customer/new">Create a new customer</a>

</body>
</html>