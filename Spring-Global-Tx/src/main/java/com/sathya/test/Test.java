package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.dao.IGlobalDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		IGlobalDao  dao=(IGlobalDao)ctx.getBean("globalDaoImpl");
		try {
			dao.transferMoney(100901021, 219001015, 30000.0);
			System.out.println("Transaction success. Money transferred");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Transaction Failed.");
		}

	}

}
