package com.cblue.spring17.jdbc;

import java.util.List;

public interface UserService {
	

	//注册
	public boolean register(User user);
	//修改密码
	public boolean changePass(User user);
	//登录
	public User login(User user);
	//查询所有用户
	public List<User> allUser();
	//注销
	public boolean logout(User user);
	
	
	

}
