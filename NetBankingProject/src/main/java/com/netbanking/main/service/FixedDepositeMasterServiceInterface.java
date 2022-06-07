package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.FixedDepositeMaster;

public interface FixedDepositeMasterServiceInterface {
	 
	public boolean addNewDepositeMaster(FixedDepositeMaster depositeMaster);
	
	public boolean updateDepositeMaster(FixedDepositeMaster depositeMaster);
	
	public boolean deleteFixedDepositeMasterByfixedDepositeId(String fixedDepositeId);
	
	public FixedDepositeMaster getFixedDepositeMasterByfixedDepositeId(String fixedDepositeId);
	
	public List<FixedDepositeMaster> getAllFixedDepositeMaster();
	
	

	

}

