<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<h2>Movies</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Year</th>
        <th>Path</th>
        <th>Viewed</th>
    </tr>
    <c:forEach items="${movies}" var="m">
        <tr>
            <td>${m.id}</td>
            <td>${m.name}</td>
            <td>${m.description}</td>
            <td>${m.year}</td>
            <td>${m.path}</td>
            <td>${m.viewed}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
