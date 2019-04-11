package com.wgj.SpringBootTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wgj.SpringBootTest.bean.User;
import com.wgj.SpringBootTest.bean.UserInfo;
import com.wgj.SpringBootTest.service.TestInterface;

@Controller
@RequestMapping("/User")
@ComponentScan(basePackages={"com.wgj.SpringBootTest.service"})
public class UserController {
	
	@Autowired
	private TestInterface face;
		
	@RequestMapping("/getUser")
	@ResponseBody
	UserInfo getUser(){
		return face.getUser();
	}
	
	@RequestMapping("/add")
	@ResponseBody
	String add(){
		face.insetUser("测试", "测试");
		return "插入成功";
	}
	
	@RequestMapping("/getall")
	@ResponseBody List<UserInfo> getall(){
		return face.selectALL();
	}
	
}
