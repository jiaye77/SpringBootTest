package com.wgj.SpringBootTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.wgj.SpringBootTest.bean.User;
import com.wgj.SpringBootTest.bean.UserInfo;
import com.wgj.SpringBootTest.dao.TestDao;
import com.wgj.SpringBootTest.dao.UserDao;
@Service
@ComponentScan(basePackages={"com.wgj.SpringBootTest.dao"})
public class TestInterfaceImpl implements TestInterface{

	@Autowired TestDao testdao;
	@Autowired UserDao userDao;
	@Override
	public int num() {
		return 0;
	}

	@Override
	public UserInfo getUser() {
		return testdao.findByName("ad");
	}

	@Override
	public int insetUser(String username, String password) {
		
		return testdao.insert(username, password);
	}

	@Override
	public UserInfo listUser() {
		return null;
	}

	@Override
	public List<UserInfo> selectALL() {
		return userDao.selectAll();
	}
	
	@Override
	public List<UserInfo> testAll() {
		return testdao.selectAll();
	}

	
}


