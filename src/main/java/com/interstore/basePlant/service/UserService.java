package com.interstore.basePlant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.interstore.basePlant.domain.Role;
import com.interstore.basePlant.domain.User;
import com.interstore.basePlant.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserMapper roleMapper;
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
	
	public User findByUsername(String username) {
		return userMapper.findByUsername(username);
	}
	public void save(User u) {
		u.setPassword(passwordEncoder().encode(u.getPassword()));
		userMapper.save(u);
		List<Role> listRole = u.getRoles();
		roleMapper.saveRoles(u.getRoles());
	}
}
