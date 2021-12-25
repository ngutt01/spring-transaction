package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app2.Battery;
import com.spring.app2.Robot;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/spring/config/spring-config.xml");
	       //Robot robot=(Robot)ctx.getBean("rob");
		Object obj=ctx.getBean("rob");
		Robot robot=(Robot)obj;
	       System.out.println(robot);
	      
	             
	}

}