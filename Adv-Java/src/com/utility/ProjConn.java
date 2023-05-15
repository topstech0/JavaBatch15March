package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProjConn {
	
	public static Connection createConnection()
	{
		Connection conn= null;
		
		try {
			//import the driver
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}

}
