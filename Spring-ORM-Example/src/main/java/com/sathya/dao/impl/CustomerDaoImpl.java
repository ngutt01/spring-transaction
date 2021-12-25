package com.sathya.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sathya.dao.ICustomerDao;
import com.sathya.entity.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {
	@Autowired
	private  HibernateTemplate  hibernateTemplate;

	@Transactional
	public void saveEntity(Customer customer) {
		hibernateTemplate.save(customer);

	}
	
	@Transactional
	public void updateEntity(Customer customer) {
		hibernateTemplate.update(customer);

	}

	@Transactional
	public void deleteEntity(Integer customerId) {
		Customer  customer=new Customer();
		customer.setCustomerId(customerId);
		hibernateTemplate.delete(customer);
	}

	public Customer loadEntity(Integer customerId) {
		Customer  customer=hibernateTemplate.get(Customer.class, customerId);
		return  customer;
	}

}







