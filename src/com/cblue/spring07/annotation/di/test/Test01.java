package com.cblue.spring07.annotation.di.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring07.annotation.di.Person;

public class Test01 {
   
	@Test
	public void test01(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Person person = (Person)context.getBean("person");
	    person.work();
	}
}
