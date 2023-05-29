package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Product;
import com.util.EcomUtil;

public class ProductDao {

	public static void addProduct(Product p)
	{
		try {
			Connection conn = EcomUtil.createConnection();
			String sql = "insert into product (uid,p_category,p_name,p_model,p_price,p_image,p_desc) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getUid());
			pst.setString(2, p.getP_category());
			pst.setString(3, p.getP_name());
			pst.setString(4, p.getP_model());
			pst.setInt(5, p.getP_price());
			pst.setString(6, p.getP_image());
			pst.setString(7, p.getP_desc());
			pst.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
