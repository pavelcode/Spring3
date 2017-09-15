package com.cblue.spring06.document.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cblue.spring06.document.DocumentManager;

public class Test01 {
	
	/**
	 * 面向接口编程：只修改注入的值，有极大的扩展性
	 */
	@Test
	public void testDocument(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentManager documentManager = (DocumentManager)context.getBean("documentManager");
		documentManager.write();
		documentManager.read();
	}

}
