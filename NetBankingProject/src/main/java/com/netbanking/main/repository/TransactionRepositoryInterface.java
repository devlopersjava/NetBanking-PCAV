
package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.Transaction;

public interface TransactionRepositoryInterface {

	
	public boolean addNewTransaction(Transaction transactionId);
	public Transaction getTransactionBytransactionId(String transactionID);	
	public List<Transaction> getAllTransaction();	
	public boolean deleteTransactionBytransactionId(String transactionId);
}