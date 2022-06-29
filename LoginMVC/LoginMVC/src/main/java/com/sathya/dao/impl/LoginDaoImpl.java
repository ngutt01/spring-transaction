package com.sathya.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sathya.dao.ILoginDao;
@Repository
public class LoginDaoImpl implements ILoginDao {
	@Autowired
	private   JdbcTemplate   jdbcTemplate;

	public boolean verifyUserInDB(String username, String password) {
		int  count=jdbcTemplate.queryForObject("select  count(*)  from  Login_Tab  where  user_name=? and pass_word=?", Integer.class, username,password);
		if(count==1) {
			return  true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyUserInDBV1(String username, String password) {
		int  count=jdbcTemplate.queryForObject("select  count(*)  from  Login_Tab  where  user_name=? and pass_word=?", Integer.class, username,password);
		if(count==1) {
			return  true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyUserInDBV2(String username, String password) {
		int  count=jdbcTemplate.queryForObject("select  count(*)  from  Login_Tab  where  user_name=? and pass_word=?", Integer.class, username,password);
		if(count==1) {
			return  true;
		}
		else {
			return false;
		}
	}
	
	
}
