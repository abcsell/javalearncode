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
	//������ʦ��Ϣϵͳ�����Ϣ�����
		//�������ֳ�Ա����
		String codetext;
		String agetext;
		String sexytext;
		String birthdaytext;
		String addresstext;
		String salarytext;
		String majortext;
		String dutytext;
		public final JTextField nameinput = new JTextField(10);
		static final int WIDTH =700;//������ȱ���
		static final int HEIGHT =400;//�����߶ȱ���
		static Teacher ss;//����ѧ���������
		JFrame teacheraddframe;//������Ϣ��������
		//������ӷ���
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w, int h) {
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight =h;
			add(c,constraints);
		}
		public Addframe2() {//���캯��
			teacheraddframe = new JFrame();//Ϊ����studentadfframe��ֵ
			//���ñ���
			teacheraddframe.setTitle("��ʦ���ϵͳ");
			//���ùرշ���
			teacheraddframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teacheraddframe.setSize(WIDTH, HEIGHT);//���ô��ڴ�С
			//���������ö���kit����ʹ���������ʾ
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			teacheraddframe.setLocation(x, y);
			teacheraddframe.setVisible(true);//���ô��ڿ���ʾ
			//��Ӵ��ڵ���ܶ�����
			teacheraddframe.add(this,BorderLayout.CENTER);
			//���������ò��ֹ���������
			GridBagLayout lay = new GridBagLayout();
			setLayout(lay);
			//�������ֱ�ǩ
			JLabel name = new JLabel("����");
			JLabel code = new JLabel("����");
			JLabel sexy = new JLabel("�Ա�");
			JLabel age = new JLabel("����");
			JLabel birthday = new JLabel("��������");
			JLabel address = new JLabel("��ͥ��ַ");
			JLabel salary = new JLabel("нˮ");
			JLabel major = new JLabel("רҵ");
			JLabel duty = new JLabel("ְ��");
			//���������ø��������ı���
		final JTextField	nameinput =new JTextField(10);
		final JTextField	codeinput =new JTextField(10);
		final JTextField	sexyinput =new JTextField(10);
		final JTextField	ageinput =new JTextField(10);
		final JTextField	birthdayinput =new JTextField(10);
		final JTextField	addressinput =new JTextField(10);
		final JTextField	salaryinput =new JTextField(10);
		final JTextField	majorinput =new JTextField(10);
		final JTextField	dutyinput =new JTextField(10);
		//���������ǩ
		JLabel title = new JLabel("��ʦ����ӵĻ�����Ϣ");
		JButton additionbutton = new JButton("���");//������ť����additionbutton
		//���������ò��ֹ���������constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx=4;
		constraints.weighty=7;
		//��Ӹ��ֿؼ��������鲼����
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
		//��ÿ���ı����е���Ϣ��ֵ���������ٽ�������ֵ����ʽ�洢�����ݿ�ı���
		//����ٽ���Щֵ�洢����ʦ�����У����������ʦ�ö�����һ����̬�Ķ���
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
