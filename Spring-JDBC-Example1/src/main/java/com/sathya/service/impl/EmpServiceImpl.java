package com.sathya.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dao.IEmpDao;
import com.sathya.service.IEmpService;
@Service
public class EmpServiceImpl implements IEmpService {
	@Autowired
	private  IEmpDao  dao;

	public Map readEmpById(int empno) {
		return  dao.findEmpById(empno);
	}

	public List readAllEmps() {
		return dao.findAllEmps();
	}

	public int updateEmpById(int empno, int salary) {
		return  dao.updateEmpById(empno, salary);
	}
}
