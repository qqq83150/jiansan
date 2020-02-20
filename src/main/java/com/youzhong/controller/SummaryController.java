package com.youzhong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.youzhong.entity.Money;
import com.youzhong.service.IMoneyService;
import com.youzhong.vo.MoneyVO;

@Controller
@RequestMapping("summary")
public class SummaryController {

	@Autowired
	private IMoneyService moneyService;
	
	@RequestMapping("list")
	public String list(@RequestParam(required = false,defaultValue = "1") int pageNum,Model model) {
		int pageSize = 10;
		int total = moneyService.getTotal();
		int pageCount = (total%pageSize==0)?(total/pageSize):(total/pageSize+1);
		List<Money> list = moneyService.findAll(pageNum,pageSize);
		model.addAttribute("list", list);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("total", total);
		model.addAttribute("pageCount", pageCount);
		return "summary/list";
	}
	
	@RequestMapping("summary")
	public String summary(Model model) {
		//总收入
		double totalMoney = moneyService.getTotalMoney();
		//本周收入
		double recentWeekMoney = moneyService.getRecentWeekMoney();
		//本月收入
		double recentMonthMoney = moneyService.getRecentMonthMoney();
		//每月收入
		List<MoneyVO> list = moneyService.findListByMonth();
		model.addAttribute("totalMoney", totalMoney);
		model.addAttribute("recentWeekMoney", recentWeekMoney);
		model.addAttribute("recentMonthMoney", recentMonthMoney);
		model.addAttribute("list", list);
		return "summary/summary";
	}
}
