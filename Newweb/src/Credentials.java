import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class  Credentials  {
	
	
	public boolean check( String a, String b) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","Satyendra@207");
		PreparedStatement st = con.prepareStatement("select * from cred where un=? and ps=?");
		st.setString(1,a);
		st.setString(2,b);
		ResultSet rs= st.executeQuery();
		
		if (rs.next()) {
			return true;
			
		}
		
		
		
		
		return false;
		
	}
	
}