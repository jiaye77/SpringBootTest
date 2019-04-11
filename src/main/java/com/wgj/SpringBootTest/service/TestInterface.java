package com.wgj.SpringBootTest.service;

import java.util.List;

import com.wgj.SpringBootTest.bean.UserInfo;

public interface TestInterface {
	public int num();
	
	public UserInfo getUser();
	
	public int insetUser(String username,String password);

	public UserInfo listUser();
	
	List<UserInfo> selectALL();

	List<UserInfo> testAll();
}