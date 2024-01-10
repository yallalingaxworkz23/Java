package com.xworkz.om.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info",loadOnStartup = 1 )
public class FormarServlent extends HttpServlet {
	
	public FormarServlent() {
		System.out.println(" servelent is created...");
	}
		
		protected void service(HttpServletRequest request, HttpServletResponse arg1) throws ServletException, IOException {
			System.out.println("running service...");
			
			String name = request.getParameter("name");
			String area= request.getParameter("area");
			String fertilizer=request.getParameter("Fertilizers");
			String Season=request.getParameter("season");
			String Soiltype  = request.getParameter("soil");
			String croptype = request.getParameter("crop");
			String investment=request.getParameter("invest");
			String profit=request.getParameter("profitt");
			String Recordno=request.getParameter("record");
			
			double convertedInvestment = Double.parseDouble(investment);
			double convertedProfit = Double.parseDouble(profit);
			
			
			System.out.println("person name:"+name);
			System.out.println("person total area:"+area);
			System.out.println("fertilizer name:"+fertilizer);
			System.out.println("season:"+Season);
			System.out.println("crops type:"+croptype);
			System.out.println("total investment:"+investment);
			System.out.println("total profit:"+profit);
			System.out.println("formar record number:"+Recordno);
			
			arg1.setContentType("text/html");
			PrintWriter writer=arg1.getWriter();
			writer.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "<style>\r\n"
					+ "    .navebar{\r\n"
					+ "        background-color: antiquewhite;\r\n"
					+ "        \r\n"
					+ "    }\r\n"
					+ "    li{\r\n"
					+ "    margin-left: 800px;\r\n"
					+ "    }\r\n"
					+ "</style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <form action=\"info\">\r\n"
					+ "        <div>\r\n"
					+ "             <nav class=\"navebar\">\r\n"
					+ "                         <ul>\r\n"
					+ "                            <a href=\"index.html\"> <li>home</li></a>\r\n"
					+ "                         </ul>\r\n"
					+ "                     </nav>\r\n"
					+ "            </div>\r\n"
					+ "            <div>\r\n"
					+ "                Name: <input type=\"text\" name=\"name\" placeholder=\"enter u r name\" required>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                Area: <input type=\"text\" name=\"area\" placeholder=\"enter u r area\" required>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                Fertilizer: <select name=\"Fertilizers\" id=\"ferti\">\r\n"
					+ "                    <option value=\"select\">select</option>\r\n"
					+ "                    <option value=\"urea\">urea</option>\r\n"
					+ "                    <option value=\"npk\">N P K</option>\r\n"
					+ "                    <option value=\"pottassium\">pottassium</option>\r\n"
					+ "                    <option value=\"calcium\">calcium nitrate</option>\r\n"
					+ "                </select>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                Season: <select name=\"season\" id=\"monsun\">\r\n"
					+ "                    <option value=\"select\">select</option>\r\n"
					+ "                    <option value=\"rain\">Rainey</option>\r\n"
					+ "                    <option value=\"summer\">summer</option>\r\n"
					+ "                    <option value=\"winter\">winter</option>\r\n"
					+ "                </select>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                Soil type <select name=\"soil\" id=\"type\">\r\n"
					+ "                    <option value=\"select\">select</option>\r\n"
					+ "                    <option value=\"black\">black</option>\r\n"
					+ "                    <option value=\"red\">red</option>\r\n"
					+ "                    <option value=\"brown\">brown</option>\r\n"
					+ "                </select>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                crop type <select name=\"crop\" id=\"type\">\r\n"
					+ "                    <option value=\"select\">select</option>\r\n"
					+ "                    <option value=\"rice\">Rice</option>\r\n"
					+ "                    <option value=\"corn\">corn</option>\r\n"
					+ "                    <option value=\"sugar\">sugarcan</option>\r\n"
					+ "                    <option value=\"cotton\">cotton</option>\r\n"
					+ "                </select>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                investment: <input type=\"text\" name=\"invest\" placeholder=\"enter u r invest\" required>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                profit: <input type=\"text\" name=\"profitt\" placeholder=\"enter u r profit\" required>\r\n"
					+ "            </div><br>\r\n"
					+ "            <div>\r\n"
					+ "                Record no: <input type=\"text\" name=\"record\" placeholder=\"enter u r record\" required>\r\n"
					+ "            </div><br>\r\n"
					+ "            \r\n"
					+ "                <input type=\"submit\" name=\"value\" >\r\n"
					+ "            \r\n"
					+ "        </form>\r\n"
					+ "    \r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "</html>");
			writer.print("formar info saved successfulley<br>");
			
			
			if(convertedProfit > convertedInvestment) {
				writer.print("<span style='color:green;'>this is good year!...</span>");
			}else {
				writer.print("<span style='color:red;'>  this is not a good year!..</span>");
			}
			
			
			
			
			
	}
	
}
