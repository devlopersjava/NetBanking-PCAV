package com.netbanking.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetBankingApplication.class, args);
		System.out.println("Spring Boot Application Deployed Successfully");
//		Login login=new Login();
//		
//		Customer customer=new Customer(101, "chaitanya", "raykar","navdeep", "kalyan",
//				"maharastra", 421402, 222526, 885078153,"chaitanya9397@gmail.com", "new",login);
//	
//		CustomerServiceInterface customerServiceInterface=new CustomerService();
//		
//		  customerServiceInterface.addNewCustomer(customer);
		
		
	}


}
