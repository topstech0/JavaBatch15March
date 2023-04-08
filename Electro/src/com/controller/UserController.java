package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;
import com.dao.UserDao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("register")) {
			boolean flag = UserDao.checkEmail(request.getParameter("email"));

			if (flag == true) {
				request.setAttribute("msg", "Email-Id already registered.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			} else if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
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
				// response.sendRedirect("register.jsp");
			} else {
				request.setAttribute("msg", "Password and Confirm Password doesn't Match.");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("Login"))
		{
			User u = UserDao.checkLogin(request.getParameter("email"), request.getParameter("password"));
			
			if(u==null)
			{
				request.setAttribute("msg", "Invalid Email/Password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				HttpSession session = request.getSession();
				session.setAttribute("u", u);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
					
			
			
		}
		

	}

}
