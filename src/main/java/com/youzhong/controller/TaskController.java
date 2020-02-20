package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Task;
import com.youzhong.entity.TaskLog;
import com.youzhong.service.ITaskService;
import com.youzhong.vo.TaskVO;

@Controller
@RequestMapping("task")
public class TaskController {

	@Autowired
	private ITaskService taskService;
	
	@RequestMapping("default")
	public String defaultList() {
		return "task/default";
	}
	
	@RequestMapping("newTaskList")
	@ResponseBody
	public List<Task> newTaskList(){
		return taskService.findNewTaskListToday();
	}
	
	@RequestMapping("list")
	public String list(@ModelAttribute("vo") TaskVO vo,Model model){
		List<Task> list = taskService.findAll(vo);
		model.addAttribute("list", list);
		return "task/list";
	}
	
	@RequestMapping("toAdd")
	public String toAdd() {
		return "task/add";
	}
	
	@RequestMapping("add")
	public String add(Task task) {
		taskService.add(task);
		return "redirect:/task/list";
	}
	
	@RequestMapping("update/{name}/{id}")
	@ResponseBody
	public int update(@PathVariable String name,@PathVariable int id) {
		taskService.update(name,id);
		return 0;
	}
	
	@RequestMapping("pay")
	@ResponseBody
	public int pay(TaskLog taskLog) {
		taskService.pay(taskLog);
		return 0;
	}
}
