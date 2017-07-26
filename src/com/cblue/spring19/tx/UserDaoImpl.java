package com.cblue.spring19.tx;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class UserDaoImpl extends JdbcTemplate implements UserDao {

	public boolean save(User user) {
		// TODO Auto-generated method stub
		int count = update("insert into user(name,pass) values(?,?)",   
                 new Object[]{user.getName(),user.getPass()}); 
		System.out.println("UserDaoImpl--count="+count);
		return count>0;
	}
	



  

	

}
