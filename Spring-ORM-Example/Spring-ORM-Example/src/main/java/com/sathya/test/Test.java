package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sathya.entity.Customer;
import com.sathya.service.ICustomerService;
import com.sathya.service.impl.CustomerServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICustomerService service=ctx.getBean("customerServiceImpl", CustomerServiceImpl.class);
		//calling  saveCustomer operation
		/*Customer  customer=new  Customer();
		customer.setCustomerId(110111);
		customer.setCustomerName("PRAJAY");
		customer.setPhoneNumber(9007006881L);
		service.saveCustomer(customer);*/
		
		//calling  updateCustomer operation
		/*Customer  customer=new Customer();
		customer.setCustomerId(110111);
		customer.setCustomerName("PRAJAY");
		customer.setPhoneNumber(8309071073L);
		service.updateCustomer(customer);*/
		
		//calling  loadCustomer  operation
		/*Customer  c = service.loadCustomer(110111);
		System.out.println("customer id : "+c.getCustomerId());
		System.out.println("customer name : "+c.getCustomerName());
		System.out.println("phone no :"+c.getPhoneNumber());*/
		
		//calling  deleteCustomer  operation
		service.deleteCustomer(110111);
		
	
	}
}






