import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/A1",loadOnStartup = 3 )
public class ProdectsServelates  extends HttpServlet{
	
	public ProdectsServelates() {
		System.out.println("servalte is created..");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		
		req.setAttribute("name", name);
		req.setAttribute("price", price);
		req.setAttribute("type", type);
		
	    System.out.println("type:"+type);	
	    //double convertedtype=Double.parseDouble(type);
	double convertedprice=Double.parseDouble(price);
	System.out.println(convertedprice);
	
		if(type.equalsIgnoreCase("cloth")) {
			System.out.println(type);
			float m=10/100f;
			double total=convertedprice-(convertedprice*(m));
			System.out.println("Total");
			req.setAttribute("Total", total);
			RequestDispatcher dispatcher=req.getRequestDispatcher("customerSave.jsp");
			dispatcher.forward(req, resp);
			System.out.println(m);
		
			
		}
		if(type.equals("book")) {
			float b=15/100f;
			double total1=convertedprice-(convertedprice*(b));
			System.out.println("Total1");
			req.setAttribute("Total1",total1);
			RequestDispatcher dispatcher=req.getRequestDispatcher("customerSave.jsp");
			dispatcher.forward(req, resp);
		
		}
		if(type.equals("electric")) {
			float e=7/100f;
			double total2=convertedprice-(convertedprice*(e));
			System.out.println("Total2");
			req.setAttribute("Total2",total2);
			RequestDispatcher dispatcher=req.getRequestDispatcher("customerSave.jsp");
			dispatcher.forward(req, resp);
			System.out.println("electric"+total2);
		
		}
		if(type.equals("other")) {
			float o=5/100f;
			double total3=convertedprice-(convertedprice*(o));
			System.out.println("Total3");
			req.setAttribute("Total3",total3);
			RequestDispatcher dispatcher=req.getRequestDispatcher("customerSave.jsp");
			dispatcher.forward(req, resp);
		
		}
		
		

		
		
		
		
		
	}

}
