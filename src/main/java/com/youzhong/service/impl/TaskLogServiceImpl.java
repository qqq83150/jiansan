package com.youzhong.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.youzhong.dao.AccountMapper;
import com.youzhong.dao.GameRoleMapper;
import com.youzhong.dao.TaskLogMapper;
import com.youzhong.entity.Account;
import com.youzhong.entity.AccountExample;
import com.youzhong.entity.GameRole;
import com.youzhong.entity.GameRoleExample;
import com.youzhong.entity.TaskLog;
import com.youzhong.entity.TaskLogExample;
import com.youzhong.entity.TaskLogExample.Criteria;
import com.youzhong.service.ITaskLogService;
import com.youzhong.vo.TaskLogVO;

@Service
public class TaskLogServiceImpl implements ITaskLogService {

	@Autowired
	private TaskLogMapper taskLogMapper;

	@Autowired
	private GameRoleMapper gameRoleMapper;

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return taskLogMapper.countByExample(null);
	}

	@Override
	public List<TaskLog> findAll(int pageNum, int pageSize, TaskLogVO vo) {
		TaskLogExample example = new TaskLogExample();
		example.setOrderByClause("ctime desc");
		Criteria criteria = example.createCriteria();
		if (vo.getTaskTypeId() != 0) {
			criteria.andTaskTypeIdEqualTo(vo.getTaskTypeId());
		}
		if (vo.getWeixinId() != 0) {
			AccountExample example3 = new AccountExample();
			example3.createCriteria()//
					.andWeixinIdEqualTo(vo.getWeixinId());
			List<Account> list = accountMapper.selectByExample(example3);

			if (list != null && list.size() > 0) {

				List<Integer> ids = new ArrayList<Integer>(list.size());
				for (Account account : list) {
					ids.add(account.getId());
				}

				GameRoleExample example2 = new GameRoleExample();
				example2.createCriteria()//
						.andAccountIdIn(ids);
				List<GameRole> list2 = gameRoleMapper.selectByExample(example2);

				if (list2 != null && list2.size() > 0) {
					List<Integer> ids2 = new ArrayList<Integer>(list2.size());
					for (GameRole gameRole : list2) {
						ids2.add(gameRole.getId());
					}

					criteria.andGameRoleIdIn(ids2);
				}else {
					criteria.andGameRoleIdEqualTo(0);
				}
			}else {
				criteria.andGameRoleIdEqualTo(0);
			}
		}
		if (vo.getAccountId() != 0) {
			GameRoleExample example2 = new GameRoleExample();
			example2.createCriteria()//
					.andAccountIdEqualTo(vo.getAccountId());
			List<GameRole> list2 = gameRoleMapper.selectByExample(example2);

			if (list2 != null && list2.size() > 0) {
				List<Integer> ids2 = new ArrayList<Integer>(list2.size());
				for (GameRole gameRole : list2) {
					ids2.add(gameRole.getId());
				}
				criteria.andGameRoleIdIn(ids2);
			}else {
				criteria.andGameRoleIdEqualTo(0);
			}
		}
		if (vo.getGameRoleId() != 0) {
			criteria.andGameRoleIdEqualTo(vo.getGameRoleId());
		}
		if (vo.getMin() != 0.0) {
			criteria.andMoneyGreaterThanOrEqualTo(vo.getMin());
		}
		if (vo.getMax() != 0.0) {
			criteria.andMoneyLessThanOrEqualTo(vo.getMax());
		}
		PageHelper.startPage(pageNum, pageSize);
		return taskLogMapper.selectByExample(example);
	}

}
