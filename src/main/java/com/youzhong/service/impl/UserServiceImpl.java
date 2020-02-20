package com.youzhong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.UserMapper;
import com.youzhong.entity.User;
import com.youzhong.entity.UserExample;
import com.youzhong.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user) {
		UserExample example = new UserExample();
		example.createCriteria()//
				.andUsernameEqualTo(user.getUsername())//
				.andPasswordEqualTo(user.getPassword());
		List<User> list = userMapper.selectByExample(example);
		if(list != null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

}
