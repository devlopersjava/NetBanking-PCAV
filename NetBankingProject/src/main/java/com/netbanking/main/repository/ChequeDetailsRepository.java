package com.netbanking.main.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.ChequeDetails;

@Repository
public class ChequeDetailsRepository implements ChequeDetailsRepositoryInterface {

	private int resultset;
	
	@Autowired
	private ChequeDetailsRowMapper chequeDetailsRowMapper;

	@Autowired
	JdbcTemplate jdbcTemplate;
	private static final String ADD_CHEQUE = "INSERT INTO CHEQUE_DETAILS(CHEQUE_NUMBER,TO_PAY,CHEQUE_AMOUNT,CHEQUE_DATE,CHEQUE_STATUS) values(?,?,?,?,?)";
	private static final String UPDATE_CHEQUE = "UPDATE CHEQUE_DETAILS SET  CHEQUE_NUMBER=?,TO_PAY=?,CHEQUE_AMOUNT=?,CHEQUE_DATE=?  WHERE ACCOUNT_ID=? ";
	private static final String DELETE_CHEQUE_BY_ID = "DELETE CHEQUE_DETAILS WHERE CHEQUE_NUMBER=?";
	private static final String GET_ALL_CHEQUE = "SELECT * FROM CHEQUE_DETAILS";
	private static final String CET_CHEQUE_BY_ID = "SELECT * FROM CHEQUE_DETAILS WHERE CHEQUE_NUMBER=?";

	@Override
	public boolean addNewCheque(ChequeDetails chequeDetails) {
		Object[] args = { chequeDetails.getChequeNumber(), chequeDetails.getToPay(), chequeDetails.getChequeAmount(),
				chequeDetails.getChequeDate() };

		resultset = jdbcTemplate.update(ADD_CHEQUE, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateCheque(ChequeDetails chequeDetails) {
		Object[] args = { chequeDetails.getChequeNumber(), chequeDetails.getToPay(), chequeDetails.getChequeAmount(),
				chequeDetails.getChequeDate() };

		resultset = jdbcTemplate.update(UPDATE_CHEQUE, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteChequeById(String accountId) {
		Object[] args = { accountId };

		resultset = jdbcTemplate.update(DELETE_CHEQUE_BY_ID, args);
		if (resultset > 0)
			return true;
		else
			return false;
	}

	@Override
	public ChequeDetails getChequeById(String chequeNumber) {
		Object[] args = { chequeNumber};
		ChequeDetails chequeDetails = jdbcTemplate.queryForObject(CET_CHEQUE_BY_ID, chequeDetailsRowMapper, args);
		return chequeDetails;

	}

	@Override
	public List<ChequeDetails> getAllCheque() {
		List<ChequeDetails> chequeDetails=jdbcTemplate.query(GET_ALL_CHEQUE,chequeDetailsRowMapper);
		return chequeDetails;
	}

}