<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<div class="container">
    <h1>Register a new user</h1>
    <c:if test="${register}">
        <div class="alert alert-danger">
            <ul>
                <c:forEach items="${errors}" var="error">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </div>
    </c:if>
    <div class="container">
        <form action="${pageContext.request.contextPath}/register" method="post">
            <div class="form-group">
                <label for="username">UserName</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input id="email" name="email" class="form-control" type="email">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <div>
                <input type="submit" class="btn btn-block btn-primary">
            </div>
        </form>
    </div>
    <div class="container">
        <form action="${pageContext.request.contextPath}/profile" method="post">
            <div class="form-group">
                <label for="username">UserName</label>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
            </div>

        </form>
    </div>
</div>
</body>
</html>

