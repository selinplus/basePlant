package com.interstore.basePlant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.interstore.basePlant.domain.Dept;
import com.interstore.basePlant.domain.User;

@Mapper
public interface DeptMapper {
	@Select("select * from dept where id=#{id}")
	User findById(@Param("id") String id);
	@Insert("insert into dept "
			+ "(id,name,standalone,customer,createDate,modifyDate) values"
			+ "(#{d.id},#{d.name},#{d.standalone},#{d.customer},#{d.createDate},#{d.modifyDate})")
	void save(@Param("d") Dept d);
	@Select("select * from dept where parent_id=#{parentId}")
	List<Dept> findByParent(@Param("parentId") String parentId);
	
	@Update("update dept set "
			+ "name=#{d.name},standalone=#{d.standalone},"
			+ "customer=#{d.customer},modify_date=#{d.modifyDate} "
			+ "where id=#{d.id}")
	void updateById(@Param("d") Dept d);
}
