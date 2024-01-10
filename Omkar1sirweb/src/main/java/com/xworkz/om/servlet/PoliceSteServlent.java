package com.xworkz.om.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/nice" ,loadOnStartup = 1)
public class PoliceSteServlent extends HttpServlet{
	
	public PoliceSteServlent() {  
		System.out.println(" servelent is created...");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");
		
		String StationName=request.getParameter("Sname");
		String HeadConstable =request.getParameter("Cname");
		String Location=request.getParameter("place");
		String AssistantComm =request.getParameter("Aname");
		String InspectorName=request.getParameter("Iname");
		String SIname=request.getParameter("Sname");
		String NoofCell=request.getParameter("number");
		String NoofCasesPending=request.getParameter("pending");
		String Painted=request.getParameter("radio");
		
		
		
		int convertednoofCell=Integer.parseInt(NoofCell);
		int convertednoofCasesPending=Integer.parseInt(NoofCasesPending);
		boolean convertedPainted=Boolean.parseBoolean(Painted);
		
		
		System.out.println("Station Name is:"+StationName);
		System.out.println("Head Constable name is:"+HeadConstable);
		System.out.println("Location Name is:"+Location);
		System.out.println("Assistant Comm Name is:"+AssistantComm);
		System.out.println("Inspector Name is:"+InspectorName);
		System.out.println("SI Name is:"+SIname);
		System.out.println("No of Cell  is:"+NoofCell);
		System.out.println("No of Cases Pending  is:"+NoofCasesPending);
		System.out.println("Painted:"+Painted);
		
		
		
		arg1.setContentType("text/html");
		PrintWriter writer=arg1.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "<style>\r\n"
				+ "        .navbar{\r\n"
				+ "            background-color: aqua;\r\n"
				+ "           \r\n"
				+ "        }\r\n"
				+ "        li{\r\n"
				+ "            margin-left: 700px;\r\n"
				+ "        }\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "        <form action=\"ps\">\r\n"
				+"           <h1> informaction about station</h1>\r\n"
				+ "            <nav class=\"navbar\">\r\n"
				+ "                <ul type=\"none\">\r\n"
				+ "                   <a href=\"pstation.html\"> <li>PS</li></a>\r\n"
				+ "                   <a href=\"pshome.html\"><li>home</li></a>\r\n"
				+ "                </ul>\r\n"
				
				+ "            </nav>\r\n"
				+ "        </form>\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "</body>\r\n"
				
				+ " </html>");

       writer.print("<p style='font-size: medium;'>Station Name is:"+StationName+"</p>");
       writer.print("<p style='font-size: medium;'>Head Constable name is:"+HeadConstable+"</p>");
       writer.print("<p style='font-size: medium;'>Location Name is:"+Location+"</p>");
       writer.print("<p style='font-size: medium;'>Assistant Comm Name is:"+AssistantComm+"</p>");
       writer.print("<p style='font-size: medium;'>Inspector Name is:"+InspectorName+"</p>");
       writer.print("<p style='font-size: medium;'>SI Name is:"+SIname+"</p>");
       writer.print("<p style='font-size: medium;'>No of Cell  is:"+NoofCell+"</p>");
       writer.print("<p style='font-size: medium;'>No of Cases Pending  is:"+NoofCasesPending+"</p>");
       writer.print("<p style='font-size: medium;'>Painted:"+Painted+"</p>");
		
		writer.print("<b style='color:green';>info is saved succesfull..</b><br>");
		
		if(convertednoofCell > 5) {
			writer.print("<p style='color:green';>it is big station.."+NoofCell+"</p>");
		}else {
			writer.print("<p style='color:red';>small station.."+NoofCell+"</p>");
		}
		if(convertednoofCasesPending>100) {
			writer.print("<p style='color:red';>many cases are pendding..."+convertednoofCasesPending+"</p>");
		}else {
			writer.print("<p style='color:green';>less casses are pendding..."+NoofCasesPending+"</p>");
		}
		if(convertedPainted == true) {
			writer.print("<p style='color:green';>the station is clean.."+convertedPainted+"</p>");
		}else {
			writer.println("<p style='color:red';>the station is dirty.."+convertedPainted+"</p>");
		}
		
			
	
	
	}
}
