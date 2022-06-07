package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.Transaction;

public interface TransactionServiceInterface {

	public boolean addNewTransaction(Transaction transactionId);

	public Transaction getTransactionBytransactionId(String transactionId);

	public List<Transaction> getAllTransaction();

	public boolean deleteTransactionBytransactionId(String transactionId);
}
