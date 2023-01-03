package com.qsp.statements.statics.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConnection { 
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		String url ="jdbc:mysql://localhost:3306/jdbc--statements-statics";
		String user ="root";
		String pass ="sonu1118";
	
		Class.forName("com.mysql.cj.jdbc.Driver");  
		
		
		Connection connection=DriverManager.getConnection(url, user, pass);
		
		return connection;
	


	}
}


