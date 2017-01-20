package com.test.paditang.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(obj.getClass().getName()+"."+method.getName());
		String clientName = (String)args[0];
		System.out.println("How are you! Mr."+clientName+".");
	}

}
