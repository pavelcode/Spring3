package com.cblue.spring12.annotation.extend.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring12.annotation.extend.Student;



public class TestExtend {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Student student = (Student)context.getBean("student");
	    student.work();
	}
}
