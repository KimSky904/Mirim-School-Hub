<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="value" items="${list}">${value.userId}, ${value.userpass}, ${value.username}, ${value.useremail}, ${value.usertel} </c:forEach>
</body>
</html>