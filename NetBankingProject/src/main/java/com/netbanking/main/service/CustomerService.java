package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.repository.CustomerRepositoryInterface;

@Service
public class CustomerService implements CustomerServiceInterface {

	@Autowired
	private CustomerRepositoryInterface customerRepositoryInterface;

	@Override
	public Customer addNewCustomer(Customer customer) {
		System.out.println("in service add employee");
		return customerRepositoryInterface.addNewCustomer(customer);
		
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		return customerRepositoryInterface.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(String customerId) {
		return customerRepositoryInterface.deleteCustomerByCustomerId(customerId);
	}

	@Override
	public Customer getCustomerByCustomerId(String customerId) {
		return customerRepositoryInterface.getCustomerByCustomerId(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepositoryInterface.getAllCustomer();
	}

	

}
