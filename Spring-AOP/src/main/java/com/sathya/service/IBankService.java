package com.sathya.service;

public interface IBankService {
	void   deposit(long acno,double amount) throws Exception;
	void   withdraw(long acno,double amount);
}
