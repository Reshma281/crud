import java.sql.*;
public class payroll {
	public static void prob() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/red";
		String username="root";
		String password="2821";
		String Query="insert into product values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 104);
		pst.setString(2, "iphone");
		pst.setString(3, "iphone14");
		pst.executeUpdate();
		con.close();
	}
	public static void main(String[] args)throws Exception {
		prob();	
	}
}
