package com.cblue.spring17.jdbc;

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
	

	public void update(User user) {
		// TODO Auto-generated method stub
		  String sql="update user set name=? where id=?";
	      this.update(sql, "权", "1");
		
	}
	
	public void delete(User user) {  
        this.update(  
                "delete from tb_test1 where id = ?",   
                new Object[]{user.getId()},   
                new int[]{java.sql.Types.INTEGER});  
    }  
	
	public User get(User user) {
		// TODO Auto-generated method stub
		System.out.println(this.queryForObject("select * from user where name = ? and pass=?",new Object[]{user.getName(),user.getPass()}, User.class));
		 return  null;//class是结果数据的java类型  
	}  
	
	public List<User> queryForList1(User user) {  
	        return (List<User>) this.queryForList("select * from tb_test1 where username = ?",   
	                            new Object[]{user.getName()},  
	                            User.class);  
	}



  

	

}
