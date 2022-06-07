package com.netbanking.main.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.service.BankSlipServiceInterface;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("bankslips")
public class BankSlipController {
		
		@Autowired
		private BankSlipServiceInterface bankSlipService;

		@RequestMapping(value = "bankslip", method = RequestMethod.POST)
		public boolean addNewBankSlip(BankSlip bankSlip) {
			return bankSlipService.addNewBankSlip(bankSlip);
			}
	  

		@RequestMapping(value="",method = RequestMethod.PUT)
		public boolean updateBankSlip(BankSlip bankSlip) {
			return bankSlipService.updateBankSlip(bankSlip);
		} 
		
		@RequestMapping(value="",method = RequestMethod.DELETE)
		public boolean deleteBankSlipByAccountId(String accountId) {
			return bankSlipService.deleteBankSlipByAccountId(accountId);
		}
		
		@RequestMapping(value="bankslip/{bankSlipId}",method = RequestMethod.GET)
		public BankSlip getBankSlipByAccountId(@PathVariable String bankSlipId) {
			return bankSlipService.getBankSlipByAccountId(bankSlipId);	
		}
		
		@RequestMapping(value="bankslip",method = RequestMethod.GET)
		public List<BankSlip> getallbankslip(){
			return bankSlipService.getAllBankSlip();
			
		}

}  
	
