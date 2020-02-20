package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.Weixin;

public interface IWeixinService {

	void save(Weixin weixin);

	List<Weixin> findAll();

}
