package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.Login;
import com.netbanking.main.pojo.Transaction;
import com.netbanking.main.repository.TransactionRepositoryInterface;

@Service
public class TransactionService implements TransactionServiceInterface {

	@Autowired
	private TransactionRepositoryInterface transactionRepository;

	public boolean addNewTransaction(Transaction transactionId) {
		return transactionRepository.addNewTransaction(transactionId);
	}

	public Transaction getTransactionBytransactionId(String transactionId) {
		return transactionRepository.getTransactionBytransactionId(transactionId);
	}

	public List<Transaction> getAllTransaction() {
		return transactionRepository.getAllTransaction();

	}

	public boolean deleteTransactionBytransactionId(String transactionId) {
		return transactionRepository.deleteTransactionBytransactionId(transactionId);
	}
	
	public Login validateUser(Login login) {
		
		return null;
	}

}
