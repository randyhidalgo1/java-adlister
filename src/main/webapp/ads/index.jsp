<%@ page import="java.util.List" %>
<%@ page import="model.Ad" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All dao.Ads</title>
    <style>
        .ad {
            border: 1px solid #000;
            margin: 10px;
            padding: 10px;
        }
        .ad h2 {
            margin: 0;
        }
    </style>
</head>
<body>
<h1>All dao.Ads</h1>
<ul class="ad">
    <%
        @SuppressWarnings("unchecked")
        List<Ad> ads = (List<Ad>) request.getAttribute("ads");
    if (ads!=null) {
    for (Ad ad : ads) { %>
    <li>
        <h2><%= ad.getTitle() %></h2>
        <p><%= ad.getDescription() %></p>
    </li>
    <% }
    } %>
</ul>
</body>
</html>
