package com.test.paditang.aop.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//方法匹配规则
	@Override
	public boolean matches(Method arg0, Class<?> clazz) {
		// TODO Auto-generated method stub
		return "greetTo".equals(arg0.getName());
	}
	
	//匹配规则：waiter类或者子类，如果不写该代码，true默认匹配所有的类
	public ClassFilter getClassFilter(){
		return new ClassFilter() {
			
			@Override
			public boolean matches(Class<?> arg0) {
				// TODO Auto-generated method stub
				return Waiter.class.isAssignableFrom(arg0);
			}
		};
	}

}
