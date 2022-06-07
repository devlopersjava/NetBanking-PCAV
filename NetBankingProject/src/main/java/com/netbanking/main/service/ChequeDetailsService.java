package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.ChequeDetails;
import com.netbanking.main.repository.ChequeDetailsRepositoryInterface;

@Service
public class ChequeDetailsService implements ChequeDetailsServiceInterface {

	@Autowired
	private ChequeDetailsRepositoryInterface chequeDetailsRepository;
	
	@Override
	public boolean addNewCheque(ChequeDetails chequeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCheque(ChequeDetails chequeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteChequeById(String accountId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChequeDetails getChequeById(String chequeNumber) {
		// TODO Auto-generated method stub
		return chequeDetailsRepository.getChequeById(chequeNumber) ;
	}

	@Override
	public List<ChequeDetails> getAllCheque() {
		// TODO Auto-generated method stub
		return chequeDetailsRepository.getAllCheque();
	}

}
