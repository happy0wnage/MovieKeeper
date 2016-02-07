<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<h2>Users</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Login</th>
        <th>Psw</th>
        <th>Email</th>
        <th>First name</th>
        <th>Second name</th>
        <th>Movies</th>
    </tr>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.login}</td>
            <td>${u.password}</td>
            <td>${u.email}</td>
            <td>${u.firstName}</td>
            <td>${u.secondName}</td>
            <td>
                <c:forEach items="${u.movies}" var="m">
                    ${m.name}
                    <br/>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
