package com.xworkz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/car",loadOnStartup = 1)
public class CarServlet  extends HttpServlet{
	
	public CarServlet() {
	System.out.println("servlet is created...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Name=req.getParameter("name");
		String Number=req.getParameter("pnum");
		String Cars=req.getParameter("car");
		String Date=req.getParameter("date");
		
		req.setAttribute("name", Name);
		req.setAttribute("pnum", Number);
		req.setAttribute("car", Cars);
		req.setAttribute("date", Date);
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("carDisplay.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}

}
