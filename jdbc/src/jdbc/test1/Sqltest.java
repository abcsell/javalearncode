package jdbc.test1;
import java.sql.*;
public class Sqltest {
	private Connection con;//�������ݿ������
	public static void main(String[] args ) throws ClassNotFoundException
	{
		Sqltest test = new Sqltest();
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
		String url1 = "jdbc:mysql://localhost:3306/schoolmanage";
		String username  = "root";
		String password ="root";
	
		try {
			Class.forName("com.mysql.jdbc.Driver");//��¼������������Դ��ȥ������˵�ǵ�¼�����ݿ���ȥ
			con=DriverManager.getConnection(url1,username,password);
		}catch(SQLException e) {e.printStackTrace();}
		return con;
	}
	
}
