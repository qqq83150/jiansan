package com.youzhong.vo;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class TaskVO {

	private List<Integer> taskTypeIds;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskDate = new Date();
	
	private int taskStatusId = 1;
	
	private int payStatusId;
	
	public List<Integer> getTaskTypeIds() {
		return taskTypeIds;
	}

	public void setTaskTypeIds(List<Integer> taskTypeIds) {
		this.taskTypeIds = taskTypeIds;
	}

	public Date getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}

	public int getTaskStatusId() {
		return taskStatusId;
	}

	public void setTaskStatusId(int taskStatusId) {
		this.taskStatusId = taskStatusId;
	}

	public int getPayStatusId() {
		return payStatusId;
	}

	public void setPayStatusId(int payStatusId) {
		this.payStatusId = payStatusId;
	}

	
	
	
}
