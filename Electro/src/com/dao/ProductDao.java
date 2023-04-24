package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Product;
import com.util.ElectroUtil;

public class ProductDao {
	
	public static void addProduct(Product p)
	{
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql="insert into product(uid,prod_category,prod_name,prod_model,prod_price,prod_desc,prod_img) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getUid());
			pst.setString(2, p.getProd_category());
			pst.setString(3, p.getProd_name());
			pst.setString(4, p.getProd_model());
			pst.setInt(5, p.getProd_price());
			pst.setString(6, p.getProd_desc());
			pst.setString(7, p.getProd_img());
			pst.executeUpdate();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
