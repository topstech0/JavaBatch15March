package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Employee;
import com.utility.ProjConn;

public class EmpDao {
	
	public static void insertEmp(Employee e)
	{
		try {
			Connection conn = ProjConn.createConnection();
			String sql = "insert into employee (fname,lname,email,mobile,password,gender,address) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getFname());
			pst.setString(2, e.getLname());
			pst.setString(3, e.getEmail());
			pst.setLong(4, e.getMobile());
			pst.setString(5, e.getPassword());
			pst.setString(6, e.getGender());
			pst.setString(7, e.getAddress());
			pst.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
