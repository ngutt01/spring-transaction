package com.sathya.dao.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.sathya.dao.ITestDao;
@Repository
public class TestDaoImpl implements ITestDao {
	@Autowired	
	private  SimpleJdbcCall   sjc;

	public BigDecimal executeFunction(int empid) {
		sjc.withFunctionName("emp_bonus");
		Map<String,Integer>  inMap = new  HashMap<String,Integer>();
		inMap.put("eid", empid);
		Map outMap=sjc.execute(inMap);
		BigDecimal bd=(BigDecimal)outMap.get("return");
		return bd;
	}

}
