package com.sathya.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.dao.IGlobalDao;
import com.sathya.exception.LowBalanceException;
@Repository
public class GlobalDaoImpl implements IGlobalDao {
	@Autowired
	@Qualifier("jt1")
	private  JdbcTemplate  jdbcTemplate1;
	
	@Autowired
	@Qualifier("jt2")
	private  JdbcTemplate  jdbcTemplate2;
	
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,timeout=20)
	public void transferMoney(long sourceAcc, long destAcc, double amount) {
		double source_bal=jdbcTemplate1.queryForObject("select  balance  from  icici_accounts  where  acc_no=?", Double.class,sourceAcc);
		double dest_bal=jdbcTemplate2.queryForObject("select  balance  from  hdfc_accounts  where  acc_no=?", Double.class,destAcc);
		
		double source_bal_new=source_bal - amount;
		double dest_bal_new=dest_bal + amount;
		
		if(source_bal_new < 1000) {
			throw  new  LowBalanceException();
		}
		else {
			jdbcTemplate1.update("update  icici_accounts  set  balance=? where acc_no=?",source_bal_new,sourceAcc);
			try {
				Thread.sleep(15000);
			}catch(Exception e) { }
			jdbcTemplate2.update("update  hdfc_accounts  set  balance=? where acc_no=?",dest_bal_new,destAcc);
		}
	}

}
