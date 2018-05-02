package com.interstore.basePlant.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.interstore.basePlant.domain.Role;
import com.interstore.basePlant.mapper.RoleMapper;

public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public void save(Role r) {
		roleMapper.save(r.getName(),r.getDescription());
	}

}
