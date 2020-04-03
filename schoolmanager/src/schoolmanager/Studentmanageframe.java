package schoolmanager;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Studentmanageframe extends JPanel{
	static final int WIDTH = 400;//宽度变量
	static final int HEIGHT =200;//关于高度变量
	JFrame studentframe;//创建顶层窗口框架对象
	public static void main(String[] args) {
		Studentmanageframe er = new Studentmanageframe();
		er.studentmanageframe();
	}
	public void studentmanageframe() {
		studentframe =new JFrame();//为对象studentframe赋值
		studentframe.setTitle("学生信息管理系统");//设置标题
		//设置关闭方法
		studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentframe.setSize(WIDTH, HEIGHT);//设置顶层窗口框架对象大小
		//创建对象kit，实现窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentframe.setLocation(x, y);//设置对象位置
		studentframe.setVisible(true);//设置对象可显示
		studentframe.add(this, BorderLayout.CENTER);
		//创建各种按钮对象
		JButton computerone = new JButton("计算机系一班学生信息系统");
		JButton computertwo = new JButton("计算机系二班学生信息系统");
		JButton computerthree = new JButton("计算机系三班学生信息系统");
		JButton bioone = new JButton("生物系一班学生信息系统");
		JButton mechone = new JButton("机械系一班学生信息系统");
		JButton mechtwo = new JButton("机械系二班学生信息系统");
		JButton mechthree = new JButton("机械系三班学生信息系统");
		//创建各种标签对象
		JLabel title = new JLabel("学生信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//创建布局管理器对象lay
		setLayout(lay);//设置布局管理器
		//创建并设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=2;
		constraints.weighty=5;
		JPanel jp = new JPanel();//创建标签对象jp
		jp.setLayout(new GridLayout(1,3));//设置对象jp的布局管理器
		//添加各种对象到对象jp里
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//添加对象jp到对象studentframe
		studentframe.add(jp,BorderLayout.NORTH);
		//通过调用方法add实现利用网格组布局添加控件
		add(computerone,constraints,0,1,1,1);
		add(computertwo,constraints,0,2,1,1);
		add(computerthree,constraints,0,3,1,1);
		add(bioone,constraints,0,4,1,1);
		add(mechone,constraints,1,1,1,1);
		add(mechtwo,constraints,1,2,1,1);
		add(mechthree,constraints,1,3,1,1);
		//单击这个按钮，进入计算机系一班学生信息系统
		computerone.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='一班' and major='计算机系'";
				Studentinfo info = new Studentinfo("计算机系一班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入计算机系二班学生信息系统
		computertwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='二班' and major='计算机系'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("计算机系二班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入计算机系三班学生信息系统
		computerthree.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='三班' and major='计算机系'";
				Studentinfo info = new Studentinfo("计算机系三班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入生物系一班学生信息系统
		bioone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='一班' and major='生物系'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("生物系一班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入机械系一班学生信息系统
		mechone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='一班' and major='机械系'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("机械系一班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入机械系二班学生信息系统
		mechtwo.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from studentinfo where class='二班' and major='机械系'";
				Studentinfo info = new Studentinfo("机械系二班学生信息系统",sql);
			}
		});
		//单击这个按钮，进入机械系三班学生信息系统
				mechthree.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent Event) {
						// TODO 自动生成的方法存根
						String sql = "select * from studentinfo where class='三班' and major='机械系'";
						@SuppressWarnings("unused")
						Studentinfo info = new Studentinfo("机械系三班学生信息系统",sql);
					}
				});
	}
	//关于添加的方法
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h) {
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
}
