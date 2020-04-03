package schoolmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Storesystem2 {//在数据库中查询教师类对象
	//在数据库中执行sql
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public Vector getteacher(Connection con, String sql) {
			Vector v = new Vector();//创建容器对象
			try {
				Statement st = con.createStatement();//创建会话对象st
				ResultSet rs = st.executeQuery(sql);//创建结果集对象rs
				while(rs.next()) {
					String name = rs.getString(1);
					String code = rs.getString(2);
					String sexy = rs.getString(3);
					String age = rs.getString(4);
					
					String birthday = rs.getString(5);
					String address = rs.getString(6);
					String salary = rs.getString(7);
					String major = rs.getString(8);
					String duty = rs.getString(9);
					Teacher ss = new Teacher(name,code);
					ss.setSexy(sexy);
					ss.setMajor(major);
					ss.setBirthday(birthday);
					ss.setAddress(address);
					ss.setAge(age);
					ss.setSalary(salary);
					ss.setDuty(duty);
					v.add(ss);
				}
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return v;
		}
		//在数据库中查找名为stname的对象
		public Teacher getobject(Connection con,String stname) {
			Teacher sst = null;//创建对象sst
			try {
				//获取会话对象st
				Statement st = con.createStatement();
				//创建查询语句变量sql
				String sql = "select * from teacherinfo where name='"+stname+"'";
				ResultSet rs=st.executeQuery(sql);//获取结果集对象
				//通过结果集中的getstring方法从数据库中表中提取表字段数据
				//再将提取出来的数据赋值给教师对象
				//最后将教师对象存储到vector数据结构中
				while(rs.next()) {
					String code = rs.getString(2);
					String sexy = rs.getString(3);
					String age = rs.getString(4);
					String address = rs.getString(5);
					String birthday = rs.getString(6);
					String salary = rs.getString(7);
					String major = rs.getString(8);
					String duty = rs.getString(9);
					sst = new Teacher(stname, code);
					sst.setSexy(sexy);
					sst.setMajor(major);
					sst.setBirthday(birthday);
					sst.setAddress(address);
					sst.setAge(age);
					sst.setSalary(salary);
					sst.setDuty(duty);
				}
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return sst;
		}
		//通过设置数据库的url、密码、用户名来建立与数据库的链接
		public Connection getConnection()
		{
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");//加载mysql jdbc驱动程序
			
			}catch(Exception e) {
				System.out.println("错误，连接失败");
				e.printStackTrace();
			}
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanage?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root","root");
			}catch(SQLException e) {
				
			}
			return con;
	}
}
