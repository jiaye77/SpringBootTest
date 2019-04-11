package com.wgj.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableAutoConfiguration
@ComponentScan(basePackages={"com.wgj.SpringBootTest.controller"})
@EnableScheduling
public class AppController {
	
	
	public static void main(String[] args) {
		SpringApplication.run(AppController.class, args);
	}
}
