package com.netbanking.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Login;

@Repository
public class LoginRepository implements LoginRepositoryInterface {

	private int resultcount;
	
	@Autowired
	private LoginRowMapper loginRowMapper;

	@Autowired
	public JdbcTemplate jdbcTemplate;
	private static String INSERT_LOGIN = "INSERT INTO LOGIN (LOGIN_ID,PASSWORD,ROLE) VALUES (?,?,?)";
	private static String UPDATE_LOGIN = "UPDATE LOGIN SET PASSWORD=?,ROLE=? WHERE USER_ID=?";
	private static String DELETE_LOGIN = "DELETE LOGIN WHERE USERID=?";
	private static String GET_ALL_LOGIN = "SELECT * FROM LOGIN";
	private static String GET_ONE_LOGIN = "SELECT * FROM LOGIN WHERE LOGIN_ID=?";
	
	
	private static String VALIDATE_USER="SELECT * FROM LOGIN WHERE LOGIN_ID = ? AND PASSWORD = ?";

	@Override
	public boolean addLogin(Login login) {

		Object[] args = { login.getUserId(), login.getPassword(), login.getRole() };

		resultcount = jdbcTemplate.update(INSERT_LOGIN, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateLoginByUserId(Login login) {
		Object[] args = { login.getUserId(), login.getPassword(), login.getRole() };

		resultcount = jdbcTemplate.update(UPDATE_LOGIN, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteByUserId(String userId) {
		Object[] args = { userId };

		resultcount = jdbcTemplate.update(DELETE_LOGIN, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Login> getAllLogin() {
		System.out.println("getAllLogin");
		 List<Login> getAllLogin = jdbcTemplate.query(GET_ALL_LOGIN, 
				 loginRowMapper);
		return  getAllLogin;
	}

	@Override
	public Login getOneUserByUserId( String userId) {
		System.out.println(userId);
		Object[] args = { userId };
		Login login = jdbcTemplate.queryForObject(GET_ONE_LOGIN, loginRowMapper, args);
		
		return login;
	}

	@Override
	public Login validateUser(Login login) {
		System.out.println("getLogin");
		Object[] args = { login.getUserId(),login.getPassword()};
		Login validatUser=jdbcTemplate.queryForObject(VALIDATE_USER, loginRowMapper, args);
		return validatUser;
	}
	
	


}
