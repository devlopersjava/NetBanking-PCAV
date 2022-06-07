package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.repository.BankSlipRepositoryInterface;

@Service
public class BankSlipService  implements BankSlipServiceInterface{

	@Autowired
	BankSlipRepositoryInterface bankSlipRepositoryInterface; 
	
	@Override
	public boolean addNewBankSlip(BankSlip bankSlip) {
		return bankSlipRepositoryInterface.addNewBankSlip(bankSlip) ;
	}

	@Override
	public boolean updateBankSlip(BankSlip bankSlip) {
		return bankSlipRepositoryInterface.updateBankSlip(bankSlip);
		
	}

	@Override
	public boolean deleteBankSlipByAccountId(String accountId) {
		return bankSlipRepositoryInterface.deleteBankSlipByAccountId(accountId);
	}

	@Override
	public List<BankSlip> getAllBankSlip() {
		return bankSlipRepositoryInterface.getAllBankSlip();
	}

	@Override
	public BankSlip getBankSlipByAccountId(String bankSlipId) {
		return bankSlipRepositoryInterface.getBankSlipByAccountId(bankSlipId);
	}

}
