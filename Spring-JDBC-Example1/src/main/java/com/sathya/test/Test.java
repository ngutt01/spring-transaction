package com.sathya.test;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.service.IEmpService;
import com.sathya.service.impl.EmpServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		IEmpService  service = ctx.getBean("empServiceImpl", EmpServiceImpl.class);
		Map  map = service.readEmpById(7788);
		System.out.println(map);
		
		System.out.println("======================");
		List  empList=service.readAllEmps();
		System.out.println(empList);
		
		System.out.println("======================");
		int i = service.updateEmpById(7989, 75999);
		System.out.println(i+" row updated");
	}
}


