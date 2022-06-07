package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.FixedDepositeMaster;

public interface FixedDepositeMasterRepositoryInterface {

	public boolean addNewDepositeMaster(FixedDepositeMaster depositeMaster);

	public boolean updateDepositeMaster(FixedDepositeMaster depositeMaster);

	public boolean deleteFixedDepositeMasterByfixedDepositeId(String fixedDepositeId);

	public FixedDepositeMaster getFixedDepositeMasterByFixedDepositeId(String fixedDepositeId);

	public List<FixedDepositeMaster> getAllFixedDepositeMaster();

}
