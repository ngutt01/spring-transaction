package com.sathya.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.callbacks.EmployeeExtractor;
import com.sathya.callbacks.EmployeeMapper;
import com.sathya.dao.IEmpDao;
import com.sathya.model.Employee;
@Repository
public class EmpDaoImpl implements IEmpDao {
	@Autowired
	private  JdbcTemplate   jdbcTemplate;

	public List<Employee> getEmpsList() {
		return  jdbcTemplate.query("select  *  from  emp", new  EmployeeMapper());
	}

	public Set<Employee> getEmpsSet() {
		return  jdbcTemplate.query("select  *  from  emp", new  EmployeeExtractor());
	}

}
