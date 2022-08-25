<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@page import="library.library_demo.model.*"%>

<!DOCTYPE html>
<%
ArrayList<Books> list = (ArrayList<Books>) request.getAttribute("list");
%>
<html>
<head>
<meta charset="UTF-8">
<title>practice01</title>
</head>
<body>
<div style="text-aline:center">
	<h2 style="text-aline:center">一覧表</h2>
	 <hr style="height:3; background-color:#0000ff" />
	<br>
	<table style="border:1px soild; margin:0 auto">
		<tr style="border:1px solid; margin:0 auto">
			<th style="background-color:#0000ff; width:120;border:1px solid; margin:0 auto">ID</th>
			<th style="background-color:#0000ff; width:200;border:1px solid; margin:0 auto">名前</th>
		</tr>
	
		<%
		if(list!=null){
			for(int i=0;i<list.size();i++){
		%>
		<tr style="border:1px solid; margin:0 auto">
		<td style="text-align:center; width:100;border:1px solid; margin:0 auto"><a href="<%=request.getContextPath() %>/serice02?id=<%=list.get(i).getId()%>"><%= list.get(i).getId()%></a></td>
		<td style="text-align:center; width:100;border:1px solid; margin:0 auto"><%= list.get(i).getName()%></td>
		</tr>
		<%
			}
		}
		%>
	</table>
</div>
</body>
</html>