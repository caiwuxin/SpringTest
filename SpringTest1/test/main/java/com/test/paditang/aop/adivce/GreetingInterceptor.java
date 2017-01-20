package com.test.paditang.aop.adivce;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//环绕增强
public class GreetingInterceptor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object[] args = invocation.getArguments();
		String clientName = (String)args[0];
		System.out.println("How are you Mr."+clientName);
		Object object = invocation.proceed();//通过反射机制调用目标方法
		System.out.println("Please enjoy yourself！");
		return object;
	}

}
