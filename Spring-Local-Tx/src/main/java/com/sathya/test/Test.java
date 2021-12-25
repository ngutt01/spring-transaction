package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.dao.IExampleDao;
import com.sathya.dao.impl.ExampleDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		IExampleDao  dao=(IExampleDao)ctx.getBean("exampleDaoImpl");
		dao.doInTransaction();
		System.out.println("Transaction is done");
	}

}
