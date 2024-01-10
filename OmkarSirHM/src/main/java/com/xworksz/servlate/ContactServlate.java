package com.xworksz.servlate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = "/yallu",loadOnStartup = 3)
public class ContactServlate extends HttpServlet{
	private ContactDTO contactDTO;
	public ContactServlate() {
	System.out.println("servlate is estiblashed..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String mobile=req.getParameter("mobile");
		String comment=req.getParameter("comment");
		
		ContactDTO contactDTO=new ContactDTO(name, email, mobile, comment);
		req.setAttribute("comment", contactDTO);
		RequestDispatcher dispatcher=req.getRequestDispatcher("contactSuccess.jsp");
	    dispatcher.forward(req, resp);
		
		
		
	}

}
