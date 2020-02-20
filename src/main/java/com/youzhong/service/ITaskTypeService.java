package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.TaskType;

public interface ITaskTypeService {

	List<TaskType> findAll();

	TaskType getById(int id);

	void add(TaskType tt);

	void update(TaskType tt);

}
