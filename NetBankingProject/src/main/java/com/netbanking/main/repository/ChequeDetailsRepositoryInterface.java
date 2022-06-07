

package com.netbanking.main.repository;

import java.util.List;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.ChequeDetails;


public interface ChequeDetailsRepositoryInterface {

	
	public boolean addNewCheque(ChequeDetails chequeDetails);

	public boolean updateCheque( ChequeDetails chequeDetails);

	public boolean deleteChequeById(String chequeNumber);

	public ChequeDetails getChequeById(String chequeNumber);	

	public List<ChequeDetails> getAllCheque();	
}
