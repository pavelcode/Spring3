package com.cblue.spring17.jdbc;

import java.util.List;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean register(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
	
	public boolean changePass(User user){
		return userDao.update(user);
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.get(user);
	}

	public List<User> allUser() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	public boolean logout(User user) {
		// TODO Auto-generated method stub
		return userDao.delete(user);
	}


}
