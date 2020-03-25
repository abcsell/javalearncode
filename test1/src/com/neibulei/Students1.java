package com.neibulei;



//学习局部内部类
public class Students1 {
	//创建成员变量
		private String name;
		private String code;
		private String sexy;
		private String birthday;
		private String address;
		//通过设置器来设置对象参数
		public void setname(String name) {
			this.name=name;
		}
		public void setcode(String code) {
			this.code=code;
		}
		public void setsexy(String sexy) {
			this.sexy=sexy;
		}
		public void setbirthday(String birthday) {
			this.birthday=birthday;
		}
		public void setaddress(String address) {
			this.address=address;
		}
		//通过访问器来获取对象参数
		public String getname() {
			return name;
		}
		public String getcode() {
			return code;
		}
		public String getsexy() {
			return sexy;
		}
		public String getbirthday() {
			return birthday;
		}
		public String getaddress() {
			return address;
		}
		//通过toString方法让对象以字符串形式输出
		public String toString() {
			String infor = "学生姓名:"+name+" "+"学号："+code+" "+"性别："+sexy+" "+"出生年月:"+birthday+" "+"家庭住址:"+address;
			return infor;
		}
//		public void setstudentcoure(String[] courses) { //设置学生课程方法
//			new course(courses);							//创建内部类对象
//		}
		//将课程类作为外部类中的一个方法中的成员
		public void setstudentcourse(String[] courses) {
		class course{
			//创建成员变量
			private String[] courses;
			private int coursenum;
			//创建构造函数
			public course(String[] course) {
				courses = course;
				coursenum = course.length;
				getinfo();  //调用方法getinfo()
			}
			//获得课程数组中的课程
			private void get() {
				for (int i=0;i<coursenum; i++) {
					System.out.print(" "+ courses[i]);  //for循环，输出数组中的每个字段
				}
			}
			//按字符串形式输出
			private void getinfo() {
				System.out.println("学生姓名："+Students1.this.name+"学生学号:"+Students1.this.code+"一共选择了："+coursenum+"门科，分别是：");
				get();       //调用方法get()
			}
		}
		//创建了一个内部类的对象，随着包含这个内部类的外部方法仪器运行
		new course(courses);
		}
		//在主运行方法中，通过学生类的方法访问学生类的内部类courses
		public static void main(String[] args) {
			String[] courses= {"语文","数学","英语","化学"};
			Students st =new Students();
			st.setname("王浩");
			st.setcode("202012");
			st.setsexy("男");
			st.setaddress("北京市海淀区");
			System.out.println(st.toString());  
			st.setstudentcoure(courses);
		}
}
