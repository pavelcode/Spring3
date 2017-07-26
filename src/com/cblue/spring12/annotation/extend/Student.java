package com.cblue.spring12.annotation.extend;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	public void work(){
		System.out.println("学生学习");
	}
	
}
