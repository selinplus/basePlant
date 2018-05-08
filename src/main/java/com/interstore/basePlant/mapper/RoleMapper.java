package com.interstore.basePlant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.interstore.basePlant.domain.Role;

@Mapper
public interface RoleMapper {
	
	@Select("select count(*) from role where name=#{name}")
	int findByName(@Param("name") String name);
	
	@Insert("insert into role (name,description) values(#{role.name},#{role.description}")
	int save(@Param("role") Role r);
	
	@Insert({"<script>", 
        "insert into  role (name,description) values ",
        "<foreach collection='list' item='role' index='index' open='(' separator = '),(' close=')' >#{role.name},#{user.description}</foreach>",
        "</script>"})
	int save(@Param("list") List<Role> roles);
}
