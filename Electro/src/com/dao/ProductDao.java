package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public static List<Product> getAllProduct()
	{
		List<Product> list = new ArrayList<Product>();
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "select * from product";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProd_category(rs.getString("prod_category"));
				p.setProd_name(rs.getString("prod_name"));
				p.setProd_model(rs.getString("prod_model"));
				p.setProd_price(rs.getInt("prod_price"));
				p.setProd_desc(rs.getString("prod_desc"));
				p.setProd_img(rs.getString("prod_img"));
				list.add(p);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public static Product getProductById(int pid)
	{
		Product p = null;
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "select * from product where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setUid(rs.getInt("uid"));
				p.setProd_category(rs.getString("prod_category"));
				p.setProd_name(rs.getString("prod_name"));
				p.setProd_model(rs.getString("prod_model"));
				p.setProd_price(rs.getInt("prod_price"));
				p.setProd_desc(rs.getString("prod_desc"));
				p.setProd_img(rs.getString("prod_img"));				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	

	public static void updateProduct(Product p)
	{
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql="update product set prod_category=?,prod_name=?,prod_model=?,prod_price=?,prod_desc=? where pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);			
			pst.setString(1, p.getProd_category());
			pst.setString(2, p.getProd_name());
			pst.setString(3, p.getProd_model());
			pst.setInt(4, p.getProd_price());
			pst.setString(5, p.getProd_desc());
			pst.setInt(6, p.getPid());
			pst.executeUpdate();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
