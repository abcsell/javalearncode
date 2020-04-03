package schoolmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//����һ����ʦ��Ϣϵͳ����ڿ����
@SuppressWarnings("serial")
public class Teachermanageframe  extends JPanel{
	static final int WIDTH = 400;//��ȱ���
	static final int HEIGHT =200;//���ڸ߶ȱ���
	JFrame teacherframe;//�������㴰�ڿ�ܶ���
	@SuppressWarnings("unused")
	public void teachermanageframe() {
		teacherframe =new JFrame();//Ϊ����studentframe��ֵ
		teacherframe.setTitle("��ʦ��Ϣ����ϵͳ");//���ñ���
		//���ùرշ���
		teacherframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		teacherframe.setSize(WIDTH, HEIGHT);//���ö��㴰�ڿ�ܶ����С
		//��������kit��ʵ�ִ��ھ�����ʾ
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		teacherframe.setLocation(x, y);//���ö���λ��
		teacherframe.setVisible(true);//���ö������ʾ
		teacherframe.add(this, BorderLayout.CENTER);
		//�������ְ�ť����
		JButton computerteacher = new JButton("�����ϵ��ʦ��Ϣϵͳ");
		JButton bioteacher = new JButton("����ϵ��ʦ��Ϣϵͳ");
		JButton mechteacher = new JButton("��еϵ��ʦ��Ϣϵͳ");
		JButton beretun = new JButton("����");
	
		//�������ֱ�ǩ����
		JLabel title = new JLabel("��ʦ��Ϣϵͳ������");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();//�������ֹ���������lay
		setLayout(lay);//���ò��ֹ�����
		//���������ö���constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx=1;
		constraints.weighty=4;
		JPanel jp = new JPanel();//������ǩ����jp
		jp.setLayout(new GridLayout(1,3));//���ö���jp�Ĳ��ֹ�����
		//��Ӹ��ֶ��󵽶���jp��
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		//��Ӷ���jp������studentframe
		teacherframe.add(jp,BorderLayout.NORTH);
		//ͨ�����÷���addʵ�����������鲼����ӿؼ�
		add(computerteacher,constraints,0,1,1,1);
		add(bioteacher,constraints,0,4,1,1);
		add(mechteacher,constraints,1,1,1,1);
//		���������ť�����뵽�����ϵ��ʦ��Ϣϵͳ
		computerteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty='��ʦ'and major = '�����ϵ'";
				Teacherinfo teacherinfomation = new Teacherinfo("�����ϵ��ʦ��Ϣϵͳ",sql);
			}
		});
//		���������ť�����뵽����ϵ��ʦ��Ϣϵͳ
		bioteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty='��ʦ'and major = '����ϵ'";
				Teacherinfo teacherinfomation = new Teacherinfo("����ϵ��ʦ��Ϣϵͳ",sql);
			}
		});
//		���������ť�����뵽��еϵ��ʦ��Ϣϵͳ
		mechteacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				String sql = "select * from teacherinfo where duty='��ʦ'and major = '��еϵ'";
				Teacherinfo teacherinfomation = new Teacherinfo("��еϵ��ʦ��Ϣϵͳ",sql);
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
