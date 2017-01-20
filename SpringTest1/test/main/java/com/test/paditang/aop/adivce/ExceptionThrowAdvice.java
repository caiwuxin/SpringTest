package com.test.paditang.aop.adivce;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//异常增强逻辑
public class ExceptionThrowAdvice implements ThrowsAdvice{

	//方法名必须为afterThrowing，但是接口中没有定义该方法
	public void afterThrowing(Method method ,Object[]args,Object target
								,Exception e)throws Throwable{
		
	}
}
