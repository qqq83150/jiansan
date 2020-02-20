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
	<h3>收入统计</h3>
	<p>总收入：${totalMoney }</p>
	<p>本周收入：${recentWeekMoney }</p>
	<p>本月收入：${recentMonthMoney }</p>
	<table border="1" class="table table-hover">
		<tr>
			<td>编号</td>
			<td>年月</td>
			<td>收入</td>
		</tr>
		<c:forEach items="${list }" var="vo" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${vo.date }</td>
			<td>${vo.money }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/summary/list" class="btn btn-warning">返回</a>
</body>
</html>