package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.repository.AccountRepositoryInterface;

@Service
public class AccountService implements AccountServiceInterface {
	
	@Autowired
	private AccountRepositoryInterface accountRpository;

	@Override
	public Account addNewAccount(Account account) {
		System.out.println("in account service");
		return accountRpository.addNewAccount(account);
	}

	@Override
	public boolean updateAccount(Account account) {
		return accountRpository.updateAccount(account);
	}

	@Override
	public boolean deleteAccountByAccountId(String accountId) {
		return accountRpository.deleteAccountByAccountId(accountId);
	}

	@Override
	public Account getAccountByAccountId(String accountId) {
		return accountRpository.getAccountByAccountId(accountId);
	}

	@Override
	public List<Account> getAllAccount() {
		return accountRpository.getAllAccount();
	}

}
