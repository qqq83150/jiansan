package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.TaskStatus;
import com.youzhong.service.ITaskStatusService;

@Controller
@RequestMapping("taskStatus")
public class TaskStatusController {

	@Autowired
	private ITaskStatusService taskStatusService;
	
	@RequestMapping("list")
	@ResponseBody
	public List<TaskStatus> list(){
		return taskStatusService.findAll();
	}
}
