package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.FixedDepositeMaster;
@Repository
public class FixedDepositeMasterRepository implements FixedDepositeMasterRepositoryInterface {
	 
	private int resultCount;
	 @Autowired
     private JdbcTemplate jdbcTemplate;
	 
	 @Autowired
	 private FixedDepositeMasterRowMapper fixedDepositeMasterRowMapper;
     
     private static final String INSERT_FIXEDDEPOSITEMASTER ="INSERT INTO FIXED_DEPOSITE_MASTER(FIXED_DEPOSITE_ID,DURATION,RATE_OF_INTEREST) VALUES(?,?,?)";
     private static final String SELECT_ALL_FIXEDDEPOSITEMASTER ="SELECT * FROM FIXED_DEPOSITE_MASTER";
     private static final String UPDATE_FIXEDDEPOSITEMASTER="UPDATE FIXED_DEPOSITE_MASTER SET DURATION= ?, RATE_OF_INTEREST =? WHERE FIXED_DEPOSITE_ID = ? ";
     private static final String DELETE_FIXEDDEPOSITEMASTER="DELETE FIXED_DEPOSITE_MASTER WHERE FIXED_DEPOSITE_ID = ?";
     private static final String SELECT_SINGLE_FIXEDDEPOSITEMASTER="SELECT * FROM FIXED_DEPOSITE_MASTER WHERE FIXED_DEPOSITE_ID= ?";
	@Override
	public boolean addNewDepositeMaster(FixedDepositeMaster depositeMaster) {
		System.out.println("into repositary addNewFixedDepositeMaster");
		System.out.println(depositeMaster);
		Object [] args = {depositeMaster.getFixedDepositeId(),depositeMaster.getDuration(),depositeMaster.getFixedDepositeRateOfInterest()};
		
		resultCount = jdbcTemplate.update(INSERT_FIXEDDEPOSITEMASTER, args);
		
		if(resultCount > 0) {
			return true;	
		}
		
		return false;
	}

	
	@Override
	public boolean updateDepositeMaster(FixedDepositeMaster depositeMaster) {
		System.out.println("into repositary addNewFixedDepositeMaster");
		System.out.println(depositeMaster);
		Object [] args = {depositeMaster.getFixedDepositeId(),depositeMaster.getDuration(),depositeMaster.getFixedDepositeRateOfInterest()};
		resultCount = jdbcTemplate.update(UPDATE_FIXEDDEPOSITEMASTER, args);
		
		if(resultCount > 0) {
			return true;
		}
		
		return false;
	}

	
	@Override
	public boolean deleteFixedDepositeMasterByfixedDepositeId(String fixedDepositeId) {
		System.out.println("into repositary deleteFixedDepositeMasterByfixedDepositeId");
		System.out.println(fixedDepositeId);
		Object [] args = {fixedDepositeId};
		resultCount = jdbcTemplate.update(DELETE_FIXEDDEPOSITEMASTER, args);
		
		if(resultCount > 0) {
			return true;
		}
		return false;
	}
	

	@Override
	public FixedDepositeMaster getFixedDepositeMasterByFixedDepositeId(String fixedDepositeId) {
		System.out.println("into repositary deleteFixedDepositeMasterByfixedDepositeId");
		System.out.println(fixedDepositeId);
		Object [] args = {fixedDepositeId};
		FixedDepositeMaster depositeMaster = jdbcTemplate.queryForObject(SELECT_SINGLE_FIXEDDEPOSITEMASTER,args, fixedDepositeMasterRowMapper);
		return depositeMaster;
	}
	
	@Override
	public List<FixedDepositeMaster> getAllFixedDepositeMaster() {
		
		List<FixedDepositeMaster> allFixeddeposite = jdbcTemplate.query(SELECT_ALL_FIXEDDEPOSITEMASTER, fixedDepositeMasterRowMapper);
		
		return allFixeddeposite;
	}

}

