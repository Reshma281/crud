import java.sql.*;
public class delete_payroll{
	public static void prob() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/red";
		String username="root";
		String password="2821";
		String Query="delete from product where id=104";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		prob();	
	}
}
