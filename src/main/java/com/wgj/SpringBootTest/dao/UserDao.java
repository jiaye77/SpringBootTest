package com.wgj.SpringBootTest.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wgj.SpringBootTest.bean.UserInfo;
import com.wgj.SpringBootTest.dao.baseDao.MyMapper;
@Mapper
public interface UserDao extends MyMapper<UserInfo>{

}
