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
    </c:if>c:if>
    <form action="${pageContext.request.contextPath}/WEB-INF/register.jsp" method="post">
        <div class="form-group">
            <label for="userName">Registration Form</label>
            <input id="userName" name="userName" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <textarea id="email" name="email" class="form-control" type="text"></textarea>
        </div>
        <div class="form-group">
            <label for="password">Email</label>
            <textarea id="password" name="password" class="form-control" type="text"></textarea>
        </div>
        <input type="submit" class="btn btn-block btn-primary">
    </form>
</div>
</body>
</html>
