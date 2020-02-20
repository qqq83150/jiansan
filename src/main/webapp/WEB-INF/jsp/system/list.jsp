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
	<h2>系统管理</h2>
	<a href="javascript:window.parent.location.href='${pageContext.request.contextPath}/init/initdata';" onclick="javascript:return confirm('您确认要恢复出厂设置吗？这个操作将清除项目的所有数据！！！需要重新使用管理员帐号登录。帐号：admin 密码：admin')" class="btn btn-danger btn-lg">恢复出厂设置(慎用！！！)</a>
</body>
</html>