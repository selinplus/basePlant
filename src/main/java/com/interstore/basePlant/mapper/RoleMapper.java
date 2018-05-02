package com.interstore.basePlant.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.interstore.basePlant.domain.User;
@Mapper
public interface RoleMapper {
	@Select("select * from user where username=#{username}")
	User findByUsername(@Param("username") String username);
	@Insert("insert into role (name,description) values(#{name},#{description}")
	void save(@Param("name") String name,@Param("description") String description);
}
