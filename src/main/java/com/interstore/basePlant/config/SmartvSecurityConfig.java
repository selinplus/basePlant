package com.interstore.basePlant.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SmartvSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.csrf().disable().authorizeRequests().antMatchers("/resource/**").permitAll()
			.antMatchers("/wechat/**").permitAll()
			.antMatchers("dingtalk/**").permitAll()
			.antMatchers("/user/**","/dept/**").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/home")
				.failureUrl("/login?error").permitAll()
			.and()
			.logout().permitAll();
	}
	
}
