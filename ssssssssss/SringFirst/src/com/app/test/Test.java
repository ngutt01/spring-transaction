package com.app.test;
import com.app.config.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.app.bean.WelcomeBean;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/app/config/spring-config.xml");
	//1
		WelcomeBean welcomeBean1=(WelcomeBean)ctx.getBean("wb");
		//2
		WelcomeBean welcomeBean=ctx.getBean("wb", WelcomeBean.class);
		welcomeBean.showMessage();
		welcomeBean1.showMessage();
	}

}