package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.FixedDepositeMaster;


@Repository
public class FixedDepositeMasterRowMapper implements RowMapper<FixedDepositeMaster> {

	@Override
	public FixedDepositeMaster mapRow(ResultSet rs, int i) throws SQLException {
		String fixedDepositeId = rs.getString("FIXED_DEPOSITE_ID");
		int duration = rs.getInt("DURATION");
		double fixedDepositeRateOfInterest = rs.getDouble("RATE_OF_INTEREST");

		FixedDepositeMaster fixedDepositeMaster=new FixedDepositeMaster(fixedDepositeId, duration, fixedDepositeRateOfInterest);
		return fixedDepositeMaster;
	}

}
