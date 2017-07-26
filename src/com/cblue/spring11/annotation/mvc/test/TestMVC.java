package com.cblue.spring11.annotation.mvc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring11.annotation.mvc.PersonAction;


public class TestMVC {

	@Test
	public void testMVC(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    PersonAction personAction = (PersonAction)context.getBean("personAction");
	    personAction.savePerson();
	}
}
