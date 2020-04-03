package schoolmanager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Leadermanageframe extends JPanel{
	static final int WIDTH = 400;//宽度变量
	static final int HEIGHT =200;//关于高度变量
	JFrame leaderframe;//创建顶层窗口框架对象
	public void leadermanageframe() {
		leaderframe =new JFrame();//为对象studentframe赋值
		leaderframe.setTitle("领导信息管理系统");//设置标题
		//设置关闭方法
		leaderframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		leaderframe.setSize(WIDTH, HEIGHT);//设置顶层窗口框架对象大小
		//创建对象kit，实现窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		leaderframe.setLocation(x, y);//设置对象位置
		leaderframe.setVisible(true);//设置对象可显示
		leaderframe.add(this, BorderLayout.CENTER);
		//创建各种按钮对象
		JButton computerleader = new JButton("计算机系教师信息系统");
		JButton bioleader = new JButton("生物系教师信息系统");
		JButton mechleader = new JButton("机械系教师信息系统");
		JButton schoolleader = new JButton("学校领导信息系统");
	
		//创建各种标签对象
		JLabel title = new JLabel("领导信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//创建布局管理器对象lay
		setLayout(lay);//设置布局管理器
		//创建并设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=2;
		constraints.weighty=2;
		JPanel jp = new JPanel();//创建标签对象jp
		jp.setLayout(new GridLayout(1,3));//设置对象jp的布局管理器
		//添加各种对象到对象jp里
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//添加对象jp到对象studentframe
		leaderframe.add(jp,BorderLayout.NORTH);
		//通过调用方法add实现利用网格组布局添加控件
		add(computerleader,constraints,0,0,1,1);
		add(bioleader,constraints,0,1,1,1);
		add(mechleader,constraints,1,0,1,1);
		add(schoolleader,constraints,1,1,1,1);
//		单击这个按钮，进入到计算机系领导信息系统
		computerleader.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty<>'教师'and major = '计算机系'";
				Leaderinfo teacherinfomation = new Leaderinfo("计算机系领导信息系统",sql);
			}
		});
//		单击这个按钮，进入到生物系领导信息系统
		bioleader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty<>'教师' and major = '生物系'";
				@SuppressWarnings("unused")
				Leaderinfo teacherinfomation = new Leaderinfo("生物系领导信息系统",sql);
			}
		});
//		单击这个按钮，进入到机械系领导信息系统
		mechleader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty<>'教师' and major = '机械系'";
				@SuppressWarnings("unused")
				Leaderinfo teacherinfomation = new Leaderinfo("机械系领导信息系统",sql);
			}
		});
//		单击这个按钮，进入到学校领导信息系统
		schoolleader.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty<>'教师' and major = '学校'";
				Leaderinfo teacherinfomation = new Leaderinfo("学校领导信息系统",sql);
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
