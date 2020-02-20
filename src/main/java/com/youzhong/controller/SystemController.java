package com.youzhong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("system")
public class SystemController {

	@RequestMapping("list")
	public String list() {
		return "system/list";
	}
}
