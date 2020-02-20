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
	<h3>添加活动</h3>
	<div class="row">
	<div class="col-lg-6">
	<form action="${pageContext.request.contextPath}/taskType/add" method="post">
		<label class="col-lg-2 control-label" for="name">活动名称：</label><label class="col-lg-10"><input type="text" name="name" class="form-control"></label>
		<label class="col-lg-2 control-label" for="description">活动描述：</label><label class="col-lg-10"><input type="text" name="description" class="form-control"></label>
		<label class="col-lg-2 control-label" for="money">活动收入：</label><label class="col-lg-10"><input type="text" name="money" class="form-control"></label>
		<label class="col-lg-2 control-label" for="unit">活动单位：</label>
		<div class="col-lg-10">
			<label class="radio-inline"><input type="radio" name="unit" value="R/天" checked> R/天</label>
			<label class="radio-inline"><input type="radio" name="unit" value="R/周"> R/周</label>
			<label class="radio-inline"><input type="radio" name="unit" value="R/月"> R/月</label>
		</div>
		<label class="col-lg-offset-2 col-lg-10"><input type="submit" value="添加" class="btn btn-success">
		<a href="${pageContext.request.contextPath}/taskType/index" class="btn btn-warning">返回</a></label>
	</form>
	</div>
	</div>
</body>
</html>