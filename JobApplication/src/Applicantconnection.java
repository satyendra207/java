

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Applicantconnection
 */
@WebServlet("/register")
public class Applicantconnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Applicantconnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		String Name=request.getParameter("name");
		String Gender= request.getParameter("gender");
		String qualification= request.getParameter("qualification");
		int yearofpass = Integer.parseInt(request.getParameter("yearofpass"));
		String Interest = request.getParameter("interest");
		String dateofbirth= request.getParameter("dateofbirth");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection ("jdbc:mysql://localhost:3306/registrationdata","root","Satyendra@207");
			PreparedStatement st = con.prepareStatement("INSERT INTO applicants VALUES (NULL,?,?,?,?,?,?);");
			st.setString(1,Name);
			st.setString(2,Gender);
			st.setInt(3,yearofpass);
			st.setString(4, dateofbirth);
			st.setString(5, qualification);
			st.setString(6, Interest);
			st.executeUpdate();
			
			response.sendRedirect("ACK.jsp");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
