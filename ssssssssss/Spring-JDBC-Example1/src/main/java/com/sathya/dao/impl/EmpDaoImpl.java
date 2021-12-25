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

	public Map findEmpById(int empno) {
		Map  map=jdbcTemplate.queryForMap("select  *  from  emp  where  empno=?", empno);
		return  map;
	}

	public List findAllEmps() {
		List  empList=jdbcTemplate.queryForList("select  *  from  emp");
		return  empList;
	}

	public int updateEmpById(int empno, int salary) {
		int  i = jdbcTemplate.update("update emp set sal=? where  empno=?",salary,empno);
		return i;
	}
}






