package com.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo implements ActionListener{
	
	JFrame f;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3,b4;
	
	
	public SwingDemo() {
		f = new JFrame("Employee CMS");
		f.setVisible(true);
		f.setSize(400, 450);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout());
		f.setLayout(null);
		f.setResizable(false);
		
		l1 = new JLabel("ID : ");
		l2 = new JLabel("Name : ");
		l3 = new JLabel("Email : ");
		l4 = new JLabel("Mobile : ");
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Search");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");
		
		// Adding Labels in Frame
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		
		// Adding Labels in Frame
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		
		// Adding Labels in Frame
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		l1.setBounds(50, 50, 50, 50);
		l2.setBounds(50, 100, 50, 50);
		l3.setBounds(50, 150, 50, 50);
		l4.setBounds(50, 200, 50, 50);
		
		t1.setBounds(120, 65, 150, 20);
		t2.setBounds(120, 115, 150, 20);
		t3.setBounds(120, 165, 150, 20);
		t4.setBounds(120, 215, 150, 20);
		
		b1.setBounds(50, 250, 100, 30);
		b2.setBounds(180, 250, 100, 30);
		b3.setBounds(50, 300, 100, 30);
		b4.setBounds(180, 300, 100, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			
			try {
				// Import the Driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//Establish the Connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java21batch", "root", "");
				
				//Write the Query
				
				String sql = "insert into employee(name,email,mobile) values (?,?,?)";
				
				//Prepare the Statement.
				
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				
				//Execute the Query
				
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(b1, "Data Inserted Successfully");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		else if(ae.getSource()==b2)
		{
			//System.out.println("Searched Clicked.");
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java21batch", "root", "");
				String sql = "select * from employee where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				ResultSet rs = pst.executeQuery();
				
				if(rs.next())
				{
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("email"));
					t4.setText(rs.getString("mobile"));
				}
				else
				{
					JOptionPane.showMessageDialog(b2, "ID not Registered.");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b3)
		{
			//System.out.println("Update Clicked.");
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java21batch","root","");
				String sql = "update employee set name=?,email=?,mobile=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, t2.getText());
				pst.setString(2, t3.getText());
				pst.setString(3, t4.getText());
				pst.setInt(4, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				
				JOptionPane.showMessageDialog(b3, "Data Updated Successfully.");
				
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
		}
		else if(ae.getSource()==b4)
		{
			//System.out.println("Delete Clicked.");
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java21batch", "root", "");
				String sql = "delete from employee where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, Integer.parseInt(t1.getText()));
				pst.executeUpdate();
				JOptionPane.showMessageDialog(b4, "Data Deleted Successfully.");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
	public static void main(String[] args) {
		
		new SwingDemo();
	}



}
