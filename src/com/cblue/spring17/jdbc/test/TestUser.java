package com.cblue.spring17.jdbc.test;

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
		user.setName("xiaoming");
		user.setPass("123");
		userService.register(user);
	}
	
	@Test
	public void testLogin(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User();
		user.setName("xiaoming");
		user.setPass("123");
		User user1 = userService.login(user);
		System.out.println(user1);
		
	}
}
