package com.sathya.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.dao.IExampleDao;
@Repository
public class ExampleDaoImpl implements IExampleDao {
	@Autowired
	private  JdbcTemplate  jdbcTemplate;

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,timeout=10)
	public void doInTransaction() {
		jdbcTemplate.update("insert into dept values(40,'REVENUE', 'HYDERABAD')");
		jdbcTemplate.update("update emp set sal=29000 where empno=7979");
		try {
			Thread.sleep(5000);
		}catch(Exception  e) { }
		
		jdbcTemplate.update("delete  from  address  where  addrid=101");
	}

}
