package schoolmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//创建一个教师信息系统的入口框架类
@SuppressWarnings("serial")
public class Teachermanageframe  extends JPanel{
	static final int WIDTH = 400;//宽度变量
	static final int HEIGHT =200;//关于高度变量
	JFrame teacherframe;//创建顶层窗口框架对象
	@SuppressWarnings("unused")
	public void teachermanageframe() {
		teacherframe =new JFrame();//为对象studentframe赋值
		teacherframe.setTitle("教师信息管理系统");//设置标题
		//设置关闭方法
		teacherframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teacherframe.setSize(WIDTH, HEIGHT);//设置顶层窗口框架对象大小
		//创建对象kit，实现窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		teacherframe.setLocation(x, y);//设置对象位置
		teacherframe.setVisible(true);//设置对象可显示
		teacherframe.add(this, BorderLayout.CENTER);
		//创建各种按钮对象
		JButton computerteacher = new JButton("计算机系教师信息系统");
		JButton bioteacher = new JButton("生物系教师信息系统");
		JButton mechteacher = new JButton("机械系教师信息系统");
		JButton beretun = new JButton("返回");
	
		//创建各种标签对象
		JLabel title = new JLabel("教师信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//创建布局管理器对象lay
		setLayout(lay);//设置布局管理器
		//创建并设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=1;
		constraints.weighty=4;
		JPanel jp = new JPanel();//创建标签对象jp
		jp.setLayout(new GridLayout(1,3));//设置对象jp的布局管理器
		//添加各种对象到对象jp里
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//添加对象jp到对象studentframe
		teacherframe.add(jp,BorderLayout.NORTH);
		//通过调用方法add实现利用网格组布局添加控件
		add(computerteacher,constraints,0,1,1,1);
		add(bioteacher,constraints,0,4,1,1);
		add(mechteacher,constraints,1,1,1,1);
//		单击这个按钮，进入到计算机系教师信息系统
		computerteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty='教师'and major = '计算机系'";
				Teacherinfo teacherinfomation = new Teacherinfo("计算机系教师信息系统",sql);
			}
		});
//		单击这个按钮，进入到生物系教师信息系统
		bioteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty='教师'and major = '生物系'";
				Teacherinfo teacherinfomation = new Teacherinfo("生物系教师信息系统",sql);
			}
		});
//		单击这个按钮，进入到机械系教师信息系统
		mechteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				String sql = "select * from teacherinfo where duty='教师'and major = '机械系'";
				Teacherinfo teacherinfomation = new Teacherinfo("机械系教师信息系统",sql);
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
