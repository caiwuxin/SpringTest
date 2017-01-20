package com.test.paditang.event;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent>{

	@Override
	public void onApplicationEvent(MailSendEvent event) {
		// TODO Auto-generated method stub
		MailSendEvent msEvent = (MailSendEvent)event;
		System.out.println("MailListener 向"+msEvent.getTo()+"发送了一封邮件");
	}	

	
}
