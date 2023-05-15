package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.dao.EmpDao;


@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action"); // it will retrieve the value from the comp.
		//System.out.println(action);
		
		if(action.equalsIgnoreCase("submit"))
		{
			/*System.out.println(request.getParameter("fname"));
			System.out.println(request.getParameter("lname"));
			System.out.println(request.getParameter("email"));
			System.out.println(request.getParameter("mobile"));
			System.out.println(request.getParameter("password"));
			System.out.println(request.getParameter("cpassword"));
			System.out.println(request.getParameter("gender"));
			System.out.println(request.getParameter("hobby"));
			System.out.println(request.getParameter("qualification"));
			System.out.println(request.getParameter("address"));
			*/
			
			
			Employee e = new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(Long.parseLong(request.getParameter("mobile")));
			e.setPassword(request.getParameter("password"));
			e.setGender(request.getParameter("gender"));
			e.setAddress(request.getParameter("address"));
			EmpDao.insertEmp(e);
			response.sendRedirect("index.jsp");
				
			
			
		}
	}

}
