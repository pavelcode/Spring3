package com.cblue.spring17.jdbc;

import java.util.List;

public interface UserDao {

    public boolean save(User user);
	
	public boolean update(User user);	

	public User get(User user);
	
	public List<User> getAll();
	
	public boolean delete(User user);
}
