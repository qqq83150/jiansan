package com.youzhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.youzhong.entity.Account;
import com.youzhong.entity.GameRole;
import com.youzhong.entity.Weixin;
import com.youzhong.service.IAccountService;
import com.youzhong.service.IGameRoleService;
import com.youzhong.service.IWeixinService;

@Controller
@RequestMapping("account")
public class AccountController {

	@Autowired
	private IGameRoleService gameRoleService;
	
	@Autowired
	private IWeixinService weixinService;
	
	@Autowired
	private IAccountService accountService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<GameRole> list = gameRoleService.findAll();
		model.addAttribute("list", list);
		return "account/list";
	}
	
	@RequestMapping("toWeixinAdd")
	public String toWeixinAdd() {
		return "account/weixinadd";
	}
	
	@RequestMapping("toAccountAdd")
	public String toAccountAdd(Model model) {
		List<Weixin> list = weixinService.findAll();
		model.addAttribute("list", list);
		return "account/accountadd";
	}
	
	@RequestMapping("toGameRoleAdd")
	public String toGameRoleAdd(Model model) {
		List<Account> list = accountService.findAll();
		model.addAttribute("list", list);
		return "account/gameroleadd";
	}
	
	@RequestMapping("weixinAdd")
	public String weixinAdd(Weixin weixin) {
		weixinService.save(weixin);
		return "redirect:/account/weixinList";
	}
	
	@RequestMapping("accountAdd")
	public String accountAdd(Account account) {
		accountService.save(account);
		return "redirect:/account/accountList";
	}
	
	@RequestMapping("gameRoleAdd")
	public String gameRoleAdd(GameRole gameRole) {
		gameRoleService.save(gameRole);
		return "redirect:/account/gameRoleList";
	}
	
	@RequestMapping("gameRoleList")
	public String gameRoleList(Model model) {
		List<GameRole> list = gameRoleService.findAll();
		model.addAttribute("list", list);
		return "account/gamerolelist";
	}
	
	@RequestMapping("gamerolejsonlist")
	@ResponseBody
	public List<GameRole> gameRoleJsonList(){
		return gameRoleService.findAll();
	}
	
	
	@RequestMapping("accountList")
	public String accountList(Model model) {
		List<Account> list = accountService.findAll();
		model.addAttribute("list", list);
		return "account/accountlist";
	}
	
	@RequestMapping("weixinList")
	public String weixinList(Model model) {
		List<Weixin> list = weixinService.findAll();
		model.addAttribute("list", list);
		return "account/weixinlist";
	}
	
	@RequestMapping("accountjsonList")
	@ResponseBody
	public List<Account> accountjsonList() {
		return accountService.findAll();
	}
	
	@RequestMapping("weixinjsonList")
	@ResponseBody
	public List<Weixin> weixinjsonList() {
		return weixinService.findAll();
	}
	
	
}
