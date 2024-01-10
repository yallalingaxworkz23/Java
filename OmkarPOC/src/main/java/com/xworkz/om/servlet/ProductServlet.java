	package com.xworkz.om.servlet;//ProductServlate

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bay",loadOnStartup = 1)
public class ProductServlet  extends HttpServlet{
	
	public ProductServlet() {
	System.out.println("Produect servelet is creat..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String ProductName= req.getParameter("name");
	 String Type= req.getParameter("select");
	 String Price= req.getParameter("price");
	 String Brand= req.getParameter("brand");
	 String Quantity= req.getParameter("quantity");
	 String Desc= req.getParameter("desc");
	

	 
	 if(Price.isEmpty() ) {
		 req.setAttribute("price", "prise is must provided"); 
		 RequestDispatcher dispatcher= req.getRequestDispatcher("prodect.jsp");
		 dispatcher.forward(req, resp);
		 
	 }else {
		
		 double convertedPrice=Double.parseDouble(Price);
		 double convertedquantity=Double.parseDouble(Quantity);
		 double total=convertedPrice*convertedquantity;
		 req.setAttribute("name", ProductName);
		 req.setAttribute("select", Type);
		 req.setAttribute("price", Price);
		 req.setAttribute("brand", Brand);
		 req.setAttribute("quantity", Quantity);
		 req.setAttribute("desc", Desc);
		 req.setAttribute("total", total);
		 
		 
		 RequestDispatcher dispatcher= req.getRequestDispatcher("productSuccess.jsp");
		 dispatcher.forward(req, resp);
	 }
	 
	
	 
	  
	}

}
