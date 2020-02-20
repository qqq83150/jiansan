package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Money;
import com.youzhong.vo.MoneyVO;

public interface IMoneyService {

	List<Money> findAll(int pageNum, int pageSize);

	int getTotal();

	double getTotalMoney();

	double getRecentWeekMoney();

	double getRecentMonthMoney();

	List<MoneyVO> findListByMonth();

}
