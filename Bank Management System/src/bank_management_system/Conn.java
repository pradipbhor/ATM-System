package bank_management_system;
import java.sql.*;
public class Conn {
	/*
	 * 1>import the package
	 * 2>Load And Register the driver
	 * 3>create  connection
	 * 4>create statement 
	 * 5>execute the query
	 * 6>close Connection
	 */
	Connection c;
	Statement s;
	public Conn() {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Pradip@123");
			s=c.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
