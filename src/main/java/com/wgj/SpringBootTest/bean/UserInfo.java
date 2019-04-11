package com.wgj.SpringBootTest.bean;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "userinfo")
public class UserInfo {
	private Integer id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserInfo(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
}
