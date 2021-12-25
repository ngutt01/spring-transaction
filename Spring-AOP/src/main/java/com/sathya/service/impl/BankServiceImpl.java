package com.sathya.service.impl;

import org.springframework.stereotype.Service;

import com.sathya.service.IBankService;
@Service
public class BankServiceImpl implements IBankService {

	public void deposit(long acno, double amount) throws Exception {
		if(amount <= 0) {
			throw  new Exception();
		}
		System.out.println("Amount :"+amount+" deposited in acno :"+acno);

	}

	public void withdraw(long acno, double amount) {
		System.out.println("Amount :"+amount+" withdrawn from acno :"+acno);
	}

}
