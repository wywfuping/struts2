<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>user list 哈哈</h3>
    <ul>
        <c:forEach items="${names}" var="name">
            <li>${name}</li>
        </c:forEach>
    </ul>
</body>
</html>
