<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>View Your Favorite Color</title>
  <style>
    body {
      background-color: <%= request.getAttribute("color") %>;
    }
  </style>
</head>
<body>
<h1>Your Favorite Color is <%= request.getAttribute("color") %></h1>
</body>
</html>