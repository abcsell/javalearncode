package schoolmanager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Vector;

public class Addframe extends JPanel{
//����ѧ����Ϣϵͳ�����Ϣ�����
	//�������ֳ�Ա����
	String codetext;
	String agetext;
	String sexytext;
	String birthdaytext;
	String addresstext;
	String gradetext;
	String majortext;
	public final JTextField nameinput = new JTextField(10);
	static final int WIDTH =700;//������ȱ���
	static final int HEIGHT =400;//�����߶ȱ���
	static Student ss;//����ѧ���������
	JFrame studentaddframe;//������Ϣ��������
	//������ӷ���
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight =h;
		add(c,constraints);
	}
	public Addframe() {//���캯��
		studentaddframe = new JFrame();//Ϊ����studentadfframe��ֵ
		//���ñ���
		studentaddframe.setTitle("ѧ�����ϵͳ");
		//���ùرշ���
		studentaddframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentaddframe.setSize(WIDTH, HEIGHT);//���ô��ڴ�С
		//���������ö���kit����ʹ���������ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentaddframe.setLocation(x, y);
		studentaddframe.setVisible(true);//���ô��ڿ���ʾ
		//��Ӵ��ڵ���ܶ�����
		studentaddframe.add(this,BorderLayout.CENTER);
		//���������ò��ֹ���������
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		//�������ֱ�ǩ
		JLabel name = new JLabel("����");
		JLabel code = new JLabel("ѧ��");
		JLabel sexy = new JLabel("�Ա�");
		JLabel age = new JLabel("����");
		JLabel birthday = new JLabel("��������");
		JLabel address = new JLabel("��ͥ��ַ");
		JLabel grade = new JLabel("�༶");
		JLabel major = new JLabel("רҵ");
		//���������ø��������ı���
	final JTextField	nameinput =new JTextField(10);
	final JTextField	codeinput =new JTextField(10);
	final JTextField	sexyinput =new JTextField(10);
	final JTextField	ageinput =new JTextField(10);
	final JTextField	birthdayinput =new JTextField(10);
	final JTextField	addressinput =new JTextField(10);
	final JTextField	gradeinput =new JTextField(10);
	final JTextField	majorinput =new JTextField(10);
	//���������ǩ
	JLabel title = new JLabel("ѧ������ӵĻ�����Ϣ");
	JButton additionbutton = new JButton("���");//������ť����additionbutton
	//���������ò��ֹ���������constraints
	GridBagConstraints constraints = new GridBagConstraints();
	constraints.fill = GridBagConstraints.NONE;
	constraints.weightx=4;
	constraints.weighty=6;
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
	add(grade,constraints,2,3,1,1);
	add(major,constraints,2,4,1,1);
	add(birthdayinput,constraints,3,1,1,1);
	add(addressinput,constraints,3,2,1,1);
	add(gradeinput,constraints,3,3,1,1);
	add(majorinput,constraints,3,4,1,1);
	add(additionbutton,constraints,0,5,4,1);
	//��ÿ���ı����е���Ϣ��ֵ���������ٽ�������ֵ����ʽ�洢�����ݿ�ı���
	//����ٽ���Щֵ�洢��ѧ�������У��������ѧ��ö�����һ����̬�Ķ���
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
