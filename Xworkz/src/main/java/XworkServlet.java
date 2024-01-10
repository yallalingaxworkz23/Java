import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/xworkz",loadOnStartup = 3)
public class XworkServlet  extends HttpServlet{
	public XworkServlet() {
	System.out.println("xwork servelate is created..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  String name= req.getParameter("name");
	  String mobileNo= req.getParameter("mobileNo");
	  String email=req.getParameter("email");
	  String dob=req.getParameter("dob");
	  String location=req.getParameter("location");
	  String password=req.getParameter("password");
      String confirmPassword=req.getParameter("confirmPassword");
		
      req.setAttribute("name", name);
      req.setAttribute("mobileNo", mobileNo);
      req.setAttribute("email", email);
      req.setAttribute("dob", dob);
      req.setAttribute("location", location);
      req.setAttribute("password", password);
      req.setAttribute("confirmPassword", confirmPassword);

     RequestDispatcher dispatcher=req.getRequestDispatcher("xworkRigesterSuccess.jsp");
     dispatcher.forward(req, resp);
		
	}
	
	
 
}
