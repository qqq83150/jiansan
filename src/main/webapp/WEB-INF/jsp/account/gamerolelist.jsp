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
	<h3>角色管理</h3>
	<a href="${pageContext.request.contextPath }/account/toGameRoleAdd" class="btn btn-success">添加角色</a>
	<a href="${pageContext.request.contextPath}/account/list" class="btn btn-warning">返回</a>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>角色名</td>
			<td>游戏帐号</td>
			<td>游戏密码</td>
<<<<<<< HEAD
			<td>微信名</td>
=======
			<td>微信号</td>
>>>>>>> 1398c9726c7ae0c272e65c7d8801dfe75e816bdb
			<!-- <td>姓名</td>
			<td>手机号</td>
			<td>操作</td> -->
		</tr>
		<c:forEach items="${list }" var="gameRole" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${gameRole.name }</td>
			<td>${gameRole.account.username }</td>
			<td>${gameRole.account.password }</td>
<<<<<<< HEAD
			<td>${gameRole.account.weixin.realName }</td>
=======
			<td>${gameRole.account.weixin.weixinName }</td>
>>>>>>> 1398c9726c7ae0c272e65c7d8801dfe75e816bdb
			<%-- <td>${gameRole.account.weixin.realName }</td>
			<td>${gameRole.account.weixin.phone }</td>
			<td>操作</td> --%>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>