<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="test" class="p1.TestBean" scope="application"></jsp:useBean>
<jsp:setProperty name="test" property="user" param="txtUser"/><br>
<jsp:setProperty name="test" property="email" param="txtMail"/><br>
The User name is <jsp:getProperty name="test" property="user"/><br>
The Email is <jsp:getProperty name="test" property="email"/>
</body>
</html>









