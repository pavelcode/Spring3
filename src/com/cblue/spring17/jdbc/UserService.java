package com.cblue.spring17.jdbc;

public interface UserService {
	

	//注册
	public boolean register(User user);
	//登录
	public User login(User user);
	
	

}
