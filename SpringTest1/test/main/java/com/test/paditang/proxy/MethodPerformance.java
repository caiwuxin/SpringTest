package com.test.paditang.proxy;

public class MethodPerformance {

	private long start;
	private long end;
	private String serviceMethod;
	
	public MethodPerformance(String serviceMethod){
		this.serviceMethod = serviceMethod;
		this.start = System.currentTimeMillis();
	}
	
	public void printPerformance(){
		this.end = System.currentTimeMillis();
		long spendTime = end-start;
		
		System.out.println(serviceMethod+"执行耗费："+spendTime+"ms");
	}
	
}
