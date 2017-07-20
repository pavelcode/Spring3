package com.cblue.spring01.ioc;

public class StudentFactoryStaticMethod {

	public static Student getInstance(){
		return new Student();
	}
}
