package com.test.paditang.service.impl;

import com.test.paditang.serivce.ForumService;

public class ForumServiceImpl implements ForumService{

	@SuppressWarnings("static-access")
	@Override
	public void removeTopic() {
		System.out.println("模拟删除主题记录");
		try {
			Thread.currentThread().sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings("static-access")
	@Override
	public void removeForum() {
		System.out.println("模拟删除论坛");
		try {
			Thread.currentThread().sleep(40);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

}
