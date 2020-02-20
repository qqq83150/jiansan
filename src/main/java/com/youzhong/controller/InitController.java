package com.youzhong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youzhong.service.IInitService;

@Controller
@RequestMapping("init")
public class InitController {
	
	@Autowired
	private IInitService initService;

	@RequestMapping("initdata")
	public String init() {
		initService.cleardata();
		initService.initdata();
		return "redirect:/logout";
	}
	
//	@RequestMapping("cleardata")
//	@ResponseBody
//	public String cleardata() {
//		
//		return "成功清除数据库所有数据";
//	}
}
