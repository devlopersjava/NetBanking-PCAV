package com.netbanking.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class Account {
	
	private String accountId;
	private String accountType;
	private LocalDate openDate;
	private double minimumBalance;
	private double currentBalance;
	private double rateOfInterest;
	
	@Autowired
	private Customer customer;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountId, String accountType, LocalDate openDate, double minimumBalance, double currentBalance,
			double rateOfInterest, Customer customer) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.openDate = openDate;
		this.minimumBalance = minimumBalance;
		this.currentBalance = currentBalance;
		this.rateOfInterest = rateOfInterest;
		this.customer = customer;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public LocalDate getOpenDate() {
		return openDate;
	}

	public void setOpenDate(LocalDate openDate) {
		this.openDate = openDate;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", openDate=" + openDate
				+ ", minimumBalance=" + minimumBalance + ", currentBalance=" + currentBalance + ", rateOfInterest="
				+ rateOfInterest + ", customer=" + customer + "]";
	}
	
	

}
