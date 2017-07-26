package com.cblue.spring15.aop.advice;

public class PersonDaoImpl implements PersonDao{
	public String savePerson() {
		System.out.println("save person");
		//添加异常，测试异常通知
		//int i= 1/0;
		return "return save Person";
	}
}
