package com.cblue.spring05.di;

import java.util.List;
import java.util.Map;

public class Department {
	
	private int did;
	private String dname;
	private Employee employee;
	private  List lists; 
	private  Map map;
	
	public Department() {
		System.out.println("Department init");
	}
	
	
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
