package com.cblue.spring11.annotation.mvc;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("保存person");

	}

}
