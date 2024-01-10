package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/nicc",loadOnStartup = 1)
public class LoginServlet  extends HttpServlet{
	
	 public LoginServlet() {
	System.out.println("servlet is created..");
	}
	 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		String Userid=req.getParameter("email");
		String Password=req.getParameter("password");
		
	
		
		req.setAttribute("email", Userid);
		req.setAttribute("password", Password);
		
		if(Userid.equals("admin") && Password.equals("admin")) {
	    
		req.setAttribute("email", Userid);
		RequestDispatcher dispatcher=req.getRequestDispatcher("loginSuccess.jsp");
		dispatcher.forward(req, resp);
	
	}else {
		req.setAttribute("incorrest","incorrect userid are password");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
		
	}
		
	}

}
