package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.User;
import com.util.ElectroUtil;

public class UserDao {
	
	public static void registerUser(User u)
	{
		Connection conn = null;
		
		try {
			conn = ElectroUtil.createConnection();
			String sql = "insert into user(fname,lname,email,mobile,password,cpassword,gender,address) values (?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getPassword());
			pst.setString(6, u.getCpassword());
			pst.setString(7, u.getGender());
			pst.setString(8, u.getAddress());
			pst.executeUpdate();					
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
