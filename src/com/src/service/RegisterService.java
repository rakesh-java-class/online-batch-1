package com.src.service;

import java.sql.SQLException;

import com.src.model.RegisterModel;

public interface RegisterService {
	public void insertUser(RegisterModel rm) throws SQLException;
}
