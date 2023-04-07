package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ElectroUtil {
	
	public static Connection createConnection()
	{
		Connection conn = null;
		try {
			//Import the Driver
			Class.forName("com.mysql.jdbc.Driver");
			//Create the Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/electro", "root", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	

}
