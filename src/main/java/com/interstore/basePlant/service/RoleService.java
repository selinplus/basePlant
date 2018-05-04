package com.interstore.basePlant.service;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interstore.basePlant.domain.Role;
import com.interstore.basePlant.mapper.RoleMapper;

@Service
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	
	public void save(Role r) {
		roleMapper.save(r);
	}
	public long saveRoles(List<Role> rs) {
		return rs.stream().filter(r -> roleMapper.findByName(r.getName())==0)
			.map(newRole -> roleMapper.save(newRole)).count();
		
	}
}
