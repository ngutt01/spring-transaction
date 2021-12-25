package com.sathya.service;

import java.util.List;
import java.util.Set;

import com.sathya.model.Employee;

public interface IEmpService {
	List<Employee>    readEmpsList();
	Set<Employee>     readEmpsSet();

}
