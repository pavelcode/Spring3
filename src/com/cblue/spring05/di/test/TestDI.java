package com.cblue.spring05.di.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring01.ioc.Student;

import com.cblue.spring05.di.*;

public class TestDI {

	//通过setter方法注入对象
	@Test
	public void testSetterProperty(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("person01");
		System.out.println(person);
	}
	
	//通过构造方法注入对象
//	@Test
//	public void testConstructorProperty(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person person = (Person)context.getBean("person02");
//		System.out.println(person);
//	}
	
	//springEL注入
	@Test
	public void testSPEL(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("1111");
		Person person = (Person)context.getBean("person04");
		System.out.println(person);
	}
	
	
	//复杂数据类型注入
	//如果属性有问题，只初始化
	@Test
	public void testComplexType(){
		System.out.println("0000");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("1111");
		Department department = (Department)context.getBean("department");
		System.out.println("222");
		System.out.println(department.getDid());
		System.out.println(department.getDname());
		System.out.println(department.getEmployee());
		System.out.println(department.getLists());
		System.out.println(department.getMap());
	}
	
	
	
}
