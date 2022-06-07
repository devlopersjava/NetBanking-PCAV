package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.Transaction;

@Repository
public class TransactionRepository implements TransactionRepositoryInterface {
	
	private int resultset;

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private TransactionRowMapper transactionRowMapper;

	
	private static final String ADD_NEW_TRANSACTION = "INSERT INTO TRANSACTION(TRANSACTION_ID,TRANSACTION_DATE,TRANSACTION_TYPE,FROM_ACCOUNT_ID, TO_ACCOUNT_ID,TRANSACTION_AMOUNT,ACCOUNT_ID) values(?,?,?,?,?,?,?,?)";
	private static final String GET_ALL_TRANSACTION = "SELECT * FROM TRANSACTION";
	private static final String GET_ONE_BANK_TRANSACTION = "SELECT * FROM TRANSACTION WHERE TRANSACTION_ID=?";
	private static final String DELETE_BANK_TRANSACTION = "DELETE TRANSACTION WHERE TRANSACTION_ID=?";

	@Override
	public boolean addNewTransaction(Transaction transactionId) {
		Object[] args = { transactionId.getTransactionId(), transactionId.getTransactionDate(),
				transactionId.getTransactionType(), transactionId.getFromAccountId(), transactionId.getToAccountId(),
				transactionId.getTransactionAmount(),
				transactionId.getAccount() };

		resultset = jdbcTemplate.update(ADD_NEW_TRANSACTION, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Transaction> getAllTransaction() {
		List<Transaction> allTransaction = jdbcTemplate.query(GET_ALL_TRANSACTION, transactionRowMapper); 
		
		return allTransaction;
	}

	@Override
	public boolean deleteTransactionBytransactionId(String transactionId) {
		Object[] args = { transactionId };

		resultset = jdbcTemplate.update(DELETE_BANK_TRANSACTION, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public Transaction getTransactionBytransactionId(String transactionId) {
		Object[] args= {transactionId};
		Transaction transaction= jdbcTemplate.queryForObject(GET_ONE_BANK_TRANSACTION,transactionRowMapper
		, args);
		
		return transaction; 

	}

}