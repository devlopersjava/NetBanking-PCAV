package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.Transaction;
import com.netbanking.main.service.TransactionServiceInterface;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("transactions")
public class TransactionController {

	@Autowired
	private TransactionServiceInterface transactionService;

//	@RequestMapping(value = "transaction", method = RequestMethod.POST)
//	public boolean addNewTransaction(@RequestBody Transaction transactionID) {
//		return transactionService.addNewTransaction(transactionID);
//	}

	@RequestMapping(value = "transaction/{transactionId}", method = RequestMethod.GET)
	public Transaction getTransactionByTransactionId(@PathVariable String transactionId) {
		return transactionService.getTransactionBytransactionId(transactionId);
	}

	@RequestMapping(value = "transaction", method = RequestMethod.GET)
	public List<Transaction> getAllTransaction() {

		return transactionService.getAllTransaction();

	}

//	@RequestMapping(value = "transaction", method = RequestMethod.GET)
//	public boolean deleteTransactionByTransactionId(int transactionID) {
//		
//		return transactionService.deleteTransactionByTransactionId(transactionID);
//	}

}
