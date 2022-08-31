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
	<p>
		ご注文は「<%=order.getMsg()%>」です。
	</p>
	<p>
		合計<%=order.getTotalCount()%>皿で<%=order.getTotalFee()%>円頂戴致します！
	</p>
	<a href="/susi/orderMain">戻る</a>
</body>
</html>