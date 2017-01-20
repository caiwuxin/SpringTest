package com.test.paditang.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MailSender implements ApplicationContextAware{
	private ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext ctx)throws BeansException{
		this.ctx = ctx;
	}
	
	public void sendMail(String to){
		System.out.println("模拟发送邮件中....");
		MailSendEvent mse = new MailSendEvent(this.ctx, to);
		ctx.publishEvent(mse);//必须在bean.xml中配置监听事件
	}
}
