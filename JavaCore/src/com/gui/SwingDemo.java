package com.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	
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
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new SwingDemo();
	}

}
