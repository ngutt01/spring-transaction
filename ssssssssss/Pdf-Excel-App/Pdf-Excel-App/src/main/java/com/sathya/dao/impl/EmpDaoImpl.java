package com.sathya.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.dao.IEmpDao;

@Repository
public class EmpDaoImpl implements IEmpDao {
	@Autowired
	private  JdbcTemplate  jdbcTemplate;

	public List<Map<String,Object>> getEmployees() {
		return  jdbcTemplate.queryForList("select * from  emp");
	}

}
