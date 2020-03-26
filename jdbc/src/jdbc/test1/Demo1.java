package jdbc.test1;
import java.sql.*;
public class Demo1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载mysql jdbc驱动程序
			System.out.println("链接成功");
		}catch(Exception e) {
			System.out.println("错误，连接失败");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root","root");
		}catch(SQLException e) {
			
		}
}
}
