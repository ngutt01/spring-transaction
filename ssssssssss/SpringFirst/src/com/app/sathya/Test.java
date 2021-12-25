package com.app.sathya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Object obj=ctx.getBean("firstspring");
		FirstSpring fs=(FirstSpring)obj;
		System.out.println(fs);
		
		
	}

}
