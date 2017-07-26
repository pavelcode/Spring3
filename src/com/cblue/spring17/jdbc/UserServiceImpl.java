package com.cblue.spring17.jdbc;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public boolean register(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
	

	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.get(user);
	}

	

	
	

}
