package com.netbanking.main.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phoneNumber;
	private int telePhoneNumber;
	private String emailID;
	private String status;
	
	@Autowired
	private Login login;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId, String firstName, String lastName, String address, String city, String state,
			int zip, int phoneNumber, int telePhoneNumber, String emailID, String status, Login login) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.telePhoneNumber = telePhoneNumber;
		this.emailID = emailID;
		this.status = status;
		this.login = login;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTelePhoneNumber() {
		return telePhoneNumber;
	}

	public void setTelePhoneNumber(int telePhoneNumber) {
		this.telePhoneNumber = telePhoneNumber;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNumber="
				+ phoneNumber + ", telePhoneNumber=" + telePhoneNumber + ", emailID=" + emailID + ", status=" + status
				+ ", login=" + login + "]";
	}

	
	
	
}
