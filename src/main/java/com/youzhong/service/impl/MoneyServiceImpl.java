package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.youzhong.dao.MoneyMapper;
import com.youzhong.entity.Money;
import com.youzhong.entity.MoneyExample;
import com.youzhong.service.IMoneyService;
import com.youzhong.vo.MoneyVO;

@Service
public class MoneyServiceImpl implements IMoneyService {

	@Autowired
	private MoneyMapper moneyMapper;
	@Override
	public List<Money> findAll(int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		MoneyExample example = new MoneyExample();
		example.setOrderByClause("ctime desc");
		PageHelper.startPage(pageNum, pageSize);
		return moneyMapper.selectByExample(example);
	}
	@Override
	public int getTotal() {
		return moneyMapper.countByExample(null);
	}
	@Override
	public double getTotalMoney() {
		return moneyMapper.getTotalMoney();
	}
	@Override
	public double getRecentWeekMoney() {
		return moneyMapper.getRecentWeekMoney();
	}
	@Override
	public double getRecentMonthMoney() {
		// TODO Auto-generated method stub
		return moneyMapper.getRecentMonthMoney();
	}
	@Override
	public List<MoneyVO> findListByMonth() {
		return moneyMapper.findListByMonth();
	}

}
