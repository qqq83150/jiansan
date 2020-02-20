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
	<h3>添加游戏帐号</h3>
	<div class="row">
	<div class="col-lg-6">
	<form  action="${pageContext.request.contextPath }/account/accountAdd" method="post">
		<div class="form-group">
			<label class="control-label col-lg-4">游戏帐号：</label>
			<label class="col-lg-8"><input type="text" name="username" class="form-control"></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">游戏密码：</label>
<<<<<<< HEAD
			<label class="col-lg-8"><input type="text" name="password" class="form-control"></label>
=======
			<label class="col-lg-8"><input type="password" name="password" class="form-control"></label>
>>>>>>> 1398c9726c7ae0c272e65c7d8801dfe75e816bdb
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">微信：</label>
			<label class="col-lg-8"><select name="weixinId" class="form-control">
			<c:forEach items="${list }" var="wx">
<<<<<<< HEAD
				<option value="${wx.id }">${wx.realName }</option>
=======
				<option value="${wx.id }">${wx.weixinName }</option>
>>>>>>> 1398c9726c7ae0c272e65c7d8801dfe75e816bdb
			</c:forEach>
		</select></label>
		</div>
		<div class="col-lg-offset-4 col-lg-8">
		<input type="submit" value="添加" class="btn btn-success">
		<a href="${pageContext.request.contextPath }/account/accountList" class="btn btn-warning">返回</a>
		</div>
	</form>
	</div>
	</div>
</body>
</html>