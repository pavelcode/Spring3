package com.cblue.spring03.lazy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring03.lazy.Customer;

public class TestLazy {

	//spring容器加载的时候，立即初始化类
	@Test
	public void immediateInitObj(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("---");
		Customer customer = (Customer)context.getBean("customer01");
		
	}
	
	//只有使用到类的方法的时候，才初始化类
	@Test
	public void lazyInitObj(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("---");
		Customer customer = (Customer)context.getBean("customer02");
	    customer.toString();
		
	}
}
