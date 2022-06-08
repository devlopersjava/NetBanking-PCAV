package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Customer;

@Repository
public class CustomerRepository implements CustomerRepositoryInterface {

	private int resultCount;
	
	@Autowired
	private CustomerRowMapper customerRowMapper;

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_CUSTOMER = "INSERT INTO CUSTOMER(CUSTOMER_ID,FIRST_NAME,LAST_NAME,LOGIN_ID,ADDRESS,CITY,STATE,ZIP,PHONE_NUMBER,TELE_PHONE_NUMBER,EMAIL_ID,STATUS) VALUES('CUST0' || SEQ_CUSTOMER_ID.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?)";
	private static  String SELECT_ALL_CUSTOMER = "SELECT * FROM CUSTOMER";
	private static final String UPDATE_CUSTOMER = "UPDATE CUSTOMER SET  First_NAME=?,LAST_NAME =? ,ADDRESS=?,CITY=?,STATE=?,ZIP=?,PHONE_NUMBER=?,TELE_PHONE_NUMBER=?,EMAIL_ID=?,STATUS=?,LOGIN_ID=? WHERE CUSTOMER_ID  = ?";
			
			
	private static final String DELETE_CUSTOMER = "DELETE CUSTOMER WHERE CUSTOMER_ID = ?";
	private static final String SELECT_SINGLE_CUSROMER = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";

	@Override
	public boolean addNewCustomer(Customer customer) {
		System.out.println("into repository addNewCustumer");
		System.out.println(customer);
		Object[] args = {  customer.getFirstName(), customer.getLastName(),customer.getLogin().getUserId(),
				customer.getAddress(), customer.getCity(), customer.getState(), customer.getZip(),
				customer.getPhoneNumber(), customer.getTelePhoneNumber(), customer.getEmailID(), customer.getStatus(),
				 };
		System.out.println("end of repository addNewCustumer");

		resultCount = jdbcTemplate.update(INSERT_CUSTOMER, args);

		if (resultCount > 0)
			return true;
		else
			return false;

	}

//
//	@Override
//	public boolean updateCustomer(Customer customer) {
//		System.out.println("into repository addNewCustumer");
//		System.out.println(customer);
//		Object[] args = { customer.getCustomerId(), customer.getFirstName(), customer.getLastName(),
//				customer.getAddress(), customer.getCity(), customer.getState(), customer.getZip(),
//				customer.getPhoneNumber(), customer.getTelePhoneNumber(), customer.getEmailID(), customer.getStatus(),
//				customer.getLogin() };
//		resultCount = jdbcTemplate.update(UPDATE_CUSTOMER, args);
//		if (resultCount > 0)
//			return true;
//		else
//			return false;
//	}
//
//	@Override
//	public boolean deleteCustomerByCustomerId(int customerId) {
//		System.out.println("into repository addNewCustumer");
//		System.out.println(customerId);
//		Object[] args = { customerId };
//		resultCount = jdbcTemplate.update(DELETE_CUSTOMER, args);
//		if (resultCount > 0)
//			return true;
//		else
//			return false;
//
//	}

	

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> allCustomer = jdbcTemplate.query(SELECT_ALL_CUSTOMER, customerRowMapper);
		return allCustomer;

	}

	
	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomerByCustomerId(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomerByCustomerId(String customerId) {
		Object[] args = { customerId };
		Customer customer = jdbcTemplate.queryForObject(SELECT_SINGLE_CUSROMER, customerRowMapper,args);
		return customer;
		
	}

}
