<%@page import="jsp.jese8.Dto.EmpDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>email</th>
<th>pwd</th>
<th>name</th>
<th>phone</th>
<th>role</th>
</tr>
<%
EmpDto dto=(EmpDto)request.getAttribute("requestkey");
%>
<tr>
<td><%= dto.getEmail() %></td>
<td><%= dto.getPwd() %></td>
<td><%=dto.getName() %></td>
<td><%=dto.getPhone() %></td>
<td><%=dto.getRole() %></td>
</tr>
</table>
</body>
</html>