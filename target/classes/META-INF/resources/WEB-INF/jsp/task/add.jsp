<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	//活动列表
	$.post('${pageContext.request.contextPath}/taskType/list',function(result){
		for(var i=0;i<result.length;i++){
			$('[name="taskTypeId"]').append('<option value="'+result[i].id+'">'+result[i].name+'</option>')			
		}
	},'json')
	//角色列表
	$.post('${pageContext.request.contextPath}/account/gamerolejsonlist',function(result){
		for(var i=0;i<result.length;i++){
			$('[name="gameRoleId"]').append('<option value="'+result[i].id+'">'+result[i].name+'</option>')			
		}
	},'json')
	
	//日期
	var mydateInput1 = $('[name="beginDate"]')
	var mydateInput2 = $('[name="endDate"]')
    var date = new Date();
    var year = date.getFullYear() + '-'
    var month = (date.getMonth() + 1) 
    if(month<10){
    	month = '0' + month + '-'
    }else{
    	month = month + '-'
    }
    var d = date.getDate()
    var dateString = year + month + d
    mydateInput1.val(dateString)
    mydateInput2.val(dateString)
})
</script>
</head>
<body>
	<h3>添加任务</h3>
	<div class="row">
	<div class="col-lg-6">
	<form action="${pageContext.request.contextPath}/task/add" method="post">
		<div class="form-group">
			<label class="control-label col-lg-4">角色:</label>
			<label class="col-lg-8"><select name="gameRoleId" class="form-control"></select></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">活动:</label>
			<label class="col-lg-8"><select name="taskTypeId" class="form-control"></select></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">开始日期:</label>
			<label class="col-lg-8"><input type="date" name="beginDate" class="form-control"></label>
		</div>
		<div class="form-group">
			<label class="control-label col-lg-4">结束日期:</label>
			<label class="col-lg-8"><input type="date" name="endDate" class="form-control"></label>
		</div>
		<div class="col-lg-offset-4 col-lg-8">
		<input type="submit" value="添加" class="btn btn-success">
		<a href="${pageContext.request.contextPath}/task/list" class="btn btn-warning">返回</a>
		</div>
	</form>
	</div>
	</div>
</body>
</html>