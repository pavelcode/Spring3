package com.cblue.spring05.di;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public Employee() {
		System.out.println("Employee init");
	}
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

}
