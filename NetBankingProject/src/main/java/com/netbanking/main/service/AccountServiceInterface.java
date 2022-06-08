package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.Account;

public interface AccountServiceInterface {
	public Account addNewAccount(Account account);
	
	public boolean updateAccount(Account account);

	public boolean deleteAccountByAccountId(String accountId);

	public Account getAccountByAccountId(String accountId);

	public List<Account> getAllAccount();
}
