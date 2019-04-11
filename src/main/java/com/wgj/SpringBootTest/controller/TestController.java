package com.wgj.SpringBootTest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wgj.SpringBootTest.bean.User;
import com.wgj.SpringBootTest.bean.UserInfo;
import com.wgj.SpringBootTest.service.TestInterface;


@Controller
@RequestMapping("/test")
@ComponentScan(basePackages={"com.wgj.SpringBootTest.service"})
public class TestController {
	@Autowired
	private TestInterface face;
	
	private final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/num")
	@ResponseBody
	int num(){
		return face.num();
	}
	
	@RequestMapping("/getlog")
	@ResponseBody
	User getLog(){
		log.info("TestController getLog info");
		return new User();
	}
	
	@RequestMapping("/getall")
	@ResponseBody
	List<UserInfo> getall(){
		return face.testAll();
	}
}
