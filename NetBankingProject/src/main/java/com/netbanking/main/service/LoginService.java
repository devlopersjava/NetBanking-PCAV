package com.netbanking.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbanking.main.pojo.Login;
import com.netbanking.main.repository.LoginRepositoryInterface;

@Service
public class LoginService implements LoginServiceInterface {

	@Autowired
	private LoginRepositoryInterface loginRepositoryInterface;
	
	@Override
	public Login addLogin(Login login) {
		return loginRepositoryInterface.addLogin(login) ;
	}

	@Override
	public boolean updateLoginByUserId(Login login) {
		return loginRepositoryInterface.updateLoginByUserId(login);
	}

	@Override
	public boolean deleteByUserId(String userId) {
		return loginRepositoryInterface.deleteByUserId(userId);
		
	}

	@Override
	public List<Login> getAllLogin() {
		return loginRepositoryInterface.getAllLogin();
	}

	@Override
	public Login getOneUserByUserId(String userId) {
		return loginRepositoryInterface.getOneUserByUserId(userId);
}

	@Override
	public Login validateUser(Login login) {
		return loginRepositoryInterface.validateUser(login);
	}
	
	
 
	
	
	
	
	
	
}
