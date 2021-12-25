package com.sathya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.dao.ICustomerDao;
import com.sathya.entity.Customer;
import com.sathya.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private   ICustomerDao  dao;
	
	public void saveCustomer(Customer customer) {
		dao.saveEntity(customer);

	}

	public void updateCustomer(Customer customer) {
		dao.updateEntity(customer);

	}

	public void deleteCustomer(Integer customerId) {
		dao.deleteEntity(customerId);

	}

	public Customer loadCustomer(Integer customerId) {
		return  dao.loadEntity(customerId);
	}

}
