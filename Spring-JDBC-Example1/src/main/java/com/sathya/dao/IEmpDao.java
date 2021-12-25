package com.sathya.dao;

import java.util.List;
import java.util.Map;

public interface IEmpDao {
	Map  findEmpById(int  empno);
	List findAllEmps();
	int  updateEmpById(int empno, int salary);
}
