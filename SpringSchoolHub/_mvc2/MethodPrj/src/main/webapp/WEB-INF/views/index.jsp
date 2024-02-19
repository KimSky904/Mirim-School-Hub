<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi Spring MVC!</h1>
	
	
	<img src="1.svg" width="150" height="50"><br/>
	<a href="test1">test1 get</a><br/>
	
	
	<form method="post" action="test2">
		ID : <input type="text" name="userId"/><br/>
		PW : <input type="password" name="pass"/><br/>
		<button type="submit">전송</button>
	</form>


	
	<a href="test3">test3 get_post</a><br/>

	<a href="test4">test4 get</a><br/>
		<form method="post" action="test5">
		ID : <input type="text" name="userId"/><br/>
		PW : <input type="password" name="pass"/><br/>
		<button type="submit">전송</button>
	</form>

</body>
</html>