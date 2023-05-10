<!DOCTYPE html>
<html>
<head>
  <title>Pizza Order</title>
</head>
<body>
<h1>Pizza Order Form</h1>
<form action="${pageContext.request.contextPath}/pizzaOrder.jsp" method="POST">

  <label for="crust">Crust Type:</label>
  <select name="crust" id="crust">
    <option value="thin">Thin</option>
    <option value="thick">Thick</option>
  </select>

  <label for="sauce">Sauce Type:</label>
  <select name="sauce" id="sauce">
    <option value="tomato">Tomato</option>
    <option value="pesto">Pesto</option>
  </select>

  <label for="size">Size Type:</label>
  <select name="size" id="size">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
  </select>

  <p>Toppings:</p>
  <label><input type="checkbox" name="topping" value="pepperoni"> Pepperoni</label>
  <label><input type="checkbox" name="topping" value="mushrooms"> Mushrooms</label>
  <label><input type="checkbox" name="topping" value="olives"> Olives</label>

  <p>Delivery Address:</p>
  <label><input type="text" name="address" id="address"></label>
  <input type="submit" value="Submit Order"/>
</form>
</body>
</html>