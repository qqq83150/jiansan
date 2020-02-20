package com.youzhong.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.youzhong.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;

//	@RequestMapping("/")
//	public String toLogin(){
//		return "redirect:/login.jsp";
//	}
	
//	@RequestMapping(value="login",method = RequestMethod.POST)
//	public String login(User user,HttpSession session,Model model) {
//		Subject subject = SecurityUtils.getSubject();
//		try {
//		subject.login(new UsernamePasswordToken(user.getUsername(),user.getPassword()));
//		} catch (AuthenticationException e) {
//			e.printStackTrace();
//		}
//		return "redirect:/index/index";
//	}
	
	@RequestMapping("index/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("logout")
	public String logout() {
		SecurityUtils.getSubject().logout();
		return "redirect:/login.jsp";
	}
}
