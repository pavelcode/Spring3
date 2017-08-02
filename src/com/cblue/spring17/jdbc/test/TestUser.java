package com.cblue.spring17.jdbc.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring17.jdbc.User;
import com.cblue.spring17.jdbc.UserService;

public class TestUser {
	
	
	
	
	@Test
	public void testRegistor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setName("xiaohei");
		user.setPass("123");
		userService.register(user);
	}
	
	@Test
	public void testChangePass(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setId(1);
		user.setPass("456");
		userService.changePass(user);
		
	}
	
	@Test
	public void testLogin(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setName("xiaoming");
		user.setPass("456");
		User user1 = userService.login(user);
		System.out.println(user1);
		
	}
	
	@Test
	public void testAll(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		List<User> users = userService.allUser();
		for(User user:users){
			System.out.println(user);
		}
		
	}
	
	@Test
	public void testLogout(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setId(1);
		userService.logout(user);
	}
}
