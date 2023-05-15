<%--
  Created by IntelliJ IDEA.
  User: randy
  Date: 5/15/23
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Ads</title>
</head>
<body>
    <div>
        <form action="/ads/create" method="post">
            <input type="text" name="title" placeholder="Ad Title" required>
            <input type="text" name="description" placeholder="Ad Description" required>
            <input type="submit" value="Create Ad">
        </form>
    </div>
</body>
</html>
