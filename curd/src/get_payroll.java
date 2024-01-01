import java.sql.*;
public class get_payroll {

	public static void prob() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/red";
		String username="root";
		String password="2821";
		String Query="Select*from product";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement pst=con.createStatement();
		ResultSet rs=pst.executeQuery(Query);
		while(rs.next()) {
			System.out.println("id"+rs.getInt(1));
			System.out.println("prdct"+rs.getString(2));
			System.out.println("model"+rs.getString(3));
		}
		
		con.close();
	}
	public static void main(String[] args)throws Exception {
		prob();	
	}
	
}
