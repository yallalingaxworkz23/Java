package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/rigester", loadOnStartup = 1)
public class SecondServlent extends HttpServlet {
	
	public SecondServlent() {
		System.out.println("second Servalent is created..");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");

		String Personname = request.getParameter("Name");
		System.out.println("Name :" + Personname);
		
		String Email = request.getParameter("emailid");
		System.out.println("last name is:"+Email);
		
		String Branch = request.getParameter("Barnch");
		System.out.println("branch is:"+Branch);
		
		String ActiveBacklog = request.getParameter("backlog");
		System.out.println("Active Backlogs is:"+ActiveBacklog);
		
		String TotalBacklog = request.getParameter("backlogs");
		System.out.println("Total backlogs is:"+TotalBacklog);
		

}
}