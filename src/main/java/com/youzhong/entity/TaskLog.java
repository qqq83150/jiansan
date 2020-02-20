package com.youzhong.entity;

import java.util.Date;

public class TaskLog {
    private Integer id;

    private Integer taskId;

    private Integer gameRoleId;

    private Integer taskTypeId;

    private Integer taskStatusId;

    private Integer payStatusId;

    private Double money;

    private String remark;

    private Date ctime;
    
    private GameRole gameRole;
    
    private TaskType taskType;
    
    private TaskStatus taskStatus;
    
    private PayStatus payStatus;
    
    

    public GameRole getGameRole() {
		return gameRole;
	}

	public void setGameRole(GameRole gameRole) {
		this.gameRole = gameRole;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

	public PayStatus getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(PayStatus payStatus) {
		this.payStatus = payStatus;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getGameRoleId() {
        return gameRoleId;
    }

    public void setGameRoleId(Integer gameRoleId) {
        this.gameRoleId = gameRoleId;
    }

    public Integer getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Integer taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public Integer getTaskStatusId() {
        return taskStatusId;
    }

    public void setTaskStatusId(Integer taskStatusId) {
        this.taskStatusId = taskStatusId;
    }

    public Integer getPayStatusId() {
        return payStatusId;
    }

    public void setPayStatusId(Integer payStatusId) {
        this.payStatusId = payStatusId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}