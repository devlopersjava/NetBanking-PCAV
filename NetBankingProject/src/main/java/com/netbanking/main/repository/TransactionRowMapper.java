 package com.netbanking.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.Transaction;

@Repository
public  class TransactionRowMapper implements RowMapper<Transaction> {

	@Autowired
   private  AccountRepository accountRepository;
	
	public Transaction mapRow(ResultSet resultSet, int i) throws SQLException {
		String transactionId = resultSet.getString("TRANSACTION_ID");
		LocalDate transactionDate = resultSet.getDate("TRANSACTION_DATE").toLocalDate();
		String transactionType = resultSet.getString("TRANSACTION_TYPE");
		String fromAccountId = resultSet.getString("FROM_ACCOUNT_ID");
		String toAccountId = resultSet.getString("TO_ACCOUNT_ID");
		double transactionAmount = resultSet.getDouble("TRANSACTION_AMOUNT");	
        String transactionStatus = resultSet.getString("TRANSACTION_STATUS");
        String accountId=resultSet.getString("ACCOUNT_ID");
      Account account=accountRepository.getAccountByAccountId(accountId);
        
        
	Transaction transaction=new Transaction(transactionId, transactionDate, transactionType, fromAccountId, toAccountId, transactionAmount, transactionStatus, account);
	return transaction;
	}
}
