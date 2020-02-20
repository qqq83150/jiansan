package com.youzhong.dao;

import com.youzhong.entity.Weixin;
import com.youzhong.entity.WeixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinMapper {
    int countByExample(WeixinExample example);

    int deleteByExample(WeixinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Weixin record);

    int insertSelective(Weixin record);

    List<Weixin> selectByExample(WeixinExample example);

    Weixin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Weixin record, @Param("example") WeixinExample example);

    int updateByExample(@Param("record") Weixin record, @Param("example") WeixinExample example);

    int updateByPrimaryKeySelective(Weixin record);

    int updateByPrimaryKey(Weixin record);
}