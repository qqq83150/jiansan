package com.youzhong.dao;

import com.youzhong.entity.GameRole;
import com.youzhong.entity.GameRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameRoleMapper {
    int countByExample(GameRoleExample example);

    int deleteByExample(GameRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameRole record);

    int insertSelective(GameRole record);

    List<GameRole> selectByExample(GameRoleExample example);

    GameRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameRole record, @Param("example") GameRoleExample example);

    int updateByExample(@Param("record") GameRole record, @Param("example") GameRoleExample example);

    int updateByPrimaryKeySelective(GameRole record);

    int updateByPrimaryKey(GameRole record);
}