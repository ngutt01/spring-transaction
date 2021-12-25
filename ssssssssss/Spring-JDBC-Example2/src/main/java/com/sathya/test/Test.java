package com.sathya.test;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sathya.config.ApplicationConfig;
import com.sathya.model.Employee;
import com.sathya.service.IEmpService;
import com.sathya.service.impl.EmpServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext  ctx=new  AnnotationConfigApplicationContext(ApplicationConfig.class);;
		IEmpService  service=ctx.getBean("empServiceImpl", EmpServiceImpl.class);
		List<Employee>  empList=service.readEmpsList();
		for(Employee   e:empList) {
			System.out.println(e.getEmpno()+", "+e.getEname()+", "+e.getSal()+", "+e.getDeptno());
		}
		System.out.println("====================");
		
		Set<Employee>  empSet = service.readEmpsSet();
		for(Employee   e:empSet) {
			System.out.println(e.getEmpno()+", "+e.getEname()+", "+e.getSal()+", "+e.getDeptno());
		}
		
	}

}
