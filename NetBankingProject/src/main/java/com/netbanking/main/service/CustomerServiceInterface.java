package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.repository.CustomerRepositoryInterface;

public interface CustomerServiceInterface {
	
	public boolean addNewCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomerByCustomerId(String customerId);

	public Customer getCustomerByCustomerId(String customerId);

	public List<Customer> getAllCustomer();

}
