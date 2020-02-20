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
	<h1>添加微信</h1>
	<div class="row">
	<div class="col-lg-6">
	<form action="${pageContext.request.contextPath }/account/weixinAdd" method="post">
		<div class="form-group">
			<label class="control-label col-lg-4">微信号：</label>
			<label class="col-lg-8"><input type="text" name="weixinName" class="form-control"></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">微信名：</label>
			<label class="col-lg-8"><input type="text" name="realName" class="form-control"></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">手机号：</label>
			<label class="col-lg-8"><input type="text" name="phone" class="form-control"></label>
		</div>
		<div class="col-lg-offset-4 col-lg-8">
		<input type="submit" value="添加" class="btn btn-success">
		<a href="${pageContext.request.contextPath}/account/weixinList" class="btn btn-warning">返回</a>
		</div>
	</form>
	</div>
	</div>
</body>
</html>