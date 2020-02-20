package com.youzhong.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.PayStatusMapper;
import com.youzhong.dao.TaskStatusMapper;
import com.youzhong.dao.UserMapper;
import com.youzhong.entity.PayStatus;
import com.youzhong.entity.TaskStatus;
import com.youzhong.entity.User;
import com.youzhong.service.IInitService;

@Service
public class InitServiceImpl implements IInitService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TaskStatusMapper taskStatusMapper;
	@Autowired
	private PayStatusMapper payStatusMapper;
	@Override
	public void initdata() {
		//添加管理员帐号
		User user = new User();
		user.setUsername("admin");
		user.setPassword("admin");
		user.setCtime(new Date());
		userMapper.insert(user);
		//添加任务状态
		TaskStatus status1 = new TaskStatus();
		status1.setName("新建");
		TaskStatus status2 = new TaskStatus();
		status2.setName("做完");
		TaskStatus status3 = new TaskStatus();
		status3.setName("关闭");
		TaskStatus status4 = new TaskStatus();
		status4.setName("撤销");
		taskStatusMapper.insert(status1);
		taskStatusMapper.insert(status2);
		taskStatusMapper.insert(status3);
		taskStatusMapper.insert(status4);
		//添加支付状态
		PayStatus payStatus1 = new PayStatus();
		payStatus1.setName("未支付");
		PayStatus payStatus2 = new PayStatus();
		payStatus2.setName("已全部支付");
		PayStatus payStatus3 = new PayStatus();
		payStatus3.setName("已支付一部分");
		payStatusMapper.insert(payStatus1);
		payStatusMapper.insert(payStatus2);
		payStatusMapper.insert(payStatus3);
	}

	@Override
	public void cleardata() {
		//清除所有表的数据
		userMapper.truncateAllTables();
	}

}
