package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathya.bean.EmployeeBean;
import com.sathya.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		
				ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
				EmployeeBean ebean=ctx.getBean("employeeBean",EmployeeBean.class);	
				System.out.println(ebean);


	}

}
