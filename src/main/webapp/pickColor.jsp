<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Pick Your Favorite Color</title>
</head>
<body>
<h1>Enter Your Favorite Color</h1>
<form action="pickColor" method="POST">
  <label for="color">Color:</label>
  <input type="text" name="color" id="color">
  <input type="submit" value="Submit">
</form>
</body>
</html>