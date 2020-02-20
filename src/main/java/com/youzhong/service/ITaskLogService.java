package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.TaskLog;
import com.youzhong.vo.TaskLogVO;

public interface ITaskLogService {

	int getTotal();

	List<TaskLog> findAll(int pageNum, int pageSize, TaskLogVO vo);

}
