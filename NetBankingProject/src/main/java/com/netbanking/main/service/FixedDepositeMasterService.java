package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.FixedDepositeMaster;
import com.netbanking.main.repository.FixedDepositeMasterRepositoryInterface;
@Service
public class FixedDepositeMasterService implements FixedDepositeMasterServiceInterface {
	@Autowired
	private FixedDepositeMasterRepositoryInterface depositeMasterRepositoryInterface;
	

	@Override
	public boolean addNewDepositeMaster(FixedDepositeMaster depositeMaster) {
		return depositeMasterRepositoryInterface.addNewDepositeMaster(depositeMaster);
	}

	@Override
	public boolean updateDepositeMaster(FixedDepositeMaster depositeMaster) {
		return depositeMasterRepositoryInterface.updateDepositeMaster(depositeMaster);
	}

	@Override
	public boolean deleteFixedDepositeMasterByfixedDepositeId(String fixedDepositeId) {
		return depositeMasterRepositoryInterface.deleteFixedDepositeMasterByfixedDepositeId(fixedDepositeId);
	}

	@Override
	public FixedDepositeMaster getFixedDepositeMasterByfixedDepositeId(String fixedDepositeId) {
		return depositeMasterRepositoryInterface.getFixedDepositeMasterByFixedDepositeId(fixedDepositeId);
	}

	@Override
	public List<FixedDepositeMaster> getAllFixedDepositeMaster() {
		return depositeMasterRepositoryInterface.getAllFixedDepositeMaster();
	}

}

