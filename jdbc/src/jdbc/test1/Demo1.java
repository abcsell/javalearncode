package jdbc.test1;
import java.sql.*;
public class Demo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			Class.forName("com.mysql.jdbc.Driver");//����mysql jdbc��������
			System.out.println("���ӳɹ�");
		}catch(Exception e) {
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root","root");
		}catch(SQLException e) {
			
		}
}
}
