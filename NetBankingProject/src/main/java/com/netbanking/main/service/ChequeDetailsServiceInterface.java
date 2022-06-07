package com.netbanking.main.service;

import java.util.List;

import com.netbanking.main.pojo.ChequeDetails;

public interface ChequeDetailsServiceInterface {

	public boolean addNewCheque(ChequeDetails chequeDetails);

	public boolean updateCheque( ChequeDetails chequeDetails);

	public boolean deleteChequeById(String accountId);

	public ChequeDetails getChequeById(String chequeNumber);	

	public List<ChequeDetails> getAllCheque();	
}
