<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$('button').click(function(){
		var name = $(this).attr('id')
		if(name=='task'){
			$('iframe').attr('src','${pageContext.request.contextPath}/task/list')
		}else if(name=='account'){
			$('iframe').attr('src','${pageContext.request.contextPath}/account/list')
		}else if(name=='summary'){
			$('iframe').attr('src','${pageContext.request.contextPath}/summary/list')
		}else if(name=='system'){
			$('iframe').attr('src','${pageContext.request.contextPath}/system/list')
		}else if(name=='tasktype'){
			$('iframe').attr('src','${pageContext.request.contextPath}/taskType/index')
		}
		
	})
})
</script>
</head>
<body>
	<h1>欢迎您：<shiro:principal/> </h1>
	
	<button id="account" class="btn btn-primary">帐户管理</button>
	<button id="task" class="btn btn-primary">任务管理</button>
	<button id="tasktype" class="btn btn-primary">活动管理</button>
	<button id="summary" class="btn btn-primary">统计管理</button>
	<button id="system" class="btn btn-primary">系统管理</button>
	<a href="${pageContext.request.contextPath}/logout" class="btn btn-warning">注销</a>
	<iframe src="${pageContext.request.contextPath }/task/default" width="100%" height="800" style="border: none;"></iframe>
</body>
</html>