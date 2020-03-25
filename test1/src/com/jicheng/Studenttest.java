package com.jicheng;

public class Studenttest {			//	主运行类

	public static void main(String[] args) {		//主方法
		// TODO 自动生成的方法存根
		//通过构造器构造出sc、sm、sc1这三个对象
		Studentclass sc=new Studentclass();
		Studentclass sm =new Studentclass();
		Studentclass sc1=new Studentclass(); //这个句柄只能操控父类中没有被子类覆盖的方法
		//通过set设置器来设置3个对象的参数
		sc.set("王浩","1","男");
		sc.set(90.5);
		sm.set("张杰","2","男");
		sm.set(99.0);
	//	sm.set("班长");
		//通过toString方法来让3个对象以字符串形式输出
		System.out.println(sc.toString());
		System.out.println(sm.toString());
		//修改对象sc1的相应属性
		sc1.set("赵丽","3","女");
		sc1.set(100);
		System.out.println(sc1.toString());//通过tostring方法输出
	}

}
class Studentclass{			//学生类
	String name;			//姓名
	String code;			//学号
	String sexy;				//性别
	double achievement;		//成绩
	//通过方法设置了姓名、学号、性别、成绩等参数
	public void set(String name, String code, String sexy) {
		this.name=name;
		this.code=code;
		this.sexy=sexy;
	}
	//关于方法set()的多态
	public void set(double achievement) {
		this.achievement=achievement;
	}
	public String getname() {  //获取属性的值
		return name;
	}
	public String getcode() {
		return code;
	}
	public String getsexy() {
		return sexy;
	}
	public double getachi() {
		return achievement;
	}
	public String toString() {    //通过tostring方法让对象以字符串形式输出
		String infor="学生姓名:"+name+" " + "学号：" + code +" " +"性别："+sexy+" "+"成绩:"+achievement;
		return infor;  //返回字符串对象infor
	}
}






















