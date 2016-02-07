<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<h2>Series</h2>
<table>
    <tr>
        <th>ID</th>
        <th>Movie</th>
        <th>Season</th>
        <th>Episode</th>
        <th>Name</th>
        <th>Viewed</th>
    </tr>
    <c:forEach items="${series}" var="m">
        <tr>
            <td>${m.id}</td>
            <td>${m.movie.name}</td>
            <td>${m.season}</td>
            <td>${m.episode}</td>
            <td>${m.name}</td>
            <td>${m.viewed}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
