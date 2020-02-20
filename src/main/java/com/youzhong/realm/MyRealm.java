package com.youzhong.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.youzhong.dao.UserMapper;
import com.youzhong.entity.User;
import com.youzhong.entity.UserExample;

@Component
public class MyRealm extends AuthenticatingRealm{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "myrealm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		// TODO Auto-generated method stub
		return token instanceof UsernamePasswordToken;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = token.getPrincipal().toString();
		String password = new String((char[])token.getCredentials());
		UserExample example = new UserExample();
		example.createCriteria()//
			.andUsernameEqualTo(username)//
			.andPasswordEqualTo(password);
		List<User> list = userMapper.selectByExample(example);
		if(list!=null && list.size()>0) {
			User user = list.get(0);
			return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(),getName());
		}
		return null;
	}

	
}
