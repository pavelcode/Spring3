package com.cblue.spring09.annotation.cyclelife.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring04.cyclelife.Computer;

public class TestCyclelife {

	@Test
	public void testComputerCyclelife(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Computer computer = (Computer)context.getBean("computer");
		
		
	}
}
