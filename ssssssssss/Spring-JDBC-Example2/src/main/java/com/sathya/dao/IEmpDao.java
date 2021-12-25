package com.sathya.dao;

import java.util.List;
import java.util.Set;

import com.sathya.model.Employee;

public interface IEmpDao {
	List<Employee>   getEmpsList();
	Set<Employee>    getEmpsSet();

}
