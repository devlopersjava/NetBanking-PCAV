
	package com.netbanking.main.controller;


	import java.util.List;

import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.FixedDepositeMaster;
	import com.netbanking.main.service.FixedDepositeMasterService;
	@RestController
	@CrossOrigin(origins="*")
	@RequestMapping("/masters")
	public class FixedDepositeController {
		@Autowired
		private FixedDepositeMasterService depositeMasterService;
		
//		@RequestMapping(value ="master", method = RequestMethod.POST)
//		public boolean addNewDepositeMaster(FixedDepositeMaster depositeMaster) {
//			System.out.println("Obejct Created");
//			System.out.println(depositeMaster);
//			return depositeMasterService.addNewDepositeMaster(depositeMaster);
//		}
//		
//		@RequestMapping(value ="master", method = RequestMethod.PUT)
//		public boolean updateDepositeMaster(FixedDepositeMaster depositeMaster) {
//			return depositeMasterService.updateDepositeMaster(depositeMaster);
//		}
//		@RequestMapping(value ="master", method = RequestMethod.DELETE)
//		public boolean deleteFixedDepositeMasterBy fixedDepositeId(int  fixedDepositeId) {
//			return depositeMasterService.deleteFixedDepositeMasterBy fixedDepositeId( fixedDepositeId);
//			
//		}
		
		@RequestMapping(value ="master/{fixedDepositeId}", method = RequestMethod.GET)
		public FixedDepositeMaster getFixedDepositeMasterByFixedDepositeId(@PathVariable String fixedDepositeId) {
			return depositeMasterService.getFixedDepositeMasterByfixedDepositeId(fixedDepositeId);
		}
		@RequestMapping(value ="master", method = RequestMethod.GET)
		public List<FixedDepositeMaster> getAllFixedDepositeMaster(){
			return depositeMasterService.getAllFixedDepositeMaster();
		}
		

	}

