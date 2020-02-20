package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.youzhong.entity.TaskLog;
import com.youzhong.service.ITaskLogService;
import com.youzhong.vo.TaskLogVO;

@Controller
@RequestMapping("taskLog")
public class TaskLogController {
	
	@Autowired
	private ITaskLogService taskLogService;
	
	@RequestMapping("list")
	public String list(@RequestParam(required = false,defaultValue = "1")int pageNum, TaskLogVO vo,Model model) {
		int pageSize = 10;
		int total = taskLogService.getTotal();
		int pageCount = (total%pageSize==0)?(total/pageSize):(total/pageSize+1);
		List<TaskLog> list = taskLogService.findAll(pageNum,pageSize,vo);
		model.addAttribute("list", list);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("total", total);
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("vo", vo);
		return "tasklog/list";
	}

}
