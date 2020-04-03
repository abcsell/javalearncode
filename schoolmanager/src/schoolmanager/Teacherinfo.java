package schoolmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import java.sql.*;
import java.util.Vector;

public class Teacherinfo extends JPanel{//设计教师类信息系统的框架类
	//创建各种成员变量
		static final int WIDTH =700;
		static final int HEIGHT =400;
		//创建各种组件对象
		@SuppressWarnings("rawtypes")
		final JComboBox nameinput;
		final JTextField codeinput;
		final JTextField sexyinput;
		final JTextField birthdayinput;
		final JTextField ageinput;
		final JTextField addressinput;
		final JTextField salaryinput;
		final JTextField majorinput;
		final JTextField dutyinput;
		//创建顶层窗口框架对象teacherinfoframe
		JFrame teacherinfoframe;
		Storesystem2 store = new Storesystem2();//创建存储对象容器
		Connection con = store.getConnection();//获取数据库连接对象
//		Addframe2 af = new Addframe2();
		Addframe2 af2;
		//创建添加方法
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h) {
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight = h;
			add(c,constraints);
		}
		public Teacherinfo(String str,String sql) {//构造函数
			teacherinfoframe = new JFrame();//对象赋值
			teacherinfoframe.setTitle(str);//设置标题
			//设置关闭方法
			teacherinfoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teacherinfoframe.setSize(WIDTH, HEIGHT);//设置窗口大小
			//创建和设置对象kit，并使组件居中显示
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			teacherinfoframe.setLocation(x, y);//窗口位置
			teacherinfoframe.setVisible(true);//窗口显示
			teacherinfoframe.add(this,BorderLayout.CENTER);//创建布局管理器
			GridBagLayout lay = new GridBagLayout();//设置布局管理器
			setLayout(lay);
			//创建和设置各种标签对象
			JLabel name = new JLabel("姓名");
			JLabel code = new JLabel("工号");
			JLabel sexy = new JLabel("性别");
			JLabel age = new JLabel("年龄");
			JLabel birthday = new JLabel("出生年月");
			JLabel address = new JLabel("家庭地址");
			JLabel salary = new JLabel("薪水");
			JLabel major = new JLabel("专业");
			JLabel duty = new JLabel("职务");
			JLabel title = new JLabel(str);
			//创建各种组件对象
			nameinput =new JComboBox();
			codeinput =new JTextField(10);
			sexyinput =new JTextField(10);
			ageinput =new JTextField(10);
			birthdayinput =new JTextField(10);
			addressinput =new JTextField(10);
			salaryinput =new JTextField(10);
			majorinput =new JTextField(10);
			dutyinput =new JTextField(10);
			Vector vec = store.getteacher(con, sql);//获取容器对象
			//将存储在vector中的数据提取出来重新赋值给教师对象，再利用教师对象中的
			//getname方法提取出教师姓名来，最后使用组合列表框的添加功能将这些名字添加
			//到列表中
			for(int i = 0;i<vec.size();i++) {
				Teacher one = (Teacher) vec.get(i);
				String nameselect = one.getName();
				nameinput.addItem(nameselect);
			}
			//获取各种输入文本框中的内容
			String namestring = (String) nameinput.getSelectedItem();
			Teacher p = store.getobject(con, namestring);
			String inputcode = p.getCode();
			String inputsexy = p.getSexy();
			String inputage = p.getAge();
			String inputbirthday = p.getBirthday();
			String inputaddress = p.getAddress();
			String inputsalary = p.getSalary();
			String inputmajor = p.getMajor();
			String inputduty = p.getDuty();
			//设置各种组件的内容
			codeinput.setText(inputcode);
			sexyinput.setText(inputsexy);
			ageinput.setText(inputage);
			birthdayinput.setText(inputbirthday);
			addressinput.setText(inputaddress);
			salaryinput.setText(inputsalary);
			majorinput.setText(inputmajor);
			dutyinput.setText(inputduty);
			//创建4个按钮对象
			JButton addition = new JButton("添加");
			JButton delete = new JButton("删除");
			JButton update = new JButton("更新");
			JButton bereturn = new JButton("返回");
			//创建和设置gridbagconstraints类型的布局管理器对象constraints
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.fill=GridBagConstraints.NONE;
			constraints.weightx = 4;
			constraints.weighty =6;
			add(title,constraints,0,0,4,1);//使用网格组布局增加控件
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
			add(addition,constraints,0,6,1,1);
			add(delete,constraints,1,6,1,1);
			add(update,constraints,2,6,1,1);
			add(bereturn,constraints,3,6,1,1);
			//通过单击每一个列表框中的名字，会相应的显示出此名字的所有信息
			nameinput.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					String namestring = (String) nameinput.getSelectedItem();
					Teacher p = store.getobject(con, namestring);
					String inputcode = p.getCode();
					String inputsexy = p.getSexy();
					String inputage = p.getAge();
					String inputbirthday = p.getBirthday();
					String inputaddress = p.getAddress();
					String inputsalary = p.getSalary();
					String inputmajor = p.getMajor();
					String inputduty = p.getDuty();
					codeinput.setText(inputcode);
					sexyinput.setText(inputsexy);
					ageinput.setText(inputage);
					birthdayinput.setText(inputbirthday);
					addressinput.setText(inputaddress);
					salaryinput.setText(inputsalary);
					majorinput.setText(inputmajor);
					dutyinput.setText(inputduty);
				}
			});
			//返回主菜单
			bereturn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent Event) {
					// TODO 自动生成的方法存根
					Teachermanageframe manageframe = new Teachermanageframe();
					manageframe.setVisible(true);
					teacherinfoframe.dispose();
				}
			});
			//进入添加主界面
			addition.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					Addframe2 addfr = new Addframe2();
					addfr.setVisible(true);
				}
			});
			//更新按钮，使从数据库表中将数据提取显示到界面中
			update.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent Event) {
					// TODO 自动生成的方法存根
					String name1=af2.ss.getName();
					   String code1= af2.ss.getCode();
		                String age1= af2.ss.getAge();
		                String sexy1= af2.ss.getSexy();
		                String birthday1= af2.ss.getBirthday();
		                String address1= af2.ss.getAddress();
		                String salary1= af2.ss.getSalary();
		                String major1= af2.ss.getMajor();             
		                String duty1= af2.ss.getDuty();             
		                nameinput.addItem(name1);
		                nameinput.setSelectedItem(name1);
		                codeinput.setText(code1);
		                ageinput.setText(age1);
		                sexyinput.setText(sexy1);
		                addressinput.setText(address1);
		                birthdayinput.setText(birthday1);
		                salaryinput.setText(salary1);
		                majorinput.setText(major1);
		                dutyinput.setText(duty1);
				}
			});
			///删除数据，且更新到数据库中
	        delete.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	                String namestring=(String)nameinput.getSelectedItem();
	                Storesystem2 store=new Storesystem2();
	                try
	                {
	                    Connection con=store.getConnection(); 
	                    Statement st=con.createStatement();
	                    String sql="delete * from teacherinfo where='"+namestring+"'";
	                    st.executeUpdate(sql);
	                }
	                catch(Exception e){}
	                nameinput.removeItem(namestring);
	            }
	             
	        });
	    
		}

}
