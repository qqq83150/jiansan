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
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"  src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	//活动列表
	$.post('${pageContext.request.contextPath}/taskType/list',function(result){
		var str = ''
		for(var i=0;i<result.length;i++){
			if('${vo.taskTypeIds}'.indexOf(result[i].id)>0){
				str += '<label class="checkbox-inline"><input type="checkbox" name="taskTypeIds" value="'+result[i].id+'" checked>'+result[i].name+'</label>'
			}else{
				str += '<label class="checkbox-inline"><input type="checkbox" name="taskTypeIds" value="'+result[i].id+'">'+result[i].name+'</label>'
			}
		}
		$('#taskTypes').html(str)
	},'json')
	//任务状态列表
	$.post('${pageContext.request.contextPath}/taskStatus/list',function(result){
		var str = ''
		for(var i=0;i<result.length;i++){
			if('${vo.taskStatusId}'==result[i].id){
				str += '<label class="radio-inline"><input type="radio" name="taskStatusId" value="'+result[i].id+'" checked>'+result[i].name+'</label>'
			}else {
				str += '<label class="radio-inline"><input type="radio" name="taskStatusId" value="'+result[i].id+'">'+result[i].name+'</label>'
			}
		}
		$('#taskStatus').html(str)
	},'json')
	//重置
	$('[type="reset"]').click(function(){
		location.href='${pageContext.request.contextPath }/task/list'
	})
	//付款弹窗
	$('[name="pay"]').click(function(){
		var taskId = $(this).attr('taskId')
		$('#payTaskId').val(taskId)
	}) 
	//任务操作
	$('[name="taskoperation"]').click(function(){
		var taskId = $(this).attr('taskId')
		var opname = $(this).attr('id')
		if(opname=='complete'){
			if(!confirm('您确定任务已做完吗？确定之后不可退回哦！')){
				return
			}
		}
		if(opname=='close'){
			if(!confirm('您确定关闭这个任务吗？关闭之后不可退回哦！')){
				return
			}
		}
		if(opname=='revoke'){
			if(!confirm('您确定撤销这个任务吗？撤销之后不可退回哦！')){
				return
			}
		}
		$.post('${pageContext.request.contextPath}/task/update/'+opname+'/'+taskId,function(result){
			$('#taskform').submit()
		})
	})
	//异步付款
	$('#payButton').click(function(){
		if(!confirm('您确定添加付款记录吗？')){
			return
		}
		var data = $('#payform').serialize()
		$.post('${pageContext.request.contextPath}/task/pay',data,function(result){
			$('#myModal').modal('hide')
			$('#taskform').submit()
		})
	})
})
</script>
</head>
<body>
	<h2>任务列表</h2>
	<div class="row">
	<div class="">
	<form id="taskform" class="form-horizontal" action="${pageContext.request.contextPath }/task/list" method="post">
		<div class="form-group">
			<label for="taskTypes" class="col-lg-2 control-label">活动名称：</label><span id="taskTypes" class="col-lg-10"></span>
		</div>
		<div class="form-group">
			<label for="taskDate" class="col-lg-2 control-label">任务日期：</label>
			<label class="col-lg-2"><input type="date" name="taskDate" class="form-control" value='<fmt:formatDate value="${vo.taskDate}" pattern="yyyy-MM-dd"/>'></label>
		</div>
		<div class="form-group">
			<label for="taskStatus" class="col-lg-2 control-label">任务状态：</label><span id="taskStatus" class="col-lg-10"></span>
		</div>
		<div class="form-group">
			<label for="payStatus" class="col-lg-2 control-label">支付状态：</label>
				<span id="payStatus" class="col-lg-10">
					<label class="radio-inline"><input type="radio"  name="payStatusId" value="1" ${vo.payStatusId==1?'checked':''}>未支付</label>
					<label class="radio-inline"><input type="radio" name="payStatusId" value="2" ${vo.payStatusId==2?'checked':''}>已支付</label>
					<label class="radio-inline"><input type="radio" name="payStatusId" value="3" ${vo.payStatusId==3?'checked':''}>支付一部分</label>
				</span>
		</div>
		<div>
			<label class="col-lg-offset-2"></label><input type="submit" value="查询" class="btn btn-primary"> <input type="reset" class="btn btn-warning">
		</div>
	</form>
	</div>
	</div>
	<a href="${pageContext.request.contextPath }/task/toAdd" class="btn btn-success">添加任务</a>
	<a href="${pageContext.request.contextPath}/taskLog/list" class="btn btn-primary">任务流水</a>
	<table border="1" class="table table-hover">
		<tr>
			<td>ID</td>
			<td>游戏帐号</td>
			<td>游戏密码</td>
			<td>角色名称</td>
			<td>活动名称</td>
			<td>收费金额</td>
			<td>开始日期</td>
			<td>结束日期</td>
			<td>任务状态</td>
			<td>支付状态</td>
			<td>创建时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="task" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td>${task.gameRole.account.username }</td>
			<td>${task.gameRole.account.password }</td>
			<td>${task.gameRole.name }</td>
			<td>${task.taskType.name }</td>
			<td>${task.taskType.money }${task.taskType.unit }</td>
			<td><fmt:formatDate value="${task.beginDate }" pattern="yyyy-MM-dd"/> </td>
			<td><fmt:formatDate value="${task.endDate }" pattern="yyyy-MM-dd"/></td>
			<td>${task.taskStatus.name }</td>
			<td>${task.payStatus.name }</td>
			<td><fmt:formatDate value="${task.ctime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			<td>
				<c:if test="${task.taskStatusId==1 }">
					<a id="complete" href="javascript:void(0)" name="taskoperation" taskId="${task.id}" class="btn btn-info">做完</a>
					<button name="pay" taskId="${task.id }" class="btn btn-success" data-toggle="modal" data-target="#myModal">付款</button>
					<a id="close" href="javascript:void(0)" name="taskoperation" taskId="${task.id}" class="btn btn-danger">关闭</a>
					<a id="revoke" href="javascript:void(0)" name="taskoperation" taskId="${task.id}" class="btn btn-danger">撤销</a>
				</c:if>
			</td>
		</tr>
		</c:forEach>
	</table>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">关闭</span></button>
        <h4 class="modal-title" id="myModalLabel">付款</h4>
      </div>
    <div class="modal-body">
	<div id="payDiv" class="row">
		<form id="payform" action="${pageContext.request.contextPath}/task/pay" method="post">
			<input id="payTaskId" type="hidden" name="taskId"><br/>
			<div class="form-group">
				<label class="control-label col-lg-4">付款金额：</label>
				<label class="col-lg-8"><input type="text" name="money" class="form-control"></label>
			</div>
			<div class="form-group">
				<label class="control-label col-lg-4">备注:</label>
				<label class="col-lg-8"><textarea name="remark" class="form-control"></textarea></label>
			</div>
			<div class="form-group">
				<label for="payStatus" class="col-lg-4 control-label">支付状态：</label>
					<span id="payStatus" class="col-lg-8">
						<%-- <label class="radio-inline"><input type="radio"  name="payStatusId" value="1" ${vo.payStatusId==1?'checked':''}>未支付</label> --%>
						<label class="radio-inline"><input type="radio" class="radio-inline" name="payStatusId" value="2" checked>已支付</label>
						<label class="radio-inline"><input type="radio" class="radio-inline" name="payStatusId" value="3">支付一部分</label>
					</span>
			</div>
			<div class="col-lg-offset-4 col-lg-8">
			<input id="payButton" type="button" value="提交" class="btn btn-success">
			<!-- <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
			</div>
		</form>
	</div>
	</div>
	</div>
  </div>
</div>
</body>
</html>