package com.sathya.dao;

import com.sathya.entity.Customer;

public interface ICustomerDao {
	void  saveEntity(Customer   customer);
	void  updateEntity(Customer customer);
	void  deleteEntity(Integer customerId);
	Customer  loadEntity(Integer customerId);

}
