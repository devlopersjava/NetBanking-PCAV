package com.netbanking.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.netbanking.main.pojo.Login;

@Repository
public class LoginRowMapper implements RowMapper<Login> {

	public Login mapRow(ResultSet resultSet, int i) throws SQLException {
		String userId = resultSet.getString("LOGIN_ID");
		String password = resultSet.getString("PASSWORD");
		String role = resultSet.getString("ROLE");

		Login login = new Login(userId, password, role);

		return login;

	}
}
