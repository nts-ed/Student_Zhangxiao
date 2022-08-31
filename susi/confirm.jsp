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
	Order order = (Order) session.getAttribute("order");
	%>
	<p>確認</p>
	<%
	for (int i = 0; i < order.getNames().length; i++) {
	%>
	<%=order.getNames()[i]%>:<%=order.getCounts()[i]%>皿
	<br>
	<br>
	<%
	}
	%>
	<a href="/susi/orderMain?action=back">戻る</a>
	<a href="/susi/orderMain?action=submit">確認</a>
</body>
</html>