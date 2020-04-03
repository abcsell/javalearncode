package schoolmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Addframe2 extends JPanel{
	//创建教师信息系统添加信息框架类
		//创建各种成员变量
		String codetext;
		String agetext;
		String sexytext;
		String birthdaytext;
		String addresstext;
		String salarytext;
		String majortext;
		String dutytext;
		public final JTextField nameinput = new JTextField(10);
		static final int WIDTH =700;//创建宽度变量
		static final int HEIGHT =400;//创建高度变量
		static Teacher ss;//创建学生对象变量
		JFrame teacheraddframe;//创建信息框架类对象
		//关于添加方法
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w, int h) {
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight =h;
			add(c,constraints);
		}
		public Addframe2() {//构造函数
			teacheraddframe = new JFrame();//为对象studentadfframe赋值
			//设置标题
			teacheraddframe.setTitle("教师添加系统");
			//设置关闭方法
			teacheraddframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teacheraddframe.setSize(WIDTH, HEIGHT);//设置窗口大小
			//创建和设置对象kit，并使组件居中显示
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			teacheraddframe.setLocation(x, y);
			teacheraddframe.setVisible(true);//设置窗口可显示
			//添加窗口到框架对象中
			teacheraddframe.add(this,BorderLayout.CENTER);
			//创建和设置布局管理器对象
			GridBagLayout lay = new GridBagLayout();
			setLayout(lay);
			//创建各种标签
			JLabel name = new JLabel("姓名");
			JLabel code = new JLabel("工号");
			JLabel sexy = new JLabel("性别");
			JLabel age = new JLabel("年龄");
			JLabel birthday = new JLabel("出生年月");
			JLabel address = new JLabel("家庭地址");
			JLabel salary = new JLabel("薪水");
			JLabel major = new JLabel("专业");
			JLabel duty = new JLabel("职务");
			//创建和设置各种输入文本框
		final JTextField	nameinput =new JTextField(10);
		final JTextField	codeinput =new JTextField(10);
		final JTextField	sexyinput =new JTextField(10);
		final JTextField	ageinput =new JTextField(10);
		final JTextField	birthdayinput =new JTextField(10);
		final JTextField	addressinput =new JTextField(10);
		final JTextField	salaryinput =new JTextField(10);
		final JTextField	majorinput =new JTextField(10);
		final JTextField	dutyinput =new JTextField(10);
		//创建标题标签
		JLabel title = new JLabel("教师被添加的基本信息");
		JButton additionbutton = new JButton("添加");//创建按钮对象additionbutton
		//创建和设置布局管理器对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx=4;
		constraints.weighty=7;
		//添加各种控件到网格组布局中
		add(title,constraints,0,0,4,1);
		add(name,constraints,0,1,1,1);
		add(code,constraints,0,2,1,1);
		add(sexy,constraints,0,3,1,1);
		add(age,constraints,0,4,1,1);
		add(nameinput,constraints,1,1,1,1);
		add(codeinput,constraints,1,2,1,1);
		add(sexyinput,constraints,1,3,1,1);
		add(ageinput,constraints,1,4,1,1);
		add(birthday,constraints,2,1,1,1);
		add(address,constraints,2,2,1,1);
		add(salary,constraints,2,3,1,1);
		add(major,constraints,2,4,1,1);
		add(duty,constraints,0,5,1,1);
		add(birthdayinput,constraints,3,1,1,1);
		add(addressinput,constraints,3,2,1,1);
		add(salaryinput,constraints,3,3,1,1);
		add(dutyinput,constraints,1,5,1,1);
		add(majorinput,constraints,3,4,1,1);
		add(additionbutton,constraints,0,6,4,1);
		//将每个文本域中的信息赋值给变量，再将变量以值的形式存储到数据库的表中
		//最后，再将这些值存储到教师对象中，并且这个教师该对象是一个静态的对象
		additionbutton.addActionListener(new ActionListener() {
			
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			public void actionPerformed(ActionEvent Event) {
				try {
					String nametext = nameinput.getText();
					codetext = codeinput.getText();
					agetext = ageinput.getText();
					sexytext = sexyinput.getText();
					birthdaytext = birthdayinput.getText();
					addresstext = addressinput.getText();
					salarytext = salaryinput.getText();
					dutytext = dutyinput.getText();
					majortext = majorinput.getText();
					Storesystem2 store = new Storesystem2();
					Connection con = store.getConnection();
					Statement st = con.createStatement();
					String sql ="insert into teacherinfo values('"+nametext+"','"+codetext+"','"+sexytext+"','"+birthdaytext+"','"+addresstext+"','"+agetext+"','"+salarytext+"','"+majortext+"','"+dutytext+"')";
					st.executeUpdate(sql);
					ss=new Teacher(nametext, codetext);
					ss.setAge(agetext);
					ss.setSexy(sexytext);
					ss.setAddress(addresstext);
					ss.setBirthday(birthdaytext);
					ss.setSalary(salarytext);
					ss.setMajor(majortext);
					ss.setDuty(dutytext);
					Vector vec = new Vector();
					vec.add(ss);
				}catch(Exception e) {
					
				}
				teacheraddframe.dispose();
			}
		});
		}
}
