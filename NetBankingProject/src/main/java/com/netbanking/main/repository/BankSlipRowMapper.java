package com.netbanking.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.ChequeDetails;

@Repository
public class BankSlipRowMapper implements RowMapper<BankSlip> {

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	ChequeDetailsRepository chequeDetailsRepository;

	public BankSlip mapRow(ResultSet resultSet, int i) throws SQLException {
		String  bankSlipId = resultSet.getString("BANK_SLIP_ID");
	
		LocalDate chequeDate = resultSet.getDate("CHEQUE_DATE").toLocalDate();
		LocalDate slipDate = resultSet.getDate("SLIP_DATE").toLocalDate();
		String payersAccountNumber = resultSet.getString("PAYERS_ACCOUNT_NUMBER");
		String payerBank = resultSet.getString("PAYER_BANK");
		double bankSlipAmount = resultSet.getDouble("BANK_SLIP_AMOUNT");
		
		String accountId = resultSet.getString("ACCOUNT_ID");
		Account account = accountRepository.getAccountByAccountId(accountId);
		
		String chequeNumber=resultSet.getNString("CHEQUE_NUMBER");
        ChequeDetails chequeDetails=chequeDetailsRepository.getChequeById(chequeNumber);
		
		BankSlip bankSlip = new BankSlip(bankSlipId, chequeDate, slipDate, payersAccountNumber, payerBank, bankSlipAmount, account, chequeDetails);
		return bankSlip;
	}
}
