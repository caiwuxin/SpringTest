package com.test.paditang.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.test.paditang.entity.Car;

public class BeanFactoryTest {
	
	public static void main(String []args){
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource resource = resolver.getResource("classpath:beans.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		System.out.println("init beanfactory");
		Car car = bf.getBean("car1", Car.class);
		car.introduceThisCar();
	}
}
