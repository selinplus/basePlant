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
	@Insert("insert into user (username,password,phone,dept_id) values(#{u.username},#{u.password},#{u.phone},#{u.deptId})")
	void save(@Param("u") User u);
	@Select("select count(1) as cnt from user")
	int count();
	@Insert({"<script>", 
        "insert into role_user (name,description) values ",
        "<foreach collection='list' item='role' index='index' open='(' separator = '),(' close=')' >#{role.name},#{user.description}</foreach>",
        "</script>"})
	int saveRoles(@Param("list") List<Role> roles);
}
