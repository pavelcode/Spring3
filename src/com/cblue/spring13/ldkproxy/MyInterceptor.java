package com.cblue.spring13.ldkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 1、引入personDao和Transaction
 * 2、完成invoke方法
 * @author zd
 *
 */
public class MyInterceptor implements InvocationHandler{
	
	private Object target;
	private Transaction transaction;
	public MyInterceptor(Object target,Transaction transaction){
		this.target = target;
		this.transaction = transaction;
	}
	
	
	public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
		
		if(method.getName().equals("savePerson")
				||method.getName().equals("updatePerson")){
			this.transaction.beginTransaction();
			method.invoke(this.target, args);//调用目标类的目标方法
			this.transaction.commit();
		}else{
			method.invoke(this.target, args);//调用目标类的目标方法
		}
		return null;
	}
}
