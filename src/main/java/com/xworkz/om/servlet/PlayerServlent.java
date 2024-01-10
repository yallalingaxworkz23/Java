package com.xworkz.om.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

//import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import sun.security.provider.certpath.ResponderId;

@WebServlet(urlPatterns = "/home", loadOnStartup = 1)
public class PlayerServlent extends HttpServlet {


//	private ServletResponse resp;
	//private HttpServletRequest resq;

	public PlayerServlent() {
		System.out.println("players Servelt Created...");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");
		
		String name = request.getParameter("Playername");
		System.out.println("Name " + name);
		
		String sports = request.getParameter("sportsname");
		System.out.println("Sports name is:"+sports);
		
		String place = request.getParameter("placename");
		System.out.println("Place name is:"+place);
		
		String exp = request.getParameter("expnum");
		System.out.println("expremence is:"+exp);
		
		//System.out.println("URL:"+resq.getRequestURL());
		//System.out.println("HTTP METHOD:"+resq.getMethod());
		//System.out.println("User Agent:"+resq.getHeader("user-agent"));
		
		arg1.setContentType("text/plain");	
		PrintWriter writer=arg1.getWriter();
		writer.print(name+","+sports+","+place+"," +exp+" info is saved sucessfully");
		
		
	
		


	}
}
