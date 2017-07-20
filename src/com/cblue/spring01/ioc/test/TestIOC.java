package com.cblue.spring01.ioc.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring01.ioc.*;

public class TestIOC {
	
	//使用bean实例化对象
	@Test
	public void testObj(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		student.study();
	}
	
	//通过别名实例化对象
	@Test
	public void testObjByAlias(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("mystudent");
		student.study();
	}
	
	//通过静态工厂实例化对象
	//默认调用了StudentFactory.getInstance()
	@Test
	public void testObjByStaticFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student_factory_staticmethod");
		student.study();
	}
	
	//通过工厂方法
	@Test
	public void testObjByFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student02");
		student.study();
	}
}
