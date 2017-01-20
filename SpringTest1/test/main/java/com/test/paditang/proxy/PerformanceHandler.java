package com.test.paditang.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler{

	private Object target;
	public PerformanceHandler(Object target){
		this.target = target;
	}
	//在代理实例上处理方法调用并返回结果。在与方法关联的代理实例上调用方法时，将在调用处理程序上调用此方法。
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		PerformanceMonitor.begin(target.getClass().getName()+"."+method.getName());
		Object object = method.invoke(target, args);
		PerformanceMonitor.end();
		return object;
	}

}
