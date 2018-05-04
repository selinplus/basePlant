package com.interstore.basePlant;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.interstore.basePlant.config.CustomUserDetails;
import com.interstore.basePlant.domain.Role;
import com.interstore.basePlant.domain.User;
import com.interstore.basePlant.mapper.UserMapper;
import com.interstore.basePlant.service.UserService;

@SpringBootApplication
public class BasePlantApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(BasePlantApplication.class, args);
	}
	
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder, UserMapper repository, UserService userService) throws Exception {
		if (repository.count()==0)
			userService.save(new User("admin", "adminPassword", Arrays.asList(new Role("USER","USER"), new Role("LOGIN","LOGIN") , new Role("ADMIN","ADMIN"))));
		builder.userDetailsService(userDetailsService(repository)).passwordEncoder(passwordEncoder);
	}
	/**
	 * return an instance of our CustomUserDetails.
	 * @param repository
	 * @return
	 */
	private UserDetailsService userDetailsService(final UserMapper repository) {
		return username -> new CustomUserDetails(repository.findByUsername(username));
	}
}
