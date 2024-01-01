import java.sql.*;
public class update_payroll {
   
	public static void prob() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/red";
		String username="root";
		String password="2821";
		String Query="update product set prdct='apple' where id=102";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		prob();	
	}
	
}
