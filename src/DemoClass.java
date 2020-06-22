import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class DemoClass {
	public static void main(String[]args)throws Exception
	{
		
		String url="jdbc:mysql://localhost:3306/aliens";
		String uname="root";
		String pass="1234";
		String query="select username from s where userid=2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getNString("username");
		System.out.println(name);
		st.close();
		con.close();
	}

}
