package schoolmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mainframe {//主界面的类
	static final int WIDTH = 400;//宽度
	static final int HEIGHT = 200;//高度
	JFrame buttonframe;
	public void mainframe() {//关于构造函数
		buttonframe = new JFrame();//初始化对象
		buttonframe.setTitle("学校信息管理系统");//设置标题
		//设置关闭方法
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(WIDTH,HEIGHT);//设置窗口大小
		Toolkit kit = Toolkit.getDefaultToolkit();//创建对象kit
		//获取屏幕的大小，使组件居中显示
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		buttonframe.setLocation(x, y);//设置对象位置
		buttonframe.setVisible(true);//设置对象可显示
		//创建关于学生信息系统的按钮
		JButton student = new JButton("学生信息系统模块");
		//创建关于教师信息系统的按钮
		JButton teacher = new JButton("教师信息系统模块");
		//创建关于领导信息系统的按钮
		JButton leader = new JButton("学校领导信息系统模块");
		//添加相关按钮到对象buttonframe里
		buttonframe.add(student);
		buttonframe.add(teacher);
		buttonframe.add(leader);
		//设置对象buttonframe的布局管理器
		buttonframe.setLayout(new GridLayout(3,1));
		//为student按钮注册事件处理器
		student.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Studentmanageframe studentframe = new Studentmanageframe();
				studentframe.studentmanageframe();
			}
		});
		//为teacher按钮注册事件处理器
		teacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Teachermanageframe teacherframe = new Teachermanageframe();
				teacherframe.teachermanageframe();
			}
		});
		//为leader按钮注册事件树立起
		leader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				Leadermanageframe leaderframe = new Leadermanageframe();
				leaderframe.leadermanageframe();
			}
		});
	}
}
