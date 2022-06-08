package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.Account;

public interface AccountRepositoryInterface {

		public Account addNewAccount(Account account);
	
		public boolean updateAccount(Account account);
	
		public boolean deleteAccountByAccountId(String accountId);
	
		public Account getAccountByAccountId(String accountId);
	
		public List<Account> getAllAccount();

}
