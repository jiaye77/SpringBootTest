package com.wgj.SpringBootTest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import com.wgj.SpringBootTest.bean.User;
import com.wgj.SpringBootTest.bean.UserInfo;

@Mapper
@Transactional
public interface TestDao {
	@Select("SELECT * FROM USERINFO WHERE username = #{username}")
	UserInfo findByName(@Param("username") String username);
	
	@Insert("INSERT INTO USERINFO(username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String name, @Param("password") String password);
	
	@Select("SELECT * FROM USERINFO")
	List<UserInfo> selectAll();
}
