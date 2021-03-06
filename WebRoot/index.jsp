<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
 
  <form:form action="#" modelAttribute="info" method="post"> 
  		 <table>
  		 	<tr>
  		 		<td>用户名字</td><td><input type="text"></td>
  		 	</tr>
  		 	<tr>
  		 		<td>密码</td><td><input type="password"></td>
  		 	</tr>
  		 	<tr>
  		 		<td>姓名</td><td><input type="text"></td>
  		 	</tr>
  		 	<tr>
  		 		<td>工资</td><td><input type="text"></td>
  		 	</tr>
  		 	<tr>
  		 		<td>省份</td><td>
  		 			<form:select path="list">
  		 				<form:options items="${userinfo.list}"  "/>
  		 			</form:select>
  		 		</td>
  		 	</tr>
  		 	<tr>
  		 		<td>特长</td><td>
  		 			<form:checkboxes items="${userinfo.tc}" path="tc" />
  		 		</td>
  		 	</tr>
  		 	<tr>
  		 		<td colspan="2" align="center">
  		 		<input type="submit" value="提交">
  		 		</td>
  		 	</tr>
  		 </table>
  </form:form>
  </body>
</html>
