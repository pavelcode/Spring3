package com.cblue.spring14.aop.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring14.aop.PersonDao;


/**
 * 实现AOP，调用前置后置通知
 * @author pavel
 *
 */
public class Test01 {

	
	@Test
	public void testAOP(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    PersonDao personDao = (PersonDao)context.getBean("personDao");
	    personDao.savePerson();
	}
}
