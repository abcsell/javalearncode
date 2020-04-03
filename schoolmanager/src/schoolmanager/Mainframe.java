package schoolmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mainframe {//���������
	static final int WIDTH = 400;//���
	static final int HEIGHT = 200;//�߶�
	JFrame buttonframe;
	public void mainframe() {//���ڹ��캯��
		buttonframe = new JFrame();//��ʼ������
		buttonframe.setTitle("ѧУ��Ϣ����ϵͳ");//���ñ���
		//���ùرշ���
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(WIDTH,HEIGHT);//���ô��ڴ�С
		Toolkit kit = Toolkit.getDefaultToolkit();//��������kit
		//��ȡ��Ļ�Ĵ�С��ʹ���������ʾ
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		buttonframe.setLocation(x, y);//���ö���λ��
		buttonframe.setVisible(true);//���ö������ʾ
		//��������ѧ����Ϣϵͳ�İ�ť
		JButton student = new JButton("ѧ����Ϣϵͳģ��");
		//�������ڽ�ʦ��Ϣϵͳ�İ�ť
		JButton teacher = new JButton("��ʦ��Ϣϵͳģ��");
		//���������쵼��Ϣϵͳ�İ�ť
		JButton leader = new JButton("ѧУ�쵼��Ϣϵͳģ��");
		//�����ذ�ť������buttonframe��
		buttonframe.add(student);
		buttonframe.add(teacher);
		buttonframe.add(leader);
		//���ö���buttonframe�Ĳ��ֹ�����
		buttonframe.setLayout(new GridLayout(3,1));
		//Ϊstudent��ťע���¼�������
		student.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Studentmanageframe studentframe = new Studentmanageframe();
				studentframe.studentmanageframe();
			}
		});
		//Ϊteacher��ťע���¼�������
		teacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Teachermanageframe teacherframe = new Teachermanageframe();
				teacherframe.teachermanageframe();
			}
		});
		//Ϊleader��ťע���¼�������
		leader.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				Leadermanageframe leaderframe = new Leadermanageframe();
				leaderframe.leadermanageframe();
			}
		});
	}
}
