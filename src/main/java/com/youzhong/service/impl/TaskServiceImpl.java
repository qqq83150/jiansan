package com.youzhong.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.constant.Dictionary;
import com.youzhong.dao.MoneyMapper;
import com.youzhong.dao.TaskLogMapper;
import com.youzhong.dao.TaskMapper;
import com.youzhong.entity.Money;
import com.youzhong.entity.MoneyExample;
import com.youzhong.entity.Task;
import com.youzhong.entity.TaskExample;
import com.youzhong.entity.TaskExample.Criteria;
import com.youzhong.entity.TaskLog;
import com.youzhong.service.ITaskService;
import com.youzhong.vo.TaskVO;

@Service
public class TaskServiceImpl implements ITaskService {

	@Autowired
	private TaskMapper taskMapper;

	@Autowired
	private TaskLogMapper taskLogMapper;

	@Autowired
	private MoneyMapper moneyMapper;

	@Override
	public List<Task> findNewTaskListToday() {
		TaskExample example = new TaskExample();
		example.createCriteria()//
				.andTaskStatusIdEqualTo(Dictionary.TASK_STATUS_NEW)//
				.andBeginDateLessThanOrEqualTo(new Date())//
				.andEndDateGreaterThanOrEqualTo(new Date());
		return taskMapper.selectByExample(example);
	}

	@Override
	public List<Task> findAll(TaskVO vo) {
		TaskExample example = new TaskExample();
		example.setOrderByClause("ctime desc");
		Criteria criteria = example.createCriteria();
		if (vo != null) {
			if (vo.getTaskTypeIds() != null && vo.getTaskTypeIds().size() > 0) {
				criteria.andTaskTypeIdIn(vo.getTaskTypeIds());
			}
			criteria.andBeginDateLessThanOrEqualTo(vo.getTaskDate())//
					.andEndDateGreaterThanOrEqualTo(vo.getTaskDate());
			criteria.andTaskStatusIdEqualTo(vo.getTaskStatusId());
			if (vo.getPayStatusId() != 0) {
				criteria.andPayStatusIdEqualTo(vo.getPayStatusId());
			}
		}

		return taskMapper.selectByExample(example);
	}

	@Override
	public void add(Task task) {
		task.setCtime(new Date());
		task.setMtime(new Date());
		task.setPayStatusId(Dictionary.PAY_STATUS_NOT_COMPLETE_PAY);
		task.setTaskStatusId(Dictionary.TASK_STATUS_NEW);
		taskMapper.insertSelective(task);
		// 添加日志
		TaskLog log = new TaskLog();
		log.setTaskId(task.getId());
		log.setTaskTypeId(task.getTaskTypeId());
		log.setGameRoleId(task.getGameRoleId());
		log.setPayStatusId(task.getPayStatusId());
		log.setTaskStatusId(task.getTaskStatusId());
		log.setCtime(new Date());
		taskLogMapper.insert(log);
	}

	@Override
	public void update(String name, int id) {
		Task task = taskMapper.selectByPrimaryKey(id);
		switch (name) {
		case "complete":
			task.setTaskStatusId(Dictionary.TASK_STATUS_COMPLETE);
			break;
		case "close":
			task.setTaskStatusId(Dictionary.TASK_STATUS_CLOSE);
			break;
		case "revoke":
			task.setTaskStatusId(Dictionary.TASK_STATUS_REVOKE);//撤销
			task.setPayStatusId(Dictionary.PAY_STATUS_NOT_COMPLETE_PAY);//未支付
			break;
		}
		taskMapper.updateByPrimaryKey(task);
		// 添加日志
		TaskLog log = new TaskLog();
		log.setTaskId(task.getId());
		log.setTaskTypeId(task.getTaskTypeId());
		log.setGameRoleId(task.getGameRoleId());
		log.setPayStatusId(task.getPayStatusId());
		log.setTaskStatusId(task.getTaskStatusId());
		log.setCtime(new Date());
		taskLogMapper.insert(log);
		// 删除旧收入
		MoneyExample example = new MoneyExample();
		example.createCriteria().andTaskIdEqualTo(task.getId());
		moneyMapper.deleteByExample(example);
	}

	@Override
	public void pay(TaskLog taskLog) {
		// 添加任务日志
		Task task = taskMapper.selectByPrimaryKey(taskLog.getTaskId());
		taskLog.setGameRoleId(task.getGameRoleId());
		taskLog.setTaskTypeId(task.getTaskTypeId());
		taskLog.setTaskStatusId(task.getTaskStatusId());
		taskLog.setCtime(new Date());
		taskLogMapper.insert(taskLog);
		//修改任务状态
		task.setPayStatusId(taskLog.getPayStatusId());
		taskMapper.updateByPrimaryKeySelective(task);
		// 添加收入记录
		Money money = new Money();
		money.setGameRoleId(task.getGameRoleId());
		money.setMoney(taskLog.getMoney());
		money.setTaskId(task.getId());
		money.setCtime(new Date());
		moneyMapper.insert(money);
	}

}
