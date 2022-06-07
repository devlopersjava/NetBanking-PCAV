package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Account;
import com.netbanking.main.pojo.ChequeDetails;
import com.netbanking.main.service.ChequeDetailsServiceInterface;

@RestController
@CrossOrigin("*")
@RequestMapping("chequedetails")
public class ChequeDetailsController {
	@Autowired
	private ChequeDetailsServiceInterface chequeDetailsService;
	
	@RequestMapping(value="chequedetail/{chequeNumber}",method = RequestMethod.GET)
	public ChequeDetails getAccountByAccountId(@PathVariable String chequeNumber) {
		return chequeDetailsService.getChequeById(chequeNumber);	
	}
	
	@RequestMapping(value="chequedetail",method = RequestMethod.GET)
	public List<ChequeDetails> getAllAccount(){
		return chequeDetailsService.getAllCheque();
}
}
