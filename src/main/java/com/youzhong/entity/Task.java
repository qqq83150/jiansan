package com.youzhong.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Task {
    private Integer id;

    private Integer gameRoleId;

    private Integer taskTypeId;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private Integer taskStatusId;

    private Integer payStatusId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date ctime;

    private Date mtime;
    
    private Date completeDate;
    
    //------------
    
    private GameRole gameRole;//游戏角色
    
    private TaskType taskType;//任务类型
    
    private TaskStatus taskStatus;//任务状态
    
    private PayStatus payStatus;//支付状态
    
    

    public Date getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(Date completeDate) {
		this.completeDate = completeDate;
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

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }
}