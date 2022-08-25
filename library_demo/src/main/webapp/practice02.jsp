<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="library.library_demo.model.*"%>
<%
Books book = (Books) request.getAttribute("book");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>practice02</title>
</head>
<body>
	<div style="text-aline: center">
		<h2 style="text-aline: center">詳細画面</h2>
		<hr style="height: 3; background-color: #0000ff" />
		<table style="border:1px solid; margin:0 auto">
			<%
			if (book != null) {
			%>
			<tr　style="border:1px solid; margin:0 auto">
				<th style="background-color: #6666FF; width: 100;border:1px soild; margin:0 auto">ID</th>
				<td style="text-aline: center; width: 200;border:1px soild; margin:0 auto"><%=book.getId() %></td>
			</tr>
			<tr style="border:1px solid; margin:0 auto">
				<th style="background-color: #6666FF; width: 100;border:1px soild; margin:0 auto">名前</th>
				<td style="text-aline: center; width: 200;border:1px soild; margin:0 auto"><%=book.getName() %></td>
			</tr>
			<tr style="border:1px solid; margin:0 auto">
				<th style="background-color: #6666FF; width: 100;border:1px soild; margin:0 auto">価格</th>
				<td style="text-aline: center; width: 200;border:1px soild; margin:0 auto"><%=book.getPrices() %></td>
			</tr>
			<tr style="border:1px solid; margin:0 auto;border:1px soild; margin:0 auto">
				<th style="background-color: #6666FF; width: 100;border:1px soild; margin:0 auto">著者</th>
				<td style="text-aline: center; width: 200;border:1px soild; margin:0 auto"><%=book.getAutor() %></td>
			</tr>
			<tr style="border:1px solid; margin:0 auto">
				<th style="background-color: #6666FF; width: 100;border:1px soild; margin:0 auto">コメント</th>
				<td style="text-aline: center; width: 200;border:1px soild; margin:0 auto"><%=book.getComment() %></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>

</body>
</html>