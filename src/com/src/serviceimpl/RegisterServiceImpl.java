package com.src.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.src.model.RegisterModel;
import com.src.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	private static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "jobdb", "jobdb@123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void insertUser(RegisterModel rm) throws SQLException {
		Statement statement = con.createStatement();
		statement.executeUpdate("insert into users values(null, '"+rm.getEmail()+"', '"+rm.getPassword()+"');");
	}
}
