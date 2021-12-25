package com.sathya.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dao.ITestDao;
import com.sathya.service.ITestService;
@Service
public class TestServiceImpl implements ITestService {
	@Autowired
	private  ITestDao dao;

	public BigDecimal getBonus(int empid) {
		
		return dao.executeFunction(empid);
	}

}
