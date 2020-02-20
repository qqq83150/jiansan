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
	//页面加载，默认查询今天的新建任务列表
	$.post('${pageContext.request.contextPath}/task/newTaskList',function(result){
		var str = ''
		str += '<table border="1" class="table table-hover">'
		str += '<tr><td>ID</td><td>游戏帐号</td><td>游戏密码</td><td>角色名称</td><td>活动名称</td><td>开始日期</td><td>结束日期</td><td>任务状态</td><td>支付状态</td><td>创建时间</td></tr>'
		for(var i=0;i<result.length;i++){
			str += '<tr><td>'+(i+1)+'</td><td>'+result[i].gameRole.account.username+'</td><td>'+result[i].gameRole.account.password+'</td><td>'+result[i].gameRole.name+'</td><td>'+result[i].taskType.name+'</td><td>'+result[i].beginDate+'</td><td>'+result[i].endDate+'</td><td>'+result[i].taskStatus.name+'</td><td>'+result[i].payStatus.name+'</td><td>'+result[i].ctime+'</td></tr>'
		}
		str += '</table>'
		$('div').html(str)
	},'json')
})
</script>
</head>
<body>
	<h3>今日任务列表</h3>
	<div></div>
</body>
</html>