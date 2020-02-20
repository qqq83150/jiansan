package com.youzhong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.TaskTypeMapper;
import com.youzhong.entity.TaskType;
import com.youzhong.service.ITaskTypeService;

@Service
public class TaskTypeServiceImpl implements ITaskTypeService {

	@Autowired
	private TaskTypeMapper taskTypeMapper;
	@Override
	public List<TaskType> findAll() {
		return taskTypeMapper.selectByExample(null);
	}
	@Override
	public TaskType getById(int id) {
		// TODO Auto-generated method stub
		return taskTypeMapper.selectByPrimaryKey(id);
	}
	@Override
	public void add(TaskType tt) {
		// TODO Auto-generated method stub
		tt.setCtime(new Date());
		tt.setMtime(new Date());
		taskTypeMapper.insertSelective(tt);
	}
	@Override
	public void update(TaskType tt) {
		// TODO Auto-generated method stub
		tt.setMtime(new Date());
		taskTypeMapper.updateByPrimaryKeySelective(tt);
	}

}
