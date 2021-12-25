package com.sathya.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class EmployeeBean {
	@Value("7788")
	private int empid;
	@Value("SCOTT")
	private String empname;
	@Autowired
	private DepartmentBean deptbean;
	
	public String toString() {
		return "Employee[empid="+empid+",empname="+empname+",department="+deptbean+"]";
	}
	
}
