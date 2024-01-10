import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cake",loadOnStartup = 3)
public class BakeryServlet extends HttpServlet{
	public BakeryServlet() {
	System.out.println("servalete is created..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method is created..");
		
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String quantity=req.getParameter("quantity");
		String discount=req.getParameter("discount");
		String gst=req.getParameter("gst");
		String manfdate=req.getParameter("manfdate");
		String expiredate=req.getParameter("expiredate");
		
		
		BakeryDTO dto=new BakeryDTO(name, price, quantity, discount, gst, manfdate, expiredate);
		req.setAttribute("items", dto);
		
		int convertedmanfdate=Integer.parseInt(manfdate);
		int convertedexpiredate=Integer.parseInt(expiredate);
		double convertedprice =Double.parseDouble(price);
		double convertedquantity=Double.parseDouble(quantity);
		double converteddiscount=Double.parseDouble(discount);
		double convertedgst=Double.parseDouble(gst);
		
		double total=convertedprice*convertedquantity;
		double Discount=(total*(converteddiscount/100));
		double TwD=total-Discount;
		double GST=(TwD+TwD*(convertedgst/100));
		
		req.setAttribute("total", total);
		req.setAttribute("Discount", Discount);
		req.setAttribute("TwD", TwD);
		req.setAttribute("GST", GST);
		
		LocalDateTime date=LocalDateTime.now();
		req.setAttribute("date", date);
		
		if(convertedexpiredate>convertedmanfdate) {
			req.setAttribute("ok", "<p style='color:green'>prodect is Good</p>");		
		}else{
			req.setAttribute("ok", "<p style='color:red'>prodect is expired</p>");
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("bakerySuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
