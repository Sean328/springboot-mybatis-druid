<%--
  Created by IntelliJ IDEA.
  User: sean
  Date: 2017/11/15
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>欢迎登录!${user.username }</h1>
  <h1>欢迎${user.username }光临!请选择你的操作:</h1><br>
  <ul>
    <shiro:hasPermission name="add"><li>增加</li></shiro:hasPermission>
    <shiro:hasPermission name="delete"><li>删除</li></shiro:hasPermission>
    <shiro:hasPermission name="update"><li>修改</li></shiro:hasPermission>
    <shiro:hasPermission name="query"><li>查询</li></shiro:hasPermission>
  </ul>
  <a href="${pageContext.request.contextPath }/logOut">点我注销</a>
  </body>
</html>
