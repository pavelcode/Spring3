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
	
	/*
	 * scope与lazy-init的结合
	 * 当scope的为prototype的时候，默认的框架启动初始化就会失效，这时候就有访问到这个类的时候，才会初始化
	 */
		@Test
		public void prototypeAndLazyObj(){
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println("---");
			Customer customer = (Customer)context.getBean("customer03");
		    customer.toString();	
		}
}
