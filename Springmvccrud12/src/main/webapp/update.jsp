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
<form:form action="updatebyname" modelAttribute="updatename">
<form:input path="email"/><br>
<form:input path="name"/><br>
<form:button>submit</form:button>
<form:button>cancel</form:button>
</form:form>
</body>
</html>