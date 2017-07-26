package com.cblue.spring15.aop.advice.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring15.aop.advice.PersonDao;

/**
 * 实现各种通知
 * 前置通知
 * 后置通知
 * 异常通知
 * 最终通知
 * 环绕通知
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
