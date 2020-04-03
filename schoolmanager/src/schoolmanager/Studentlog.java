package schoolmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Login extends JPanel{//登录类，设计成一个继承容器的类
	static final int WIDTH =300;//设计整个顶层框架的宽度
	static final int HEIGHT =150;//高度
	JFrame loginframe;
	//创建按照网格组布局方式排列组件的方法
	public void add(Component c, GridBagConstraints constraints,int x,int y, int w, int h) {
		constraints.gridx  = x;//设置控件位于第几列
		constraints.gridy =  y;//设置控件位于第几行
		constraints.gridwidth = w;//设置控件需要占几列
		constraints.gridheight = h;//设置控件需要占几行
		add(c,constraints);
	}
	void login(){//用来实现添加控件到容器的构造方法
		//创建界面的框架
		loginframe = new JFrame("信息管理系统");
		//设置窗口上面的关闭控件有效的类库方法
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//创建网格组布局管理器的对象
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);//设置布局管理器
		//添加当前对象到登录页面
		loginframe.add(this,BorderLayout.WEST);
		loginframe.setSize(WIDTH, HEIGHT);//设置登录页面的大小
		//用来实现居中显示功能	
		Toolkit kit = Toolkit.getDefaultToolkit();//获取Toolkit类对象
		//获取屏幕大小对象
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;//获取屏幕的宽度
		int height = screenSize.height;//获取屏幕的高度
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		loginframe.setLocation(x, y);//设置位置
		JButton ok = new JButton("登录");//创建登录按钮
		JButton cancel = new JButton("放弃");//创建放弃按钮
		//创建标签对象title
		JLabel title = new JLabel("信息系统登陆窗口");
		JLabel name = new JLabel("用户名");//创建用户名标签
		JLabel password = new JLabel("密码");//创建密码标签
		//创建关于用户名和密码的文本输入框
		final JTextField nameinput = new JTextField(15);
		final JTextField passwordinput = new JTextField(15);
		//创建关于网格组布局对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		//设置对象constraints的相关属性
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		//使用网格组布局添加控件
		add(title,constraints,0,0,4,1);
		add(name,constraints,0,1,1,1);
		add(password,constraints,0,2,1,1);
		add(nameinput,constraints,2,1,1,1);
		add(passwordinput,constraints,2,2,1,1);
		add(ok,constraints,0,3,1,1);
		add(cancel,constraints,2,3,1,1);
		loginframe.setResizable(false);
		loginframe.setVisible(true);//使界面显示
		//为“ok”按钮注册事件
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// 获取用户名输入框的内容
				String nametext = nameinput.getText();
				//获取密码输入框的内
				String passwordtext = passwordinput.getText();
				//创建关于密码的字符串
				String str = new String(passwordtext);
				//判断关于用户的姓名和密码
				boolean x = (nametext.equals("admin"));
				boolean y = (str.equals("123456"));
				boolean z = (x && y);
				if(z == true) {//当登录成功时
					loginframe.dispose();
					@SuppressWarnings("unused")
					Mainframe main = new Mainframe();
					main.mainframe();//案例的代码没有调用这个方法，根本起不来
				}else if(z == false) {//当登录失败时
					nameinput.setText("");
					passwordinput.setText("");
				}
			}
		});
		//为cancel按钮注册事件
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO 自动生成的方法存根
				loginframe.dispose();
			}
		});
	}
}
public class Studentlog {//设置学生登录类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Login log = new Login();
		log.login();
	}

}
