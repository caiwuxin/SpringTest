package com.test.paditang.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class Boss {

	
	@SuppressWarnings("unused")
	private Car car;
	
	public Boss(){
		System.out.println("Here comes the boss!");
	}
	
	@SuppressWarnings("unused")
	@Autowired
	@Lazy
	private void setCar(Car car){
		System.out.println("execute int car");
		this.car = car;
	}
	@SuppressWarnings("unused")
	@PostConstruct
	private void init(){
		System.out.println("init the method");
	}
	@SuppressWarnings("unused")
	@PreDestroy
	private void destroy(){
		System.out.println("destroy it");
	}
}
