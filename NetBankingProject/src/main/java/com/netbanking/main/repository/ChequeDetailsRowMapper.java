package com.netbanking.main.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.ChequeDetails;

@Repository
public class ChequeDetailsRowMapper implements RowMapper<ChequeDetails> {

	public ChequeDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		String chequeNumber = resultSet.getString("CHEQUE_NUMBER");
		String toPay = resultSet.getString("TO_PAY");
		double chequeAmount = resultSet.getDouble("CHEQUE_AMOUNT");

		LocalDate chequeDate = resultSet.getDate("CHEQUE_DATE").toLocalDate();
		String chequeStatus=resultSet.getNString("CHEQUE_STATUS");
		
		ChequeDetails chequeDetails=new ChequeDetails(chequeNumber, toPay, chequeAmount, chequeDate, chequeStatus);
		return chequeDetails;
	}

}
