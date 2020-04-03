package schoolmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import java.sql.*;
import java.util.Vector;

public class Teacherinfo extends JPanel{//��ƽ�ʦ����Ϣϵͳ�Ŀ����
	//�������ֳ�Ա����
		static final int WIDTH =700;
		static final int HEIGHT =400;
		//���������������
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
		//�������㴰�ڿ�ܶ���teacherinfoframe
		JFrame teacherinfoframe;
		Storesystem2 store = new Storesystem2();//�����洢��������
		Connection con = store.getConnection();//��ȡ���ݿ����Ӷ���
//		Addframe2 af = new Addframe2();
		Addframe2 af2;
		//������ӷ���
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h) {
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight = h;
			add(c,constraints);
		}
		public Teacherinfo(String str,String sql) {//���캯��
			teacherinfoframe = new JFrame();//����ֵ
			teacherinfoframe.setTitle(str);//���ñ���
			//���ùرշ���
			teacherinfoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teacherinfoframe.setSize(WIDTH, HEIGHT);//���ô��ڴ�С
			//���������ö���kit����ʹ���������ʾ
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			teacherinfoframe.setLocation(x, y);//����λ��
			teacherinfoframe.setVisible(true);//������ʾ
			teacherinfoframe.add(this,BorderLayout.CENTER);//�������ֹ�����
			GridBagLayout lay = new GridBagLayout();//���ò��ֹ�����
			setLayout(lay);
			//���������ø��ֱ�ǩ����
			JLabel name = new JLabel("����");
			JLabel code = new JLabel("����");
			JLabel sexy = new JLabel("�Ա�");
			JLabel age = new JLabel("����");
			JLabel birthday = new JLabel("��������");
			JLabel address = new JLabel("��ͥ��ַ");
			JLabel salary = new JLabel("нˮ");
			JLabel major = new JLabel("רҵ");
			JLabel duty = new JLabel("ְ��");
			JLabel title = new JLabel(str);
			//���������������
			nameinput =new JComboBox();
			codeinput =new JTextField(10);
			sexyinput =new JTextField(10);
			ageinput =new JTextField(10);
			birthdayinput =new JTextField(10);
			addressinput =new JTextField(10);
			salaryinput =new JTextField(10);
			majorinput =new JTextField(10);
			dutyinput =new JTextField(10);
			Vector vec = store.getteacher(con, sql);//��ȡ��������
			//���洢��vector�е�������ȡ�������¸�ֵ����ʦ���������ý�ʦ�����е�
			//getname������ȡ����ʦ�����������ʹ������б�����ӹ��ܽ���Щ�������
			//���б���
			for(int i = 0;i<vec.size();i++) {
				Teacher one = (Teacher) vec.get(i);
				String nameselect = one.getName();
				nameinput.addItem(nameselect);
			}
			//��ȡ���������ı����е�����
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
			//���ø������������
			codeinput.setText(inputcode);
			sexyinput.setText(inputsexy);
			ageinput.setText(inputage);
			birthdayinput.setText(inputbirthday);
			addressinput.setText(inputaddress);
			salaryinput.setText(inputsalary);
			majorinput.setText(inputmajor);
			dutyinput.setText(inputduty);
			//����4����ť����
			JButton addition = new JButton("���");
			JButton delete = new JButton("ɾ��");
			JButton update = new JButton("����");
			JButton bereturn = new JButton("����");
			//����������gridbagconstraints���͵Ĳ��ֹ���������constraints
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.fill=GridBagConstraints.NONE;
			constraints.weightx = 4;
			constraints.weighty =6;
			add(title,constraints,0,0,4,1);//ʹ�������鲼�����ӿؼ�
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
			//ͨ������ÿһ���б���е����֣�����Ӧ����ʾ�������ֵ�������Ϣ
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
			//�������˵�
			bereturn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent Event) {
					// TODO �Զ����ɵķ������
					Teachermanageframe manageframe = new Teachermanageframe();
					manageframe.setVisible(true);
					teacherinfoframe.dispose();
				}
			});
			//�������������
			addition.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO �Զ����ɵķ������
					Addframe2 addfr = new Addframe2();
					addfr.setVisible(true);
				}
			});
			//���°�ť��ʹ�����ݿ���н�������ȡ��ʾ��������
			update.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent Event) {
					// TODO �Զ����ɵķ������
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
			///ɾ�����ݣ��Ҹ��µ����ݿ���
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
