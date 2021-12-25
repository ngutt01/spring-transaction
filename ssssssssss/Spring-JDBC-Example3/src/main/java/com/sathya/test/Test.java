package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathya.config.ApplicationConfig;
import com.sathya.service.ITestService;
import com.sathya.service.impl.TestServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
		ITestService  service = ctx.getBean("testServiceImpl", TestServiceImpl.class);
		System.out.println("Bonus of empid 7788  :" +service.getBonus(7788));
		System.out.println("Bonus of empid 7979  :" +service.getBonus(7979));
		

	}

}
