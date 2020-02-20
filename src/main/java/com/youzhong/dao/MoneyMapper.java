package com.youzhong.dao;

import com.youzhong.entity.Money;
import com.youzhong.entity.MoneyExample;
import com.youzhong.vo.MoneyVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoneyMapper {
    int countByExample(MoneyExample example);

    int deleteByExample(MoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Money record);

    int insertSelective(Money record);

    List<Money> selectByExample(MoneyExample example);

    Money selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByExample(@Param("record") Money record, @Param("example") MoneyExample example);

    int updateByPrimaryKeySelective(Money record);

    int updateByPrimaryKey(Money record);

	double getTotalMoney();

	double getRecentWeekMoney();

	double getRecentMonthMoney();

	List<MoneyVO> findListByMonth();
}