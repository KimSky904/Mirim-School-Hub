<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red;">Hello, World!!!!!</h1>
<a href="test1?data1=100&data2=200">test1 map으로 받기</a><br>
<a href="test2?data1=100&data2=200&data3=30">test2 list으로 받기</a><br>
<a href="test3?data1=500&data2=600&data3=700">test3 @ModelAttribute로 받기</a><br>
<a href="test4?data1=500&data2=600&data3=700&data3=800">test3 @ModelAttribute로 배열받기</a><br>
</body>
</html>