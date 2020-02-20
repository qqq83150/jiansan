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
	<h2>活动管理</h2>
	<a href="${pageContext.request.contextPath}/taskType/toAdd" class="btn btn-success">添加活动</a>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>活动名称</td>
			<td>活动描述</td>
			<td>活动收入</td>
			<!-- <td>操作</td> -->
		</tr>
		<c:forEach items="${list }" var="tt" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${tt.name }</td>
			<td>${tt.description }</td>
			<td>${tt.money }${tt.unit }</td>
			<%-- <td>
				<a href="${pageContext.request.contextPath}/taskType/toUpdate/${tt.id}">修改</a>
			</td> --%>
		</tr>
		</c:forEach>
	</table>
</body>
</html>