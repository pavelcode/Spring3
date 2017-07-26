package com.cblue.spring10.annotation.ioc;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Resource(name="student")
	private Student student;
	
	public void work(){
		this.student.study();
	}

}
