package schoolmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Storesystem2 {//�����ݿ��в�ѯ��ʦ�����
	//�����ݿ���ִ��sql
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public Vector getteacher(Connection con, String sql) {
			Vector v = new Vector();//������������
			try {
				Statement st = con.createStatement();//�����Ự����st
				ResultSet rs = st.executeQuery(sql);//�������������rs
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
		//�����ݿ��в�����Ϊstname�Ķ���
		public Teacher getobject(Connection con,String stname) {
			Teacher sst = null;//��������sst
			try {
				//��ȡ�Ự����st
				Statement st = con.createStatement();
				//������ѯ������sql
				String sql = "select * from teacherinfo where name='"+stname+"'";
				ResultSet rs=st.executeQuery(sql);//��ȡ���������
				//ͨ��������е�getstring���������ݿ��б�����ȡ���ֶ�����
				//�ٽ���ȡ���������ݸ�ֵ����ʦ����
				//��󽫽�ʦ����洢��vector���ݽṹ��
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
		//ͨ���������ݿ��url�����롢�û��������������ݿ������
		public Connection getConnection()
		{
			Connection con = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");//����mysql jdbc��������
			
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
