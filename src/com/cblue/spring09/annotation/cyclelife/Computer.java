package com.cblue.spring09.annotation.cyclelife;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Computer {
	
	@PostConstruct
	public void init(){
		System.out.println("computer init");
	}
	
	public Computer(){
		System.out.println("computer  construct");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("computer desctory");
	}

}
