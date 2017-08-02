package com.cblue.spring17.jdbc;

import java.util.List;

import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class UserDaoImpl02 extends JdbcDaoSupport implements UserDao {

	public boolean save(User user) {
		// TODO Auto-generated method stub
		this.getJdbcTemplate().update("insert into user(name,pass) values(?,?)",   
                new Object[]{user.getName(),user.getPass()}); 
		return false;
	}

	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public User get(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void checkDaoConfig() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	

}
