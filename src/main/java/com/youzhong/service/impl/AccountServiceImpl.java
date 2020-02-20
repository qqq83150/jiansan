package com.youzhong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.AccountMapper;
import com.youzhong.entity.Account;
import com.youzhong.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	private AccountMapper accountMapper;
	@Override
	public void save(Account account) {
		// TODO Auto-generated method stub
		account.setCtime(new Date());
		account.setMtime(new Date());
		accountMapper.insertSelective(account);
	}
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return accountMapper.selectByExample(null);
	}

}
