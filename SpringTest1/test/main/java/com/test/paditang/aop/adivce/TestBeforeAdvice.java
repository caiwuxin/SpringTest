package com.test.paditang.aop.adivce;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class TestBeforeAdvice {

	public static void main(String []args){
		Waiter target = new NaiveWaiter();
		BeforeAdvice advice = new GreetingBeforeAdvice();
		//代理工厂
		ProxyFactory pf = new ProxyFactory();
		//设置代理目标
		pf.setTarget(target);
		//为代理目标提供增强
		pf.addAdvice(advice);
		//生成代理实例
		Waiter proxy = (Waiter)pf.getProxy();
		proxy.greetTo("John");
	}
}
