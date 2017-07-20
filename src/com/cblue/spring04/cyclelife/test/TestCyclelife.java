package com.cblue.spring04.cyclelife.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring04.cyclelife.Computer;

public class TestCyclelife {

	/**
	 * 如果是单例的，spring负责对象销毁
	 * 如果是多例，spring不负责销毁
	 */
	@Test
	public void testComputerCyclelife(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer computer = (Computer)context.getBean("computer");
		//销毁
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext)context;
		classPathXmlApplicationContext.close();
		
	}
}
