package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.BankSlip;

public interface BankSlipRepositoryInterface {
  
	public boolean addNewBankSlip(BankSlip bankSlip);

	public boolean updateBankSlip( BankSlip bankSlip);

	public boolean deleteBankSlipByAccountId(String bankSlipId);

	public BankSlip getBankSlipByAccountId(String bankSlipId);	

	public List<BankSlip> getAllBankSlip();	
	
	
	
}
