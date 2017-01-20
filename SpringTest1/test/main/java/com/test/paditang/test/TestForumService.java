package com.test.paditang.test;

import java.lang.reflect.Proxy;

import com.test.paditang.proxy.CglibProxy;
import com.test.paditang.proxy.PerformanceHandler;
import com.test.paditang.serivce.ForumService;
import com.test.paditang.service.impl.ForumServiceImpl;

public class TestForumService {

	public static void JDKDynamicProxy(){
		ForumService target = new ForumServiceImpl();
		PerformanceHandler handler= new PerformanceHandler(target);
		ForumService proxy = (ForumService)Proxy.newProxyInstance(									//创建代理实例
					target.getClass().getClassLoader(),target.getClass().getInterfaces(), handler);	//调用代理接口里的invoke方法
		
		proxy.removeForum();
	}
	
	public static void CglibProxyMethod(){
		CglibProxy proxy = new CglibProxy();
		ForumServiceImpl forumService = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
		forumService.removeForum();
	}
	
	public static void main(String []args){
		
		//proxy.removeTopic();
	}
}
