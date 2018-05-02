package com.interstore.basePlant.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.interstore.basePlant.domain.User;

@Mapper
public interface DeptMapper {
	@Select("select * from dept where id=#{id}")
	User findById(@Param("id") String id);
	@Insert("")
	void save();
	//TODO:add fields of dept
}
