package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/adres",loadOnStartup = 1)
public class AddressServlet  extends HttpServlet {

private AddressDTO addressDTO;
public AddressServlet() {
	System.out.println("Address servlet created..");
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String HouseNumber=req.getParameter("num");
		String Street=req.getParameter("landmark");
		String City=req.getParameter("city");
		String State=req.getParameter("state");
		String Country=req.getParameter("country");
		
		AddressDTO addressDTO=new AddressDTO(HouseNumber, Street, City, State, Country);
				
		req.setAttribute("Data", addressDTO);
		req.setAttribute("DTO", "Address saved successfully");
		RequestDispatcher dispatcher=req.getRequestDispatcher("address.jsp");
		dispatcher.forward(req, resp);
		

		
	}
	

}
