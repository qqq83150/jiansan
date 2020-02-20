package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.TaskType;
import com.youzhong.service.ITaskTypeService;

@Controller
@RequestMapping("taskType")
public class TaskTypeController {

	@Autowired
	private ITaskTypeService taskTypeService;
	
	@RequestMapping("list")
	@ResponseBody
	public List<TaskType> list(){
		return taskTypeService.findAll();
	}
	
	@RequestMapping("index")
	public String index(Model model) {
		List<TaskType> list = taskTypeService.findAll();
		model.addAttribute("list", list);
		return "tasktype/list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd() {
		return "tasktype/add";
	}
	
	@RequestMapping("toUpdate/{id}")
	public String toUpdate(@PathVariable int id,Model model) {
		TaskType tt = taskTypeService.getById(id);
		model.addAttribute("tt", tt);
		return "tasktype/update";
	}
	
	@RequestMapping("add")
	public String add(TaskType tt) {
		taskTypeService.add(tt);
		return "redirect:/taskType/index";
	}
	
	@RequestMapping("update")
	public String update(TaskType tt) {
		taskTypeService.update(tt);
		return "redirect:/taskType/index";
	}
}
