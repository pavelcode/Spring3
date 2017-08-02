package com.cblue.spring12.extend.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring12.extend.Student;


public class TestExtend {

	@Test
	public void testxml(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Student student = (Student)context.getBean("student");
	    System.out.println(student.getName());
	}
}
