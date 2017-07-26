package com.cblue.spring14.aop;

public class Transaction {
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	public void commit(){
		System.out.println("commit");
	}
}
