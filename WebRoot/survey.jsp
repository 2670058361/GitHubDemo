<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'survey.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.errorClass{
	color: red;
}
</style>
</head>

<body>
<form:form  action="bbb.form" modelAttribute="degree" method="post">
		<fieldset>&nbsp; 
			<legend>試試</legend>
		</fieldset>
		<fieldset>
			<legend>读者调查问卷</legend>
			<!-- 基本信息 -->
			<fieldset>
				<legend>基本信息</legend>
				<table>
					<tr>
						<td>姓名：</td>
						<td><input name="name"><form:errors path="name" cssClass="errorClass" element="div"></form:errors>
						</td>
						<td>年龄：<input name="age"><form:errors path="age" cssClass="errorClass" element="div"></form:errors>
						</td>
						<td>联系电话：</td>
						<td><input name="dianhua"><form:errors path="dianhua" cssClass="errorClass" element="div"></form:errors>
						</td>
					</tr>
				</table>
			</fieldset>
			<!-- 调查信息 -->
			<fieldset>
				<legend>调查信息</legend>
				<b>您喜欢本期的封面和内容版式设计吗？</b><br />
				<textarea name="a1" rows="3" cols="100"></textarea>
				<hr />
				<b>您喜欢本期的哪几篇文章？</b><br />
				<textarea name="a2" rows="3" cols="100"></textarea>
				<hr />
				<b>您不喜欢本期的哪几篇文章？</b><br />
				<textarea name="a3" rows="3" cols="100"></textarea>
				<hr />
			</fieldset>
			<center>
				<input type="submit" value="提交数据">
			</center>
		</fieldset>
</form:form>
</body>
</html>
