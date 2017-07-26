package com.cblue.spring17.jdbc;

public interface UserDao {

    public boolean save(User user);
	
//	public boolean update(User user);
//	
//	public boolean delete(User user);
//	
	public User get(User user);
}
