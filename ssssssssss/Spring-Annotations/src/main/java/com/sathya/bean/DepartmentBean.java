package com.sathya.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DepartmentBean {
	
	@Value("${dno}")
	public int deptno;
	@Value("${dname}")
    public String deptname;
	@Value("{loc}")
    public String location;
	
	public String toString() {
		return "Department[deptno="+deptno+", dname="+deptname+",location="+location+"]";
	}
}
