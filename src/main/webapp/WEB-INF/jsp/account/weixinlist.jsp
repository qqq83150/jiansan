<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h3>微信管理</h3>
	<a href="${pageContext.request.contextPath }/account/toWeixinAdd" class="btn btn-success">添加微信</a>
	<a href="${pageContext.request.contextPath}/account/list" class="btn btn-warning">返回</a>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>微信号</td>
			 <td>微信名</td>
			<!--<td>手机号</td> 
			<td>操作</td>-->
		</tr>
		<c:forEach items="${list }" var="weixin" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${weixin.weixinName }</td>
			<td>${weixin.realName }</td>
			<%-- <td>${weixin.phone }</td> 
			<td>操作</td>--%>
		</tr>
		</c:forEach>
	</table>
</body>
</html>