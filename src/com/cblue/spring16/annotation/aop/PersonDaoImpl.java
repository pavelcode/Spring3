package com.cblue.spring16.annotation.aop;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao{
	public void savePerson() {
		System.out.println("save person");
	}
}
