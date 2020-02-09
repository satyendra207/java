import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Loginsupport  extends HttpServlet {
	
	public void doPost(HttpServletRequest req ,HttpServletResponse  res) throws IOException {
		
		
		String Username=req.getParameter("username");
		String Password=req.getParameter("password");
		PrintWriter pr=res.getWriter();
		
		
		Credentials cre= new Credentials();
		
		
			try {
				try {
					if(cre.check(Username,Password)) {
						
						HttpSession Ses=req.getSession();
						Ses.setAttribute("user", Username);	
						res.sendRedirect("Welcome.jsp");
						

					}else {
						pr.println("Your enter wrong credentials");
						res.sendRedirect("login.jsp");
						
						pr.println("Your enter wrong credentials");
					}
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
	}
	
	
		
	}
	


