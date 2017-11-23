<%--
  Created by IntelliJ IDEA.
  User: sean
  Date: 2017/11/15
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<h1>欢迎登录!${user.username }</h1>
	<form action="${pageContext.request.contextPath }/loginUser" method="post">
		<input type="text" name="username"><br>
		<input type="password" name="password"><br>
		<input type="submit" value="提交">
	</form>
</head>
<body>

</body>
</html>
