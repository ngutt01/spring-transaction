package com.sathya.service;

import com.sathya.entity.Customer;

public interface ICustomerService {
	void  saveCustomer(Customer customer);
	void  updateCustomer(Customer  customer);
	void  deleteCustomer(Integer customerId);
	Customer  loadCustomer(Integer customerId);

}
