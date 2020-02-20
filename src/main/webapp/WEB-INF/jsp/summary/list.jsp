<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h2>收入明细</h2>
	<a href="${pageContext.request.contextPath }/summary/summary" class="btn btn-info">统计</a>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>金额</td>
			<td>微信</td>
			<td>入帐时间</td>
			<!-- <td>操作</td> -->
		</tr>
		<c:forEach items="${list }" var="money" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${money.money }元</td>
			<td>${money.gameRole.account.weixin.weixinName }</td>
			<td><fmt:formatDate value="${money.ctime }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<!-- <td>操作</td> -->
		</tr>
		</c:forEach>
	</table>
	<hr/>
	<a href="${pageContext.request.contextPath }/summary/list?pageNum=1" class="btn btn-default">首页</a>
	<a href="${pageContext.request.contextPath }/summary/list?pageNum=${pageNum==1?1:pageNum-1}" class="btn btn-default">上一页</a>
	<a href="${pageContext.request.contextPath }/summary/list?pageNum=${pageNum==pageCount?pageCount:pageNum+1}" class="btn btn-default">下一页</a>
	<a href="${pageContext.request.contextPath }/summary/list?pageNum=${pageCount}" class="btn btn-default">末页</a>
	共${total}条，每页${pageSize }条，当前${pageNum }/${pageCount }页
</body>
</html>