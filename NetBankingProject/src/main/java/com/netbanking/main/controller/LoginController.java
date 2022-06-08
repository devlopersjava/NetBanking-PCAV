

	
 package com.netbanking.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbanking.main.pojo.BankSlip;
import com.netbanking.main.pojo.Login;
import com.netbanking.main.service.LoginServiceInterface;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("logindetails")
public class LoginController {

	@Autowired
	private LoginServiceInterface loginServiceInterface;
 
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public Login addNewEmployee(@RequestBody Login login ) {
		return loginServiceInterface.addLogin(login);
	}

//	@RequestMapping(value="login",method = RequestMethod.PUT)
//	public boolean updateLoginByUserId(Login login) {
//		return loginServiceInterface.updateLoginByUserId(login);
//	} 
//	
//	@RequestMapping(value="login/{userid}",method = RequestMethod.DELETE)
//	public boolean deleteByUserId(String userId) {
//		return loginServiceInterface.deleteByUserId(userId);
//	}
	
	@RequestMapping(value="login/{userId}",method = RequestMethod.GET)
	public Login getOneUserByUserId(@PathVariable String userId) {
		return loginServiceInterface.getOneUserByUserId(userId);	
	}
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public List<Login> getAllLogin(){
		return loginServiceInterface.getAllLogin();
		
	}
	
	@RequestMapping(value="login2",method = RequestMethod.POST)
	public Login validateUser(@RequestBody Login login) {
		
		return loginServiceInterface.validateUser(login);
		
	
	}
	


	
	

	
	
	
}
