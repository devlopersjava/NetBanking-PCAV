package com.netbanking.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class BankSlip {
	
	private String bankSlipId;

	private LocalDate chequeDate;
	private LocalDate slipDate;
	private String payersAccountNumber;
	private String payerBank;
	private double bankSlipAmount;

	@Autowired
	private Account account;
	@Autowired
	private ChequeDetails chequeDetails;
	
	public BankSlip() {
		// TODO Auto-generated constructor stub
}

	public BankSlip(String bankSlipId, LocalDate chequeDate, LocalDate slipDate, String payersAccountNumber,
			String payerBank, double bankSlipAmount, Account account, ChequeDetails chequeDetails) {
		super();
		this.bankSlipId = bankSlipId;
		this.chequeDate = chequeDate;
		this.slipDate = slipDate;
		this.payersAccountNumber = payersAccountNumber;
		this.payerBank = payerBank;
		this.bankSlipAmount = bankSlipAmount;
		this.account = account;
		this.chequeDetails = chequeDetails;
	}

	public String getBankSlipId() {
		return bankSlipId;
	}

	public void setBankSlipId(String bankSlipId) {
		this.bankSlipId = bankSlipId;
	}

	public LocalDate getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(LocalDate chequeDate) {
		this.chequeDate = chequeDate;
	}

	public LocalDate getSlipDate() {
		return slipDate;
	}

	public void setSlipDate(LocalDate slipDate) {
		this.slipDate = slipDate;
	}

	public String getPayersAccountNumber() {
		return payersAccountNumber;
	}

	public void setPayersAccountNumber(String payersAccountNumber) {
		this.payersAccountNumber = payersAccountNumber;
	}

	public String getPayerBank() {
		return payerBank;
	}

	public void setPayerBank(String payerBank) {
		this.payerBank = payerBank;
	}

	public double getBankSlipAmount() {
		return bankSlipAmount;
	}

	public void setBankSlipAmount(double bankSlipAmount) {
		this.bankSlipAmount = bankSlipAmount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ChequeDetails getChequeDetails() {
		return chequeDetails;
	}

	public void setChequeDetails(ChequeDetails chequeDetails) {
		this.chequeDetails = chequeDetails;
	}

	@Override
	public String toString() {
		return "BankSlip [bankSlipId=" + bankSlipId + ", chequeDate=" + chequeDate + ", slipDate=" + slipDate
				+ ", payersAccountNumber=" + payersAccountNumber + ", payerBank=" + payerBank + ", bankSlipAmount="
				+ bankSlipAmount + ", account=" + account + ", chequeDetails=" + chequeDetails + "]";
	}

	
	
	
}


