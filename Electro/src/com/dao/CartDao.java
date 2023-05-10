package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.bean.Wishlist;
import com.util.ElectroUtil;

public class CartDao {
	
	public static void addToCart(Cart c)
	{
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "insert into cart(uid,pid,prod_price,prod_qty,total_price) values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getPid());
			pst.setInt(3, c.getProd_price());
			pst.setInt(4, c.getProd_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Cart> getCartByUser(int uid)
	{
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "select * from cart where uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Cart c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProd_price(rs.getInt("prod_price"));
				c.setProd_qty(rs.getInt("prod_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				list.add(c);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static boolean checkCart(int uid,int pid)
	{
		boolean flag = false;
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "select * from cart where uid=? and pid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				flag = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static void removeCart(Cart c)
	{
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "delete from cart where pid=? and uid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getPid());
			pst.setInt(2, c.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Cart getCartByCid(int cid)
	{
		Cart c = null;
		
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql = "select * from cart where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cid);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setPid(rs.getInt("pid"));
				c.setUid(rs.getInt("uid"));
				c.setProd_price(rs.getInt("prod_price"));
				c.setProd_qty(rs.getInt("prod_qty"));
				c.setTotal_price(rs.getInt("total_price"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	
	public static void updateCart(Cart c)
	{
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql ="update cart set prod_qty=?,total_price=? where cid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getProd_qty());
			pst.setInt(2, c.getTotal_price());
			pst.setInt(3, c.getCid());
			pst.executeUpdate();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
