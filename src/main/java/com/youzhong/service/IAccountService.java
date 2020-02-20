package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Account;

public interface IAccountService {

	void save(Account account);

	List<Account> findAll();

}
