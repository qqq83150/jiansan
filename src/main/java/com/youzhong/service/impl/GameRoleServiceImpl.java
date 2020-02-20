package com.youzhong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.GameRoleMapper;
import com.youzhong.entity.GameRole;
import com.youzhong.entity.GameRoleExample;
import com.youzhong.service.IGameRoleService;

@Service
public class GameRoleServiceImpl implements IGameRoleService {

	@Autowired
	private GameRoleMapper gameRoleMapper;
	@Override
	public List<GameRole> findAll() {
		return gameRoleMapper.selectByExample(null);
	}
	@Override
	public void save(GameRole gameRole) {
		// TODO Auto-generated method stub
		gameRole.setCtime(new Date());
		gameRole.setMtime(new Date());
		gameRoleMapper.insertSelective(gameRole);
	}
	@Override
	public List<GameRole> findByAccountId(int id) {
		// TODO Auto-generated method stub
		GameRoleExample example = new GameRoleExample();
		example.createCriteria().andAccountIdEqualTo(id);
		return gameRoleMapper.selectByExample(example);
	}

}
