package com.test.paditang.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.paditang.aop.advisor.Waiter;

public class ApplicationContextTest {

	private ApplicationContext ac;
	
	@Before
	public void prepare(){
		ac = new ClassPathXmlApplicationContext("beans.xml");//自动视为在classpath中
		//ac = new AnnotationConfigApplicationContext(Beans.class);//使用JavaConfig的方式配置
	}
	
	//@Test
	//public void process(){
		//Car car = ac.getBean("car1",Car.class);
		//Car car = ac.getBean("car",Car.class);
		//car.introduceThisCar();
		//((ClassPathXmlApplicationContext)ac).destroy();
		
		//监听器测试
		/*MailSender mailSender = (MailSender)ac.getBean("mailSender");
		mailSender.sendMail("1045068055@qq.com");*/
		
		//aop增强测试
		/*Waiter waiter = (Waiter)ac.getBean("waiter");
		waiter.greetTo("caiwuxin");*/
	//}
	
	/*@Test
	public void AdvisorTest(){
		Waiter waiter = (Waiter)ac.getBean("waiter2");
		Seller seller = (Seller)ac.getBean("seller");
		waiter.greetTo("caiwuxin");
		waiter.serveTo("caiwuxin");
		seller.greetTo("caiwuxin");
	}*/
	
	@Test
	public void DynamicAdvisorTest(){
		Waiter waiter = (Waiter)ac.getBean("waiter3");
		waiter.serveTo("jyy");
		waiter.greetTo("jyy");
		waiter.greetTo("caiwuxin");
		waiter.serveTo("caiwuxin");
	}
}
