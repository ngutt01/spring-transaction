package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathya.config.AppConfig;
import com.sathya.service.IBankService;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext  ctx = new  AnnotationConfigApplicationContext(AppConfig.class);
		IBankService  service=(IBankService)ctx.getBean("bankServiceImpl");
		service.deposit(10110213167L, 17690.0);
		System.out.println("*************************");
		
		try {
		service.deposit(3009887621L,-4000.0);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("*************************");
		
		service.withdraw(4003215679L, 14500.0);
		
		
		
	}

}
