package com.netbanking.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class Transaction{
	
	private String transactionId;
	private LocalDate transactionDate;
	private String transactionType;
	private String fromAccountId;
	private String toAccountId;
	private double transactionAmount;
	private String transactionStatus;
	
	@Autowired
	private Account account;
	
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}


	public Transaction(String transactionId, LocalDate transactionDate, String transactionType, String fromAccountId,
			String toAccountId, double transactionAmount, String transactionStatus, Account account) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.fromAccountId = fromAccountId;
		this.toAccountId = toAccountId;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
		this.account = account;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public LocalDate getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getFromAccountId() {
		return fromAccountId;
	}


	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}


	public String getToAccountId() {
		return toAccountId;
	}


	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}


	public double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getTransactionStatus() {
		return transactionStatus;
	}


	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", fromAccountId=" + fromAccountId + ", toAccountId="
				+ toAccountId + ", transactionAmount=" + transactionAmount + ", transactionStatus=" + transactionStatus
				+ ", account=" + account + "]";
	}


	
	
	
	


}
