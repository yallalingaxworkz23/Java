package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class ThirdServlent extends HttpServlet {
	

	public ThirdServlent() {
		System.out.println("First Servelt Created...");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");

		String Email = request.getParameter("email");
		System.out.println("Name " + Email);

		String Password= request.getParameter("password");
		System.out.println("email is " + Password);
	}	

}
