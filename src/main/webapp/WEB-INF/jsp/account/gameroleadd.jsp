<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"  href="${pageContext.request.contextPath}/select2/css/select2.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/select2/js/select2.min.js"></script>
<script type="text/javascript">
$(function(){
	$('[name="accountId"]').select2()
})
</script>
</head>
<body>
	<h1>添加角色</h1>
	<div class="row">
	<div class="col-lg-6">
	<form action="${pageContext.request.contextPath }/account/gameRoleAdd" method="post">
		<div class="form-group">
			<label class="control-label col-lg-4">角色名称：</label>
			<label class="col-lg-8"><input type="text" name="name"  class="form-control"></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">角色描述：</label>
			<label class="col-lg-8"><input type="text" name="description"  class="form-control"></label>
		</div>
		<div class="form-group">
		<label class="control-label col-lg-4">所属帐号：</label>
		<label class="col-lg-8"><select name="accountId" class="form-control">
			<c:forEach items="${list }" var="account">
				<option value="${account.id }">${account.username }</option>
			</c:forEach>
		</select>
		</label>
		</div>
		<div class="col-lg-offset-4 col-lg-8">
		<input type="submit" value="添加" class="btn btn-success"> 
		<a href="${pageContext.request.contextPath}/account/gameRoleList" class="btn btn-warning">返回</a>
		</div>
	</form>
	</div>
	</div>
</body>
</html>