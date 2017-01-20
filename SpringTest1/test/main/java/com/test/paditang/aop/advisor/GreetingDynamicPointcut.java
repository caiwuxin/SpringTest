package com.test.paditang.aop.advisor;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut{

	private static List<String>specialList = new ArrayList<String>();
	static {
		specialList.add("caiwuxin");
	}
	public ClassFilter getclassFilter(){
		return new ClassFilter() {
			
			@Override
			public boolean matches(Class<?> arg0) {
				// TODO Auto-generated method stub
				System.out.println("调用getClassFilter()对"+arg0.getName()+"做静态检查");
				return Waiter.class.isAssignableFrom(arg0);
			}
		};
	}
	
	public boolean matches(Method method,Class<?>clazz){
		System.out.println("调用matches(method,clazz)"+clazz.getName()+"."+clazz.getName()+"静态检查");
		return "greetTo".equals(method.getName());
	}
	
	@Override
	public boolean matches(Method arg0, Class<?> arg1,Object[] object) {
		// TODO Auto-generated method stub
		System.out.println("调用matches(method,clazz)"+arg1.getName()+"."+arg0.getName()+"动态检查");
		String clientNameString = (String)object[0];
		return specialList.contains(clientNameString);
	}
}
