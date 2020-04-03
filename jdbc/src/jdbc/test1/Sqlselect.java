package jdbc.test1;
import java.sql.*;
public class Sqlselect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO 自动生成的方法存根
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/schoolmanage?user=root&password=root&useSSL=false";
		Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from studentinfo");
		while(rs.next()) {
			String name = rs.getString("stname");
			String age = rs.getString("stage");
			String code  = rs.getString("stcode");
			System.out.println("姓名："+name+"   "+"年龄："+age+"    "+"学号:"+code);
		}
		
		
	}

}
