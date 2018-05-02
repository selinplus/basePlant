package com.interstore.basePlant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.interstore.basePlant.domain.Role;
import com.interstore.basePlant.domain.User;
@Mapper
public interface UserMapper {
	@Select("select * from user where username=#{username}")
	User findByUsername(@Param("username") String username);
	@Insert("insert into user (username,password,phone) values(#{username},#{password},#{phone})")
	void save(User u);
	@Select("select count(1) as cnt from user")
	int count();
	@Insert("")
	void save(List<Role> roles);
}
