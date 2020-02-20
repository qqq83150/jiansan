package com.youzhong.dao;

import com.youzhong.entity.PayStatus;
import com.youzhong.entity.PayStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayStatusMapper {
    int countByExample(PayStatusExample example);

    int deleteByExample(PayStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayStatus record);

    int insertSelective(PayStatus record);

    List<PayStatus> selectByExample(PayStatusExample example);

    PayStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayStatus record, @Param("example") PayStatusExample example);

    int updateByExample(@Param("record") PayStatus record, @Param("example") PayStatusExample example);

    int updateByPrimaryKeySelective(PayStatus record);

    int updateByPrimaryKey(PayStatus record);
}