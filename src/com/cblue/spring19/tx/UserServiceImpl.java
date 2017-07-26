package com.cblue.spring19.tx;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void save() {
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setName("zhangsan");
		u1.setPass("123");
		userDao.save(u1);
		
		int i= 1/0;
		
		User u2 = new User();
		u2.setName("lisi");
		u2.setPass("123");
		userDao.save(u2);
		
		
		
	}

}
