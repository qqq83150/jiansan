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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet"  href="${pageContext.request.contextPath}/select2/css/select2.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/select2/js/select2.min.js"></script>
<script type="text/javascript">
$(function(){
	$('[name="page"]').click(function(){
		var pageNum = $(this).attr('pageNum')
		$('[name="pageNum"]').val(pageNum)
		$('form').submit()
	})
	//角色列表
	$.post('${pageContext.request.contextPath}/account/gamerolejsonlist',function(result){
			$('[name="gameRoleId"]').append('<option value="0">--</option>')
		for(var i=0;i<result.length;i++){
			$('[name="gameRoleId"]').append('<option value="'+result[i].id+'">'+result[i].name+'</option>')
		}
		$('[name="gameRoleId"]').val('${vo.gameRoleId}')
		$('[name="gameRoleId"]').select2()
	},'json')
	//帐号列表
	$.post('${pageContext.request.contextPath}/account/accountjsonList',function(result){
			$('[name="accountId"]').append('<option value="0">--</option>')
		for(var i=0;i<result.length;i++){
			$('[name="accountId"]').append('<option value="'+result[i].id+'">'+result[i].username+'</option>')
		}
		$('[name="accountId"]').val('${vo.accountId}')
		$('[name="accountId"]').select2()
	},'json')
	//微信号列表
	$.post('${pageContext.request.contextPath}/account/weixinjsonList',function(result){
		$('[name="weixinId"]').append('<option value="0">--</option>')
		for(var i=0;i<result.length;i++){
			$('[name="weixinId"]').append('<option value="'+result[i].id+'">'+result[i].realName+'</option>')
		}
		$('[name="weixinId"]').val('${vo.weixinId}')
		$('[name="weixinId"]').select2()
	},'json')
	//活动列表
	$.post('${pageContext.request.contextPath}/taskType/list',function(result){
		$('[name="taskTypeId"]').append('<option value="0">--</option>')
		for(var i=0;i<result.length;i++){
			$('[name="taskTypeId"]').append('<option value="'+result[i].id+'">'+result[i].name+'</option>')
		}
		$('[name="taskTypeId"]').val('${vo.taskTypeId}')
		$('[name="taskTypeId"]').select2()
	},'json')
	//三级联动
	$('[name="weixinId"]').change(function(){
		var weixinId = $(this).val()
		$.post('${pageContext.request.contextPath}/account/accountListByWeixinId/'+weixinId,function(result){
			$('[name="accountId"]').html('<option value="0">--</option>')
			for(var i=0;i<result.length;i++){
				$('[name="accountId"]').append('<option value="'+result[i].id+'">'+result[i].username+'</option>')
			}
			//$('[name="gameRoleId"]').empty()
		},'json')
	})
	$('[name="accountId"]').change(function(){
		var accountId = $(this).val()
		$.post('${pageContext.request.contextPath}/account/gameroleListByAccountId/'+accountId,function(result){
			$('[name="gameRoleId"]').html('<option value="0">--</option>')
			for(var i=0;i<result.length;i++){
				$('[name="gameRoleId"]').append('<option value="'+result[i].id+'">'+result[i].name+'</option>')
			}
		},'json')
	})
})
</script>
</head>
<body>
	<h3>任务流水</h3>
	<form class="form-inline" action="${pageContext.request.contextPath}/taskLog/list" method="post">
		<input type="hidden" name="pageNum">
		<div class="form-group"><label for="taskTypeId">活动</label> <select name="taskTypeId" class="form-control" style="width: 150px;"></select></div>
		<div class="form-group"><label for="weixinId">微信名 </label> <select name="weixinId" class="form-control" style="width: 100px;"></select></div>
		<div class="form-group"><label for="accountId">游戏帐号 </label> <select name="accountId" class="form-control" style="width: 100px;"></select></div>
		<div class="form-group"><label for="gameRoleId">角色 </label> <select name="gameRoleId" class="form-control" style="width: 150px;"></select></div>
		<div class="form-group">
			<label for="min">金额</label> <input type="text" name="min" value="${vo.min }" class="form-control">
			 至 <input type="text" name="max" value="${vo.max }" class="form-control">
		</div>
		<div class="form-group"><input type="submit" class="btn btn-success" value="查询"><a href="${pageContext.request.contextPath}/taskLog/list" class="btn btn-warning">重置</a></div>
	</form>
	<table border="1" class="table table-hover">
		<tr>
			<td>序号</td>
			<td>时间</td>
			<td>角色</td>
			<td>帐号</td>
			<td>微信号</td>
			<td>活动</td>
			<td>任务状态</td>
			<td>支付状态</td>
			<td>金额</td>
			<td>备注</td>
		</tr>
		<c:forEach items="${list }" var="log" varStatus="s">
		<tr>
			<td>${s.count }</td>
			<td><fmt:formatDate value="${log.ctime }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
			<td>${log.gameRole.name }</td>
			<td>${log.gameRole.account.username }</td>
			<td>${log.gameRole.account.weixin.weixinName }</td>
			<td>${log.taskType.name }</td>
			<td>${log.taskStatus.name }</td>
			<td>${log.payStatus.name }</td>
			<td>${log.money }</td>
			<td>${log.remark }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="javascript:void(0)" name="page" pageNum="1" class="btn btn-default">首页</a>
	<a href="javascript:void(0)" name="page" pageNum="${pageNum==1?1:pageNum-1 }" class="btn btn-default">上一页</a>
	<a href="javascript:void(0)" name="page" pageNum="${pageNum==pageCount?pageCount:pageNum+1 }" class="btn btn-default">下一页</a>
	<a href="javascript:void(0)" name="page" pageNum="${pageCount }" class="btn btn-default">末页</a>
	共${total}条，每页${pageSize }条，当前${pageNum }/${pageCount }页
	<a href="javascript:history.back()" class="btn btn-warning">返回</a>
</body>
</html>