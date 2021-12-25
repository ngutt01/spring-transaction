package com.sathya.dao;

public interface ILoginDao {
	boolean   verifyUserInDB(String username,String password);
}
