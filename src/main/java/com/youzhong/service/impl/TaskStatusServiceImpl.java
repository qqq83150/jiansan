package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.TaskStatusMapper;
import com.youzhong.entity.TaskStatus;
import com.youzhong.service.ITaskStatusService;

@Service
public class TaskStatusServiceImpl implements ITaskStatusService {

	@Autowired
	private TaskStatusMapper taskStatusMapper;
	@Override
	public List<TaskStatus> findAll() {
		return taskStatusMapper.selectByExample(null);
	}

}
