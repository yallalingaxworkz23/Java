package com.xworkz.om.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info",loadOnStartup = 3)
public class MatchInfoServlet extends HttpServlet {
	
	public MatchInfoServlet() {
		System.out.println("Servelet is created...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
		     String tournamentName=req.getParameter("tournamentName");
		     String hostingcountry=req.getParameter("hostingcountry");
		     String matchdate=req.getParameter("matchdate");
		     String team1name=req.getParameter("team1name");
		     String team2name=req.getParameter("team2name");
		     String team1captainname=req.getParameter("team1captainname");
		     String team2captainname=req.getParameter("team2captainname");
		     String umpirename=req.getParameter("umpirename");
		     String stadiumname=req.getParameter("stadiumname");
		     String thirdumpirename=req.getParameter("thirdumpirename");
		     String stadiumcapacity=req.getParameter("stadiumcapacity");
		     
		     req.setAttribute("tournamentName", tournamentName);
		     req.setAttribute("hostingcountry", hostingcountry);
		     req.setAttribute("matchdate", matchdate);
		     req.setAttribute("team1name", team1name);
		     req.setAttribute("team2name", team2name);
		     req.setAttribute("team1captainname", team1captainname);
		     req.setAttribute("team2captainname", team2captainname);
		     req.setAttribute("umpirename", umpirename);
		     req.setAttribute("stadiumname", stadiumname);
		     req.setAttribute("thirdumpirename", thirdumpirename);
		     req.setAttribute("stadiumcapacity", stadiumcapacity);
		     
		     RequestDispatcher dispatcher=req.getRequestDispatcher("matchSuccess.jsp");
		     dispatcher.forward(req, resp);
		     
		
	}

}
