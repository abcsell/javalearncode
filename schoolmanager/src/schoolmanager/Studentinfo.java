package schoolmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.Vector;
public class Studentinfo extends JPanel{//���ѧ������Ϣϵͳ�Ŀ����
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
	final JTextField gradeinput;
	final JTextField majorinput;
	//�������㴰�ڿ�ܶ���studentinfoframe
	JFrame studentinfoframe;
	Storesystem store = new Storesystem();//�����洢��������
	Connection con = store.getConnection();//��ȡ���ݿ����Ӷ���
//	Addframe af = new Addframe();
	Addframe af1;
	//������ӷ���
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c,constraints);
	}
	public Studentinfo(String str,String sql) {//���캯��
		studentinfoframe = new JFrame();//����ֵ
		studentinfoframe.setTitle(str);//���ñ���
		//���ùرշ���
		studentinfoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentinfoframe.setSize(WIDTH, HEIGHT);//���ô��ڴ�С
		//���������ö���kit����ʹ���������ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentinfoframe.setLocation(x, y);//����λ��
		studentinfoframe.setVisible(true);//������ʾ
		studentinfoframe.add(this,BorderLayout.CENTER);//�������ֹ�����
		GridBagLayout lay = new GridBagLayout();//���ò��ֹ�����
		setLayout(lay);
		//���������ø��ֱ�ǩ����
		JLabel name = new JLabel("����");
		JLabel code = new JLabel("ѧ��");
		JLabel sexy = new JLabel("�Ա�");
		JLabel age = new JLabel("����");
		JLabel birthday = new JLabel("��������");
		JLabel address = new JLabel("��ͥ��ַ");
		JLabel grade = new JLabel("�༶");
		JLabel major = new JLabel("רҵ");
		JLabel title = new JLabel(str);
		//���������������
		nameinput =new JComboBox();
		codeinput =new JTextField(10);
		sexyinput =new JTextField(10);
		ageinput =new JTextField(10);
		birthdayinput =new JTextField(10);
		addressinput =new JTextField(10);
		gradeinput =new JTextField(10);
		majorinput =new JTextField(10);
		Vector vec = store.getstudent(con, sql);//��ȡ��������
		//���洢��vector�е�������ȡ�������¸�ֵ��ѧ������������ѧ�������е�
		//getname������ȡ��ѧ�������������ʹ������б�����ӹ��ܽ���Щ�������
		//���б���
		for(int i = 0;i<vec.size();i++) {
			Student one = (Student) vec.get(i);
			String nameselect = one.getName();
			nameinput.addItem(nameselect);
		}
		//��ȡ���������ı����е�����
		String namestring = (String) nameinput.getSelectedItem();
		Student p = store.getobject(con, namestring);
		String inputcode = p.getCode();
		String inputsexy = p.getSexy();
		String inputage = p.getAge();
		String inputbirthday = p.getBirthday();
		String inputaddress = p.getAddress();
		String inputgrade = p.getGrade();
		String inputmajor = p.getMajor();
		//���ø������������
		codeinput.setText(inputcode);
		sexyinput.setText(inputsexy);
		ageinput.setText(inputage);
		birthdayinput.setText(inputbirthday);
		addressinput.setText(inputaddress);
		gradeinput.setText(inputgrade);
		majorinput.setText(inputmajor);
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
		add(grade,constraints,2,3,1,1);
		add(major,constraints,2,4,1,1);
		add(birthdayinput,constraints,3,1,1,1);
		add(addressinput,constraints,3,2,1,1);
		add(gradeinput,constraints,3,3,1,1);
		add(majorinput,constraints,3,4,1,1);
		add(addition,constraints,0,5,1,1);
		add(delete,constraints,1,5,1,1);
		add(update,constraints,2,5,1,1);
		add(bereturn,constraints,3,5,1,1);
		//ͨ������ÿһ���б���е����֣�����Ӧ����ʾ�������ֵ�������Ϣ
		nameinput.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String namestring = (String) nameinput.getSelectedItem();
				Student p = store.getobject(con, namestring);
				String inputcode = p.getCode();
				String inputsexy = p.getSexy();
				String inputage = p.getAge();
				String inputbirthday = p.getBirthday();
				String inputaddress = p.getAddress();
				String inputgrade = p.getGrade();
				String inputmajor = p.getMajor();
				codeinput.setText(inputcode);
				sexyinput.setText(inputsexy);
				ageinput.setText(inputage);
				birthdayinput.setText(inputbirthday);
				addressinput.setText(inputaddress);
				gradeinput.setText(inputgrade);
				majorinput.setText(inputmajor);
			}
		});
		//�������˵�
		bereturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				Studentmanageframe manageframe = new Studentmanageframe();
				manageframe.setVisible(true);
				studentinfoframe.dispose();
			}
		});
		//�������������
		addition.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Addframe addfr = new Addframe();
				addfr.setVisible(true);
			}
		});
		//���°�ť��ʹ�����ݿ���н�������ȡ��ʾ��������
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
			
				String name1=af1.ss.getName();
				   String code1= af1.ss.getCode();
	                String age1= af1.ss.getAge();
	                String sexy1= af1.ss.getSexy();
	                String birthday1= af1.ss.getBirthday();
	                String address1= af1.ss.getAddress();
	                String grade1= af1.ss.getGrade();
	                String major1= af1.ss.getMajor();             
	                nameinput.addItem(name1);
	                nameinput.setSelectedItem(name1);
	                codeinput.setText(code1);
	                ageinput.setText(age1);
	                sexyinput.setText(sexy1);
	                addressinput.setText(address1);
	                birthdayinput.setText(birthday1);
	                gradeinput.setText(grade1);
	                majorinput.setText(major1);
			}
		});
		///ɾ�����ݣ��Ҹ��µ����ݿ���
        delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {
                String namestring=(String)nameinput.getSelectedItem();
                Storesystem store=new Storesystem();
                try
                {
                    Connection con=store.getConnection(); 
                    Statement st=con.createStatement();
                    String sql="delete * from studentinfo where='"+namestring+"'";
                    st.executeUpdate(sql);
                }
                catch(Exception e){}
                nameinput.removeItem(namestring);
            }
             
        });
    
	}
}
