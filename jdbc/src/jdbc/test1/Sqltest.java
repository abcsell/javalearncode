package jdbc.test1;
import java.sql.*;
public class Sqltest {
	private Connection con;//关于数据库的链接
	public static void main(String[] args ) throws ClassNotFoundException
	{
		Sqltest test = new Sqltest();
		Connection con = test.getConnection();//定义一个数据链接
		String sql = "select * from teacherinfo";
		test.getStudent(con, sql);
	}
	public void getStudent(Connection con,String sql)
	{
		try {
			Statement st= con.createStatement();//定义一个结果集
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				String name1 = rs.getString(1);
				String code1 = rs.getString(2);
				String sexy1 = rs.getString(3);
				String age1 = rs.getString(4);
				System.out.println("\n姓名:"+name1+"\t学号:"+code1+"\t性别:"+sexy1+"\t年龄:"+age1);
			}
			st.close();
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}
	public Connection getConnection() throws ClassNotFoundException
	{
		String url1 = "jdbc:mysql://localhost:3306/schoolmanage";
		String username  = "root";
		String password ="root";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");//登录到建立的数据源上去，或者说是登录到数据库上去
			con=DriverManager.getConnection(url1,username,password);
		}catch(SQLException e) {e.printStackTrace();}
		return con;
	}
	
}
