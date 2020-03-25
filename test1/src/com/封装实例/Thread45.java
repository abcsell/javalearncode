package com.封装实例;

public class Thread45 {		//主运行类

	public static void main(String[] args) throws Exception{	//主方法
		// TODO 自动生成的方法存根
		//创建几个学生回答结果的对象
		Studentanswer sa1= new Studentanswer();
		Studentanswer sa2= new Studentanswer();
		Studentanswer sa3= new Studentanswer();
		Studentanswer sa4= new Studentanswer();
		Studentanswer sa5= new Studentanswer();
		Studentanswer sa6= new Studentanswer();
		Studentanswer sa7= new Studentanswer();
		Studentanswer sa8= new Studentanswer();
		//创建几个教师提问内容的对象
		Teacherask ta1=new Teacherask();
		Teacherask ta2=new Teacherask();
		Teacherask ta3=new Teacherask();
		Teacherask ta4=new Teacherask();
		Teacherask ta5=new Teacherask();
		Teacherask ta6=new Teacherask();
		Teacherask ta7=new Teacherask();
		Teacherask ta8=new Teacherask();
		//创建关于学生回答结果数组
		Studentanswer[] stt=new Studentanswer[] {sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa8};
		//创建关于奇偶暗示提问内容数组
		Teacherask[] stt1=new Teacherask[] {ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8};
		try {
			//通过一个循环语句将对象集合中元素输出，并且是按线程运行方式交叉运行
			for(int x=0; x<8;x++) {
				//通过设置器来设置属性
				stt[x].set("唐三", "22", "清华大学", "自动化系二年级", "3", "7", "54");
				stt1[x].set("王老师");
				stt1[x].setint(x);
				stt[x].setint(x);
				//启动线程
				stt1[x].start();
				stt[x].start();
			}
		}catch(Exception e) {			//很奇怪，为什么线程会乱
			
		}

	}

}
