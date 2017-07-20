package com.cblue.spring02.scope.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring02.scope.User;
public class TestScope {
	
	@Test
	public void testSingle(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = (User)context.getBean("user01");
		System.out.println(user1);
		User user2 = (User)context.getBean("user01");
		System.out.println(user2);
	}
	@Test
	public void testProperty(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user1 = (User)context.getBean("user02");
		System.out.println(user1);
		User user2 = (User)context.getBean("user02");
		System.out.println(user2);
	}

}
