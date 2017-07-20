package com.cblue.spring07.annotation.di;

import javax.annotation.Resource;

public class Person {
	
	@Resource(name="student")
	private Student student;
	
	public void work(){
		this.student.study();
	}

}
