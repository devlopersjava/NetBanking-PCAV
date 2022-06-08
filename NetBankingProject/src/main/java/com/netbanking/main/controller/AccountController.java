package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.service.AccountServiceInterface;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("accounts")
public class AccountController {
	
	@Autowired
	private AccountServiceInterface accountService;
	
	@RequestMapping(value="account", method = RequestMethod.POST)
	public boolean addNewAccount(@RequestBody Account account) {
		System.out.println("object received");
		System.out.println(account);
		return accountService.addNewAccount(account);
	}
//	
//	@RequestMapping(value="account",method = RequestMethod.PUT)
//	public boolean updateAccount(Account account) {
//		return accountService.updateAccount(account);
//	} 
//	
//	@RequestMapping(value="account/{accountId}",method = RequestMethod.DELETE)
//	public boolean deleteAccountByAccountId(String accountId) {
//		return accountService.deleteAccountByAccountId(accountId);
//	}
	
	@RequestMapping(value="account/{accountId}",method = RequestMethod.GET)
	public Account getAccountByAccountId(@PathVariable String accountId) {
		return accountService.getAccountByAccountId(accountId);	
	}
	
	@RequestMapping(value="account",method = RequestMethod.GET)
	public List<Account> getAllAccount(){
		return accountService.getAllAccount();
		
	}
}
