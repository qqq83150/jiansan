package com.youzhong.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youzhong.dao.WeixinMapper;
import com.youzhong.entity.Weixin;
import com.youzhong.service.IWeixinService;

@Service
public class WeixinServiceImpl implements IWeixinService {

	@Autowired
	private WeixinMapper weixinMapper;
	@Override
	public void save(Weixin weixin) {
		// TODO Auto-generated method stub
		weixin.setCtime(new Date());
		weixin.setMtime(new Date());
		weixinMapper.insertSelective(weixin);
	}
	@Override
	public List<Weixin> findAll() {
		// TODO Auto-generated method stub
		return weixinMapper.selectByExample(null);
	}

}
