package com.youzhong.dao;

import com.youzhong.entity.TaskLog;
import com.youzhong.entity.TaskLogExample;
import com.youzhong.vo.TaskLogVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskLogMapper {
    int countByExample(TaskLogExample example);

    int deleteByExample(TaskLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskLog record);

    int insertSelective(TaskLog record);

    List<TaskLog> selectByExample(TaskLogExample example);

    TaskLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    int updateByExample(@Param("record") TaskLog record, @Param("example") TaskLogExample example);

    int updateByPrimaryKeySelective(TaskLog record);

    int updateByPrimaryKey(TaskLog record);

	List<TaskLog> findAll(TaskLogVO vo);
}