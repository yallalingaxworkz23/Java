package com.xworkz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loaan",loadOnStartup = 1)
public class LoanServlet extends HttpServlet {
	
	public LoanServlet() {
		System.out.println("servlet is created...");
	}
	
	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String Name=req.getParameter("name");
    	String Amount=req.getParameter("cost");
    	String Working=req.getParameter("radio");
    	String Interst=req.getParameter("intrest");
    	String Surety=req.getParameter("surety");
    	String Company=req.getParameter("company");
    	String LoanTenure=req.getParameter("tenuer");
    	String LoanType=req.getParameter("type");
    	
    	req.setAttribute("name", Name);
    	req.setAttribute("cost",Amount);
    	req.setAttribute("radio", Working);
    	req.setAttribute("intrest", Interst);
    	req.setAttribute("surety", Surety);
    	req.setAttribute("company", Company);
    	req.setAttribute("tenuer", LoanTenure);
    	req.setAttribute("type", LoanType);
    	
    	RequestDispatcher dispatcher = req.getRequestDispatcher("lonDisplay.jsp");
    	dispatcher.forward(req, resp);
    	System.out.println("name");
    	
    }
	

}
