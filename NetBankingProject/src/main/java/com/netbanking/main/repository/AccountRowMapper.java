package com.netbanking.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.Customer;

@Repository
@Scope(scopeName = "prototype")
public class AccountRowMapper implements RowMapper<Account> {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Account mapRow(ResultSet resultSet, int i) throws SQLException {
		String accountId = resultSet.getString("ACCOUNT_ID");
		String accountType = resultSet.getString("ACCOUNT_TYPE");
		LocalDate openDate = (resultSet.getDate("OPEN_DATE").toLocalDate());
		double minimumBalance = resultSet.getDouble("MINIMUM_BALANCE");
		double currentBalance = resultSet.getDouble("CURRENT_BALANCE");
		double rateOfInterest = resultSet.getDouble("RATE_OF_INTEREST");
		String customerId = resultSet.getString("CUSTOMER_ID");
		Customer customer = null;
		if (customerId != null) {
			customer = customerRepository.getCustomerByCustomerId(customerId);
		}
		// Customer customer = (Customer) resultSet.getObject("customer");

		Account account = new Account(accountId, accountType, openDate, minimumBalance, currentBalance, rateOfInterest,
				customer);
		return account;
	}

}
