package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Customer;
import com.netbanking.main.pojo.Login;

@Repository
@Scope("prototype")
public class CustomerRowMapper implements RowMapper<Customer> {

	@Autowired
	LoginRepository loginRepository;

	public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
		String customerId = resultSet.getString("CUSTOMER_ID");
		String firstName = resultSet.getString("FIRST_NAME");
		String lastName = resultSet.getString("LAST_NAME");
		String address = resultSet.getString("ADDRESS");
		String city = resultSet.getString("CITY");
		String state = resultSet.getString("STATE");
		int zip = resultSet.getInt("ZIP");
		int phoneNumber = resultSet.getInt("PHONE_NUMBER");
		int telePhoneNumber = resultSet.getInt("TELE_PHONE_NUMBER");
		String emailID = resultSet.getString("EMAIL_ID");
		String status = resultSet.getString("STATUS");
		String userId=resultSet.getString("LOGIN_ID");
		
		Login login = loginRepository.getOneUserByUserId(userId);
		Customer customer = new Customer(customerId, firstName, lastName, address, city, state, zip,phoneNumber, telePhoneNumber, emailID, status, login);
		return customer;
	}
}
