package com.test.paditang.aop.adivce;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
//前置增强
public class GreetingBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object obj)
			throws Throwable {
		String clientName = (String)args[0];
		System.out.println("How are you Mr "+clientName);
	}

}
