package jdbc.test1;
import java.sql.*;
public class Sqltest2 {
	private Connection con;//�������ݿ������
	public static void main(String[] args ) throws ClassNotFoundException
	{
		Sqltest2 test = new Sqltest2();
		Connection con = test.getConnection();//����һ����������
		String sql = "select * from teacherinfo";
		test.getStudent(con, sql);
	}
	public void getStudent(Connection con,String sql)
	{
		try {
			Statement st= con.createStatement();//����һ�������
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				String name1 = rs.getString(1);
				String code1 = rs.getString(2);
				String sexy1 = rs.getString(3);
				String age1 = rs.getString(4);
				System.out.println("\n����:"+name1+"\tѧ��:"+code1+"\t�Ա�:"+sexy1+"\t����:"+age1);
			}
			st.close();
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}
	public Connection getConnection() throws ClassNotFoundException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");//����mysql jdbc��������
			System.out.println("���ӳɹ�");
		}catch(Exception e) {
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanage?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root","root");
		}catch(SQLException e) {
			
		}
		return con;
	}
	
}
