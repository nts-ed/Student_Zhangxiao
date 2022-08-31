<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="susi.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>寿司屋</title>
</head>
<body>
<%
	Order order=(Order)session.getAttribute("order");
%>
<p>注文数を入力してください。</p>
<form action="/susi/orderMain" method="post">
<% for(int i=0;i<order.getNames().length;i++){ %>
<%=order.getNames()[i] %><input type="number" min="0" name="counts" value="<%=order.getCounts()[i] %>">皿<br>
<%} %>
<input type="submit" value="注文">
</form>

</body>
</html>