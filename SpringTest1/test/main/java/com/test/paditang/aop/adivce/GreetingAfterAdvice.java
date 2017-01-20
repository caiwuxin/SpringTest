package com.test.paditang.aop.adivce;

import java.lang.reflect.Method;
//后置增强
import org.springframework.aop.AfterReturningAdvice;

public class GreetingAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("Please enjoy yourself!");
		
	}

}
