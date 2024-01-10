package com.xworkz.om.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login",loadOnStartup = 1)
public class WeaponServlent  extends HttpServlet{
	
	public WeaponServlent() {
		System.out.println("servelat is created..");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("running service...");
		
		String Name=request.getParameter("name");
		String MabeBy=request.getParameter("made");
		String Price=request.getParameter("cost");
		String WeaponType=request.getParameter("type");
		
		double convertedprice=Double.parseDouble(Price);
		
		System.out.println(" weapon holdar name is:"+Name);
		System.out.println(" weapon made by in:"+MabeBy);
		System.out.println("weapon price is :"+Price);
		System.out.println("weapon type :"+WeaponType);
		
		arg1.setContentType("text/html");
		PrintWriter writer=arg1.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\"> <!-- Link to your CSS file -->\r\n"
				+ "    <!-- /* Basic CSS styling for the elements */ -->\r\n"
				+ "<style>\r\n"
				+ ".menu-bar {\r\n"
				+ "    background-color: #333;\r\n"
				+ "    color: rgb(244, 129, 129);\r\n"
				+ "    padding: 10px;\r\n"
				+ "    margin-left: 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".menu-bar ul {\r\n"
				+ "    list-style-type: none;\r\n"
				+ "    padding: 0;\r\n"
				+ "    margin-left: 1100px;\r\n"
				+ "    font-size: x-large;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".menu-bar li {\r\n"
				+ "    display: inline;\r\n"
				+ "    margin-right: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".navbar {\r\n"
				+ "    background-color: #f8f9fa;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".navbar-toggler-icon {\r\n"
				+ "    border: 0;\r\n"
				+ "    /* Add your icon styles here */\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".form-floating {\r\n"
				+ "    margin-bottom: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".form-floating input[type=\"text\"],\r\n"
				+ ".form-floating select {\r\n"
				+ "    width: 100%;\r\n"
				+ "    padding: 10px;\r\n"
				+ "    border: 1px solid #ccc;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "input[type=\"submit\"] {\r\n"
				+ "    background-color: #007bff;\r\n"
				+ "    color: white;\r\n"
				+ "    padding: 10px 20px;\r\n"
				+ "    border: none;\r\n"
				+ "    border-radius: 5px;\r\n"
				+ "    cursor: pointer;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "\r\n"
				+ "<!-- /* Add more styles as needed */ -->\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div class=\"menu-bar\">\r\n"
				+ "        <ul>\r\n"
				+ "            <li><a href=\"wepon2.html\">weapon</a></li>\r\n"
				+ "            <li><a href=\"weaopn.html\">home</a></li>\r\n"
				+ "            \r\n"
				+ "        </ul>\r\n"
				+ "    </div>\r\n"
				+ "    <form action=\"loin\">\r\n"
				+ "        <nav class=\"navbar navbar-expand-lg bg-light\">\r\n"
				+ "            <div class=\"container-fluid\">\r\n"
				+ "                <!-- <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> -->\r\n"
				+ "                    <span class=\"navbar-toggler-icon\"></span> <!-- Use an appropriate icon here -->\r\n"
				+ "                </button>\r\n"
				+ "                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
				+ "                    <ul class=\"navbar-nav\">\r\n"
				+ "                    \r\n"
				+ "                        </li>\r\n"
				+ "                    </ul>\r\n"
				+ "                </div>\r\n"
				+ "            </div>\r\n"
				+ "        </nav>\r\n"
				+ "        <h2>Weapon Info</h2>\r\n"
				+ "       \r\n"
				+ " \r\n"
				+ "</form>\r\n"
				+ "");
		
		writer.print("<p><b>Name:</b>"+Name+"</p>");
		writer.print("<p><b>Made by:</b>"+MabeBy+"</p>");
		writer.print("<p><b>price is:</b>"+Price+"</p>");
		writer.print("<p><b>Weapon Type:</b>"+WeaponType+"</p>");
		writer.print("<h1><p style='color:green';>Weapon information is saved..</p></h1>");
		
		
		
		
		
	}
	
	
	

}
