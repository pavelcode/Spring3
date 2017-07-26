package com.cblue.spring16.annotation.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //说明该类是切面
public class Transaction {
	
	//定义切入点
	@Pointcut("execution(* com.cblue.spring16.annotation.aop..*.*(..))")
	private void aaa(){} //定义切点标示方法
	//等同于 <aop:pointcut expression="execution(* com.cblue.spring15.aop.advice.*.*(..))" id="pointcut"/>
	
	//@Before("execution(* com.cblue.spring16.annotation.aop..*.*(..))")
	@Before("aaa()")
	public void beginTransaction(){
		System.out.println("begin transaction");
	}
	
	//@AfterReturning("execution(* com.cblue.spring16.annotation.aop..*.*(..))")
	@AfterReturning("aaa()")
	public void commit(){
		System.out.println("commit");
	}
}
