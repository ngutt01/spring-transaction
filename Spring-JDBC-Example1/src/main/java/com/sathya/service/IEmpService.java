package com.sathya.service;

import java.util.List;
import java.util.Map;

public interface IEmpService {
	Map  readEmpById(int empno);
	List readAllEmps();
	int  updateEmpById(int empno,int salary);
}
