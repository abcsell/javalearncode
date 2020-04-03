package schoolmanager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
@SuppressWarnings("serial")
public class Leadermanageframe extends JPanel{
	static final int WIDTH = 400;//��ȱ���
	static final int HEIGHT =200;//���ڸ߶ȱ���
	JFrame leaderframe;//�������㴰�ڿ�ܶ���
	public void leadermanageframe() {
		leaderframe =new JFrame();//Ϊ����studentframe��ֵ
		leaderframe.setTitle("�쵼��Ϣ����ϵͳ");//���ñ���
		//���ùرշ���
		leaderframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		leaderframe.setSize(WIDTH, HEIGHT);//���ö��㴰�ڿ�ܶ����С
		//��������kit��ʵ�ִ��ھ�����ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		leaderframe.setLocation(x, y);//���ö���λ��
		leaderframe.setVisible(true);//���ö������ʾ
		leaderframe.add(this, BorderLayout.CENTER);
		//�������ְ�ť����
		JButton computerleader = new JButton("�����ϵ��ʦ��Ϣϵͳ");
		JButton bioleader = new JButton("����ϵ��ʦ��Ϣϵͳ");
		JButton mechleader = new JButton("��еϵ��ʦ��Ϣϵͳ");
		JButton schoolleader = new JButton("ѧУ�쵼��Ϣϵͳ");
	
		//�������ֱ�ǩ����
		JLabel title = new JLabel("�쵼��Ϣϵͳ������");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//�������ֹ���������lay
		setLayout(lay);//���ò��ֹ�����
		//���������ö���constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=2;
		constraints.weighty=2;
		JPanel jp = new JPanel();//������ǩ����jp
		jp.setLayout(new GridLayout(1,3));//���ö���jp�Ĳ��ֹ�����
		//��Ӹ��ֶ��󵽶���jp��
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//��Ӷ���jp������studentframe
		leaderframe.add(jp,BorderLayout.NORTH);
		//ͨ�����÷���addʵ�����������鲼����ӿؼ�
		add(computerleader,constraints,0,0,1,1);
		add(bioleader,constraints,0,1,1,1);
		add(mechleader,constraints,1,0,1,1);
		add(schoolleader,constraints,1,1,1,1);
//		���������ť�����뵽�����ϵ�쵼��Ϣϵͳ
		computerleader.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty<>'��ʦ'and major = '�����ϵ'";
				Leaderinfo teacherinfomation = new Leaderinfo("�����ϵ�쵼��Ϣϵͳ",sql);
			}
		});
//		���������ť�����뵽����ϵ�쵼��Ϣϵͳ
		bioleader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty<>'��ʦ' and major = '����ϵ'";
				@SuppressWarnings("unused")
				Leaderinfo teacherinfomation = new Leaderinfo("����ϵ�쵼��Ϣϵͳ",sql);
			}
		});
//		���������ť�����뵽��еϵ�쵼��Ϣϵͳ
		mechleader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty<>'��ʦ' and major = '��еϵ'";
				@SuppressWarnings("unused")
				Leaderinfo teacherinfomation = new Leaderinfo("��еϵ�쵼��Ϣϵͳ",sql);
			}
		});
//		���������ť�����뵽ѧУ�쵼��Ϣϵͳ
		schoolleader.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty<>'��ʦ' and major = 'ѧУ'";
				Leaderinfo teacherinfomation = new Leaderinfo("ѧУ�쵼��Ϣϵͳ",sql);
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
