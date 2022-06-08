package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.BankSlip;

@Repository
public class BankSlipRepository implements BankSlipRepositoryInterface {

	private int resultCount;
	
	@Autowired
	private BankSlipRowMapper bankSlipRowMapper;

	@Autowired
	JdbcTemplate jdbcTemplate;
	private static final String ADD_NEW_BANK_SLIP = "INSERT INTO BANK_SLIP(BANK_SLIP_ID,CHEQUE_NUMBER,CHEQUE_DATE,SLIP_DATE,PAYERS_ACCOUNT_NUMBER,PAYER_BANK,BANK_SLIP_AMOUNT,BANK_SLIP_STATUS,ACOOUNT_ID) values(?,?,?,?,?,?,?,?,?)";
	private static final String UPDATE_BANK_SLIP = "UPDATE BANK_SLIP SET  CHEQUE_NUMBER=?,CHEQUE_DATE=?,SLIP_DATE=?, PAYERS_ACCOUNT_NUMBER=?,PAYER_BANK=?,BANK_SLIP_AMOUNT=?,BANK_SLIP_STATUS=?,ACCOUNT_ID=?  WHERE BANK_SLIP_ID=? ";
	private static final String DELETE_BANK_SLIP = "DELETE BANK_SLIP WHERE BANK_SLPI_ID=?";
	private static final String GET_ALL_BANK_SLIP = "SELECT * FROM BANK_SLIP";
	private static final String GET_ONE_BANK_SLIP = "SELECT * FROM BANK_SLIP WHERE BANK_SLIP_ID=?";

	@Override
	public boolean addNewBankSlip(BankSlip bankSlip) {

		Object[] args = { bankSlip.getBankSlipId(), bankSlip.getChequeDate(), bankSlip.getSlipDate(),
				bankSlip.getPayersAccountNumber(), bankSlip.getPayerBank(), bankSlip.getBankSlipAmount(),
			 bankSlip.getAccount() };

		resultCount = jdbcTemplate.update(ADD_NEW_BANK_SLIP, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateBankSlip(BankSlip bankSlip) {
		Object[] args = { bankSlip.getBankSlipId(), bankSlip.getChequeDate(), bankSlip.getSlipDate(),
				bankSlip.getPayersAccountNumber(), bankSlip.getPayerBank(), bankSlip.getBankSlipAmount()
				, bankSlip.getAccount() };

		resultCount = jdbcTemplate.update(UPDATE_BANK_SLIP, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteBankSlipByAccountId(String accountId) {
		Object[] args = { accountId };

		resultCount = jdbcTemplate.update(DELETE_BANK_SLIP, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<BankSlip> getAllBankSlip() {

		List<BankSlip> allBankSlip = jdbcTemplate.query(GET_ALL_BANK_SLIP, bankSlipRowMapper);
		return allBankSlip;

	}

	@Override
	public BankSlip getBankSlipByAccountId(String bankSlipId) {
		Object[] args = { bankSlipId };
		BankSlip bankSlip = jdbcTemplate.queryForObject(GET_ONE_BANK_SLIP, bankSlipRowMapper,args);
		return bankSlip;

	}
}
