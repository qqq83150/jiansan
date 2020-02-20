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
	<h2>帐户管理</h2>
	<a href="${pageContext.request.contextPath }/account/gameRoleList" class="btn btn-primary">角色管理</a>
	<a href="${pageContext.request.contextPath }/account/accountList" class="btn btn-primary">游戏帐号管理</a>
	<a href="${pageContext.request.contextPath }/account/weixinList" class="btn btn-primary">微信管理</a>
	<h3>角色列表</h3>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>角色名</td>
			<td>游戏帐号</td>
			<td>游戏密码</td>
			<td>微信号</td>
			<td>微信名</td>
			<!-- <td>手机号</td>
			<td>操作</td> -->
		</tr>
		<c:forEach items="${list }" var="gameRole" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${gameRole.name }</td>
			<td>${gameRole.account.username }</td>
			<td>${gameRole.account.password }</td>
			<td>${gameRole.account.weixin.weixinName }</td>
			<td>${gameRole.account.weixin.realName }</td>
			<%--<td>${gameRole.account.weixin.phone }</td>
			<td>操作</td> --%>
		</tr>
		</c:forEach>
	</table>
</body>
</html>