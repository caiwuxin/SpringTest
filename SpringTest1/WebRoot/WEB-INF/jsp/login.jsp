<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>帕蒂唐home登陆</title>

  </head>
  
  <body>
    	<c:if test="${!empty error}">
    		<span style="color: red"><c:out value="${error }"/></span>
    	</c:if>
    	<form action='<c:url value="/loginCheck.html"/>' method="post">
    		用户名：
    		<input type="text" name="loginName">
    		<br/>
    		密码：
    		<input	type="password" name="password">
    		<br/>
    		<input type="submit" value="登陆"/>
    		<input type="reset" value="重置"/>
    	</form>
  </body>
</html>
