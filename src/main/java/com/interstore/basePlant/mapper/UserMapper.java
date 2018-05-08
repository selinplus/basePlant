package com.interstore.basePlant.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.interstore.basePlant.domain.User;
@Mapper
public interface UserMapper {
	@Select("select * from user where username=#{username}")
	User findByUsername(@Param("username") String username);
	
	@Insert("insert into user "
			+ "(username,password,phone,dept_id) values"
			+ "(#{u.username},#{u.password},#{u.phone},#{u.deptId})")
	void save(@Param("u") User u);
	
	@Select("select count(1) as cnt from user")
	int count();
	
	
}
