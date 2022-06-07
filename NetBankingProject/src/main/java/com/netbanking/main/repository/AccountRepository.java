package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;

@Repository
public class AccountRepository implements AccountRepositoryInterface{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private int resultCount;
	
	@Autowired
	private AccountRowMapper accountRowMapper;

	private static final String INSERT_ACCOUNT = "INSERT INTO ACCOUNT (ACCOUNT_TYPE,OPEN_DATE,MINIMUM_BALANCE,CURRENT_BALANCE,RATE_OF_INTEREST,CUSTOMER) VALUES(?,?,?,?,?,?)";
	private static final String SELECT_ALL_ACCOUNT= "SELECT * FROM ACCOUNT";
	private static final String SELECT_SINGLE_ACCOUNT="SELECT * FROM ACCOUNT WHERE ACCOUNT_ID=?";
	private static final String UPDATE_ACCOUNT ="UPDATE ACCOUNT SET ACCOUNT_TYPE=?, OPEN_DATE=?, MINIMUM_BALANCE=?,CURRENT_BALANCE=?,RATE_OF_INTEREST=?,CUSTOMER=?";
	private static final String DELETE_ACCOUNT ="DELETE ACCOUNT WHERE ACCOUNT_ID=?";
	
	
	@Override
	public boolean addNewAccount(Account account) {
		System.out.println("into repository addNewAccount");
		System.out.println(account);
		
		Object[] args= {account.getAccountType(),account.getOpenDate(),account.getMinimumBalance(),account.getCurrentBalance(),account.getRateOfInterest(),account.getCustomer()};
		resultCount=jdbcTemplate.update(INSERT_ACCOUNT, args);
		
		if (resultCount > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateAccount(Account account) {
		System.out.println("into repository updateAccount");
		System.out.println(account);
		
		Object[] args= {account.getAccountType(),account.getOpenDate(),account.getMinimumBalance(),account.getCurrentBalance(),account.getRateOfInterest(),account.getCustomer(),account.getAccountId()};
		resultCount= jdbcTemplate.update(UPDATE_ACCOUNT, args);
		
		if (resultCount > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteAccountByAccountId(String accountId) {
		System.out.println("into repository deleteAccountByAccountId");
		System.out.println(accountId);
		
		Object[] args= {accountId};
		resultCount=jdbcTemplate.update(DELETE_ACCOUNT, args);
		
		if (resultCount > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Account getAccountByAccountId(String accountId) {
		System.out.println("into repository getAccountByAccountId");
		System.out.println(accountId);
		
		Object[] args= {accountId};
		Account account= jdbcTemplate.queryForObject(SELECT_SINGLE_ACCOUNT, accountRowMapper, args);
		
		return account;
	}

	@Override
	public List<Account> getAllAccount() {
		List<Account> accounts=jdbcTemplate.query(SELECT_ALL_ACCOUNT, accountRowMapper);
		return accounts;
	}

}
