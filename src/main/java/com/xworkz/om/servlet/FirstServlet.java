package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/nice", loadOnStartup = 1)
public class FirstServlet extends HttpServlet {

	public FirstServlet() {
		System.out.println("First Servelt Created...");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");

		String name = request.getParameter("username");
		System.out.println("Name " + name);

		String email = request.getParameter("email");
		System.out.println("email is " + email);
		
		String fname = request.getParameter("name");
		System.out.println("father name is "+fname);
		
		String Password = request.getParameter("password");
		System.out.println(" password is:"+Password);
	}

}
