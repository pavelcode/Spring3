package com.cblue.spring15.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Transaction {
	
	//前置通知
	public void beginTransaction(JoinPoint joinPoint){
		System.out.println("目标类"+joinPoint.getTarget().getClass());
		System.out.println("目标方法"+joinPoint.getSignature().getName());
		System.out.println("目标参数个数"+joinPoint.getArgs().length);
		System.out.println("begin transaction");
	}
	//后置返回通知
	public void commit(JoinPoint joinPoint,Object val){
		System.out.println("commit");
		System.out.println("获得目标方法的返回值:"+val);
	}
	//异常通知
	public void exceptionMethod(JoinPoint jointPoint,Throwable ex){
	   System.out.println(ex.getMessage());	
	}
	//最终通知
	public void finallyMethod(){
		System.out.println("finallyMethod");
	}
	//环绕通知
	public Object aroundMethod(ProceedingJoinPoint point){
		System.out.println("aroundMethod before");
		Object obj = null;
		try {
			obj = point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aroundMethod after");
		return obj;
	}
	
}
