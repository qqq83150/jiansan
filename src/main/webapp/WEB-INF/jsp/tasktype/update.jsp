<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h3>修改活动</h3>
	<form action="${pageContext.request.contextPath}/taskType/update" method="post">
		<input type="hidden" name="id" value="${tt.id }">
		活动名称：<input type="text" name="name" value="${tt.name }"><br/>
		活动描述：<input type="text" name="description" value="${tt.description }"><br/>
		活动收入：<input type="text" name="money" value="${tt.money }"><br/>
		活动单位：<input type="text" name="unit" value="${tt.unit }"><br/>
		<input type="submit" value="修改">
	</form>
</body>
</html>