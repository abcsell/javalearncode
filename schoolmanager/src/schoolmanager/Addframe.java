package schoolmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class Addframe extends JPanel{
//创建学生信息系统添加信息框架类
	//创建各种成员变量
	String codetext;
	String agetext;
	String sexytext;
	String birthdaytext;
	String addresstext;
	String gradetext;
	String majortext;
	public final JTextField nameinput = new JTextField(10);
	static final int WIDTH =700;//创建宽度变量
	static final int HEIGHT =400;//创建高度变量
	static Student ss;//创建学生对象变量
	JFrame studentaddframe;//创建信息框架类对象
	//关于添加方法
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight =h;
		add(c,constraints);
	}
	public Addframe() {//构造函数
		studentaddframe = new JFrame();//为对象studentadfframe赋值
		//设置标题
		studentaddframe.setTitle("学生添加系统");
		//设置关闭方法
		studentaddframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentaddframe.setSize(WIDTH, HEIGHT);//设置窗口大小
		//创建和设置对象kit，并使组件居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentaddframe.setLocation(x, y);
		studentaddframe.setVisible(true);//设置窗口可显示
		//添加窗口到框架对象中
		studentaddframe.add(this,BorderLayout.CENTER);
		//创建和设置布局管理器对象
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		//创建各种标签
		JLabel name = new JLabel("姓名");
		JLabel code = new JLabel("学号");
		JLabel sexy = new JLabel("性别");
		JLabel age = new JLabel("年龄");
		JLabel birthday = new JLabel("出生年月");
		JLabel address = new JLabel("家庭地址");
		JLabel grade = new JLabel("班级");
		JLabel major = new JLabel("专业");
		//创建和设置各种输入文本框
	final JTextField	nameinput =new JTextField(10);
	final JTextField	codeinput =new JTextField(10);
	final JTextField	sexyinput =new JTextField(10);
	final JTextField	ageinput =new JTextField(10);
	final JTextField	birthdayinput =new JTextField(10);
	final JTextField	addressinput =new JTextField(10);
	final JTextField	gradeinput =new JTextField(10);
	final JTextField	majorinput =new JTextField(10);
	//创建标题标签
	JLabel title = new JLabel("学生被添加的基本信息");
	JButton additionbutton = new JButton("添加");//创建按钮对象additionbutton
	//创建和设置布局管理器对象constraints
	GridBagConstraints constraints = new GridBagConstraints();
	constraints.fill = GridBagConstraints.NONE;
	constraints.weightx=4;
	constraints.weighty=6;
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
	add(grade,constraints,2,3,1,1);
	add(major,constraints,2,4,1,1);
	add(birthdayinput,constraints,3,1,1,1);
	add(addressinput,constraints,3,2,1,1);
	add(gradeinput,constraints,3,3,1,1);
	add(majorinput,constraints,3,4,1,1);
	add(additionbutton,constraints,0,5,4,1);
	//将每个文本域中的信息赋值给变量，再将变量以值的形式存储到数据库的表中
	//最后，再将这些值存储到学生对象中，并且这个学神该对象是一个静态的对象
	additionbutton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent Event) {
			try {
				String nametext = nameinput.getText();
				String 	codetext = codeinput.getText();
				String 	agetext = ageinput.getText();
				String 	sexytext = sexyinput.getText();
				String 	birthdaytext = birthdayinput.getText();
				String 	addresstext = addressinput.getText();
				String 	gradetext = gradeinput.getText();
				String 	majortext = majorinput.getText();
				Storesystem store = new Storesystem();
				Connection con = store.getConnection();
				Statement st = con.createStatement();
				String sql ="insert into studentinfo values('"+nametext+"','"+codetext+"','"+sexytext+"','"+birthdaytext+"','"+addresstext+"','"+agetext+"','"+gradetext+"','"+majortext+"')";
				st.executeUpdate(sql);
				ss=new Student(nametext, codetext);
				ss.setAge(agetext);
				ss.setSexy(sexytext);
				ss.setAddress(addresstext);
				ss.setBirthday(birthdaytext);
				ss.setGrade(gradetext);
				ss.setMajor(majortext);
				Vector vec = new Vector();
				vec.add(ss);
			}catch(Exception e) {
				
			}
			studentaddframe.dispose();
		}
	});
	}
}
