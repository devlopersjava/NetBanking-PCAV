package com.netbanking.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

public class ChequeDetails {
	
	private String chequeNumber;
	private String toPay;
	private double chequeAmount;
	private LocalDate chequeDate;
	private String checkStatus;
//	@Autowired
//	private Account account;
//	
	public ChequeDetails() {
		// TODO Auto-generated constructor stub
	}
public ChequeDetails(String chequeNumber, String toPay, double chequeAmount, LocalDate chequeDate, String checkStatus) {
	super();
	this.chequeNumber = chequeNumber;
	this.toPay = toPay;
	this.chequeAmount = chequeAmount;
	this.chequeDate = chequeDate;
	this.checkStatus = checkStatus;
}
public String getChequeNumber() {
	return chequeNumber;
}
public void setChequeNumber(String chequeNumber) {
	this.chequeNumber = chequeNumber;
}
public String getToPay() {
	return toPay;
}
public void setToPay(String toPay) {
	this.toPay = toPay;
}
public double getChequeAmount() {
	return chequeAmount;
}
public void setChequeAmount(double chequeAmount) {
	this.chequeAmount = chequeAmount;
}
public LocalDate getChequeDate() {
	return chequeDate;
}
public void setChequeDate(LocalDate chequeDate) {
	this.chequeDate = chequeDate;
}
public String getCheckStatus() {
	return checkStatus;
}
public void setCheckStatus(String checkStatus) {
	this.checkStatus = checkStatus;
}
@Override
public String toString() {
	return "ChequeDetails [chequeNumber=" + chequeNumber + ", toPay=" + toPay + ", chequeAmount=" + chequeAmount
			+ ", chequeDate=" + chequeDate + ", checkStatus=" + checkStatus + "]";
}
	
	
	
	
	
	
	
	

}
