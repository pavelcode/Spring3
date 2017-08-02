package com.cblue.spring17.jdbc;

import java.util.List;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class UserDaoImpl extends JdbcTemplate implements UserDao {

	public boolean save(User user) {
		// TODO Auto-generated method stub
		int count = this.update("insert into user(name,pass) values(?,?)",   
                 new Object[]{user.getName(),user.getPass()}); 
		System.out.println("UserDaoImpl--count="+count);
		return count>0;
	}
	

	public boolean update(User user) {
		// TODO Auto-generated method stub
		int count= this.update("update user set pass=? where id=?", new Object[]{user.getPass(),user.getId()});
	    return count>0;
	}
	
	
	
	public User get(User user) {
		// TODO Auto-generated method stub
		User user1 = this.queryForObject("select * from user where name=? and pass=?",new Object[]{user.getName(),user.getPass()},new BeanPropertyRowMapper<User>(User.class));
		return  user1;
	}  
	
	public List<User> getAll() {
		return (List<User>) this.query("select * from  user",new BeanPropertyRowMapper<User>(User.class));    
	}
	

	public boolean delete(User user) {  
        int count = this.update("delete from user where id = ?", new Object[]{user.getId()});  
        return count>0;
    }  



  

	

}
