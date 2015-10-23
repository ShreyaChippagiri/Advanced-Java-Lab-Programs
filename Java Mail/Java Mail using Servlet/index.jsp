<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
	<form action="urlName" method="POST">
		
		To : <input type="text" name="to"/><br>

		Subject : <input type="text" name="sub"/><br>

		Message : <textarea name="msg" cols="25" rows="5"></textarea><br>

		Login : <input type="text" name="userName"/><br>

		Password : <input type="password" name="pass"/><br>

		<input type="submit" value="Send Mail"/>
	</form>
</body>
</html>
