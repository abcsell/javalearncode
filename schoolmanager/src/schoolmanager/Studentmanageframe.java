package schoolmanager;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Studentmanageframe extends JPanel{
	static final int WIDTH = 400;//��ȱ���
	static final int HEIGHT =200;//���ڸ߶ȱ���
	JFrame studentframe;//�������㴰�ڿ�ܶ���
	public static void main(String[] args) {
		Studentmanageframe er = new Studentmanageframe();
		er.studentmanageframe();
	}
	public void studentmanageframe() {
		studentframe =new JFrame();//Ϊ����studentframe��ֵ
		studentframe.setTitle("ѧ����Ϣ����ϵͳ");//���ñ���
		//���ùرշ���
		studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		studentframe.setSize(WIDTH, HEIGHT);//���ö��㴰�ڿ�ܶ����С
		//��������kit��ʵ�ִ��ھ�����ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentframe.setLocation(x, y);//���ö���λ��
		studentframe.setVisible(true);//���ö������ʾ
		studentframe.add(this, BorderLayout.CENTER);
		//�������ְ�ť����
		JButton computerone = new JButton("�����ϵһ��ѧ����Ϣϵͳ");
		JButton computertwo = new JButton("�����ϵ����ѧ����Ϣϵͳ");
		JButton computerthree = new JButton("�����ϵ����ѧ����Ϣϵͳ");
		JButton bioone = new JButton("����ϵһ��ѧ����Ϣϵͳ");
		JButton mechone = new JButton("��еϵһ��ѧ����Ϣϵͳ");
		JButton mechtwo = new JButton("��еϵ����ѧ����Ϣϵͳ");
		JButton mechthree = new JButton("��еϵ����ѧ����Ϣϵͳ");
		//�������ֱ�ǩ����
		JLabel title = new JLabel("ѧ����Ϣϵͳ������");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//�������ֹ���������lay
		setLayout(lay);//���ò��ֹ�����
		//���������ö���constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=2;
		constraints.weighty=5;
		JPanel jp = new JPanel();//������ǩ����jp
		jp.setLayout(new GridLayout(1,3));//���ö���jp�Ĳ��ֹ�����
		//��Ӹ��ֶ��󵽶���jp��
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//��Ӷ���jp������studentframe
		studentframe.add(jp,BorderLayout.NORTH);
		//ͨ�����÷���addʵ�����������鲼����ӿؼ�
		add(computerone,constraints,0,1,1,1);
		add(computertwo,constraints,0,2,1,1);
		add(computerthree,constraints,0,3,1,1);
		add(bioone,constraints,0,4,1,1);
		add(mechone,constraints,1,1,1,1);
		add(mechtwo,constraints,1,2,1,1);
		add(mechthree,constraints,1,3,1,1);
		//���������ť����������ϵһ��ѧ����Ϣϵͳ
		computerone.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='һ��' and major='�����ϵ'";
				Studentinfo info = new Studentinfo("�����ϵһ��ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť����������ϵ����ѧ����Ϣϵͳ
		computertwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='����' and major='�����ϵ'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("�����ϵ����ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť����������ϵ����ѧ����Ϣϵͳ
		computerthree.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='����' and major='�����ϵ'";
				Studentinfo info = new Studentinfo("�����ϵ����ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť����������ϵһ��ѧ����Ϣϵͳ
		bioone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='һ��' and major='����ϵ'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("����ϵһ��ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť�������еϵһ��ѧ����Ϣϵͳ
		mechone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='һ��' and major='��еϵ'";
				@SuppressWarnings("unused")
				Studentinfo info = new Studentinfo("��еϵһ��ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť�������еϵ����ѧ����Ϣϵͳ
		mechtwo.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from studentinfo where class='����' and major='��еϵ'";
				Studentinfo info = new Studentinfo("��еϵ����ѧ����Ϣϵͳ",sql);
			}
		});
		//���������ť�������еϵ����ѧ����Ϣϵͳ
				mechthree.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent Event) {
						// TODO �Զ����ɵķ������
						String sql = "select * from studentinfo where class='����' and major='��еϵ'";
						@SuppressWarnings("unused")
						Studentinfo info = new Studentinfo("��еϵ����ѧ����Ϣϵͳ",sql);
					}
				});
	}
	//������ӵķ���
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h) {
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=w;
		constraints.gridheight=h;
		add(c,constraints);
	}
}
