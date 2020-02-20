package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Task;
import com.youzhong.entity.TaskLog;
import com.youzhong.vo.TaskVO;

public interface ITaskService {

	List<Task> findNewTaskListToday();

	List<Task> findAll(TaskVO vo);

	void add(Task task);

	void update(String name, int id);

	void pay(TaskLog taskLog);

}
