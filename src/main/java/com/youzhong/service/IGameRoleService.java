package com.youzhong.service;

import java.util.List;

import com.youzhong.entity.GameRole;

public interface IGameRoleService {

	List<GameRole> findAll();

	void save(GameRole gameRole);

}
