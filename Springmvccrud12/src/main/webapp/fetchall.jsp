<%@page import="jsp.jese8.Dto.EmpDto"%>
<%@page import="java.util.List"%>
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
List<EmpDto>emp1=(List<EmpDto>) request.getAttribute("formkey");
for(EmpDto dto2: emp1){

%>
<tr>
<td><%= dto2.getEmail() %></td>
<td><%= dto2.getPwd() %></td>
<td><%=dto2.getName() %></td>
<td><%=dto2.getPhone() %></td>
<td><%=dto2.getRole() %></td>
</tr>
<% }%>
</table>
</body>
</html>