package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.EmpUtil;

public class EmpDao {

	public static void insertEmp(Employee e)
	{
		Session session = EmpUtil.createSession();
		Transaction tr  = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
	}
	
}
