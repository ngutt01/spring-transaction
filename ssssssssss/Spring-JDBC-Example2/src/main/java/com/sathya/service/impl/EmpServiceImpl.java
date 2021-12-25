package com.sathya.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dao.IEmpDao;
import com.sathya.model.Employee;
import com.sathya.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired 
	private  IEmpDao   dao;
	
	public List<Employee> readEmpsList() {
		return  dao.getEmpsList();
	}

	public Set<Employee> readEmpsSet() {
		return  dao.getEmpsSet();
	}

}
