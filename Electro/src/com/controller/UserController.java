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
import com.service.Services;

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
				u.setUsertype(request.getParameter("usertype"));
				UserDao.registerUser(u);
				request.setAttribute("msg", "Registration is successfull.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
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
				if(u.getUsertype().equals("user"))
				{
					HttpSession session = request.getSession();
					session.setAttribute("u", u);
					request.getRequestDispatcher("index.jsp").forward(request, response);					
				}
				else
				{
					HttpSession session = request.getSession();
					session.setAttribute("u", u);
					request.getRequestDispatcher("seller_index.jsp").forward(request, response);
				}				
				
			}		
					
		}
		else if(action.equalsIgnoreCase("Change Password"))
		{
			HttpSession session = request.getSession();
			User u = (User)session.getAttribute("u");
			
			if(u.getUsertype().equals("user"))
			{						
				if(u.getPassword().equals(request.getParameter("oldpassword")))
				{
					if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
					{
						UserDao.changePassword(u.getEmail(), request.getParameter("newpassword"));
						response.sendRedirect("logout.jsp");
					}
					else
					{
						request.setAttribute("msg", "New Password and Confirm New Password Doesn't Match.");
						request.getRequestDispatcher("changepassword.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "Old Password is Incorrect.");
					request.getRequestDispatcher("changepassword.jsp").forward(request, response);
				}
			}
			else
			{
				if(u.getPassword().equals(request.getParameter("oldpassword")))
				{
					if(request.getParameter("newpassword").equals(request.getParameter("cnewpassword")))
					{
						UserDao.changePassword(u.getEmail(), request.getParameter("newpassword"));
						response.sendRedirect("logout.jsp");
					}
					else
					{
						request.setAttribute("msg", "New Password and Confirm New Password Doesn't Match.");
						request.getRequestDispatcher("seller_changepassword.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "Old Password is Incorrect.");
					request.getRequestDispatcher("seller_changepassword.jsp").forward(request, response);
				}
			}
		}
		
		else if(action.equalsIgnoreCase("Update Profile"))
		{
			User u = new User();
			u.setUid(Integer.parseInt(request.getParameter("uid")));
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setAddress(request.getParameter("address"));
			u.setUsertype(request.getParameter("usertype"));
			UserDao.updateProfile(u);
			HttpSession session = request.getSession();
			session.setAttribute("u", u);
			if(u.getUsertype().equals("user"))
			{
				request.getRequestDispatcher("profile.jsp").forward(request, response);	
			}
			else
			{
				request.getRequestDispatcher("seller_profile.jsp").forward(request, response);	
			}
			
			
					
		}
		
		if(action.equalsIgnoreCase("Send OTP"))
		{
			String email = request.getParameter("email");
			boolean flag = UserDao.checkEmail(email);
			
			if(flag==true)
			{
				int min = 1000;
				int max = 9999;
				int otp = (int)(Math.random()*(max-min+1)+min);
				Services.sendMail(email, otp);
				request.setAttribute("email", email);
				request.setAttribute("otp", otp);
				request.setAttribute("msg", "OTP Sent Successfully.");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
				
				
			}
			else
			{
				request.setAttribute("msg", "Email not registered.");
				request.getRequestDispatcher("forgotpassword.jsp").forward(request, response);
			}
			
		}
		
		else if(action.equalsIgnoreCase("verify otp"))
		{
			String email = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("new_password.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "Invalid OTP");
				request.getRequestDispatcher("otp.jsp").forward(request, response);
			}
			
		}
		
		else if(action.equalsIgnoreCase("update password"))
		{
			String email = request.getParameter("email");
			String np = request.getParameter("newpassword");
			String cnp = request.getParameter("cnewpassword");
			
			if(np.equals(cnp))
			{
				UserDao.changePassword(email, np);
				response.sendRedirect("login.jsp");
			}
			else
			{
				request.setAttribute("email", email);
				request.setAttribute("msg", "New Password and Confirm New Password doesn't match.");
				request.getRequestDispatcher("new_password.jsp").forward(request, response);
			}
		}
		
		

	}

}
