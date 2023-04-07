package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.dao.UserDao;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("register"))
		{
			User u = new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setPassword(request.getParameter("password"));
			u.setCpassword(request.getParameter("cpassword"));
			u.setGender(request.getParameter("gender"));
			u.setAddress(request.getParameter("address"));
			UserDao.registerUser(u);
			request.setAttribute("msg", "Registration is successfull.");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
			//response.sendRedirect("register.jsp");
		
		
	}
		
		
		
	}

}
