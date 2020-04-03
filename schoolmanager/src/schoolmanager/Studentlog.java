package schoolmanager;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class Login extends JPanel{//��¼�࣬��Ƴ�һ���̳���������
	static final int WIDTH =300;//������������ܵĿ��
	static final int HEIGHT =150;//�߶�
	JFrame loginframe;
	//�������������鲼�ַ�ʽ��������ķ���
	public void add(Component c, GridBagConstraints constraints,int x,int y, int w, int h) {
		constraints.gridx  = x;//���ÿؼ�λ�ڵڼ���
		constraints.gridy =  y;//���ÿؼ�λ�ڵڼ���
		constraints.gridwidth = w;//���ÿؼ���Ҫռ����
		constraints.gridheight = h;//���ÿؼ���Ҫռ����
		add(c,constraints);
	}
	void login(){//����ʵ����ӿؼ��������Ĺ��췽��
		//��������Ŀ��
		loginframe = new JFrame("��Ϣ����ϵͳ");
		//���ô�������Ĺرտؼ���Ч����ⷽ��
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���������鲼�ֹ������Ķ���
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);//���ò��ֹ�����
		//��ӵ�ǰ���󵽵�¼ҳ��
		loginframe.add(this,BorderLayout.WEST);
		loginframe.setSize(WIDTH, HEIGHT);//���õ�¼ҳ��Ĵ�С
		//����ʵ�־�����ʾ����	
		Toolkit kit = Toolkit.getDefaultToolkit();//��ȡToolkit�����
		//��ȡ��Ļ��С����
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;//��ȡ��Ļ�Ŀ��
		int height = screenSize.height;//��ȡ��Ļ�ĸ߶�
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		loginframe.setLocation(x, y);//����λ��
		JButton ok = new JButton("��¼");//������¼��ť
		JButton cancel = new JButton("����");//����������ť
		//������ǩ����title
		JLabel title = new JLabel("��Ϣϵͳ��½����");
		JLabel name = new JLabel("�û���");//�����û�����ǩ
		JLabel password = new JLabel("����");//���������ǩ
		//���������û�����������ı������
		final JTextField nameinput = new JTextField(15);
		final JTextField passwordinput = new JTextField(15);
		//�������������鲼�ֶ���constraints
		GridBagConstraints constraints = new GridBagConstraints();
		//���ö���constraints���������
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		//ʹ�������鲼����ӿؼ�
		add(title,constraints,0,0,4,1);
		add(name,constraints,0,1,1,1);
		add(password,constraints,0,2,1,1);
		add(nameinput,constraints,2,1,1,1);
		add(passwordinput,constraints,2,2,1,1);
		add(ok,constraints,0,3,1,1);
		add(cancel,constraints,2,3,1,1);
		loginframe.setResizable(false);
		loginframe.setVisible(true);//ʹ������ʾ
		//Ϊ��ok����ťע���¼�
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// ��ȡ�û�������������
				String nametext = nameinput.getText();
				//��ȡ������������
				String passwordtext = passwordinput.getText();
				//��������������ַ���
				String str = new String(passwordtext);
				//�жϹ����û�������������
				boolean x = (nametext.equals("admin"));
				boolean y = (str.equals("123456"));
				boolean z = (x && y);
				if(z == true) {//����¼�ɹ�ʱ
					loginframe.dispose();
					@SuppressWarnings("unused")
					Mainframe main = new Mainframe();
					main.mainframe();//�����Ĵ���û�е��������������������
				}else if(z == false) {//����¼ʧ��ʱ
					nameinput.setText("");
					passwordinput.setText("");
				}
			}
		});
		//Ϊcancel��ťע���¼�
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent Event) {
				// TODO �Զ����ɵķ������
				loginframe.dispose();
			}
		});
	}
}
public class Studentlog {//����ѧ����¼��

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Login log = new Login();
		log.login();
	}

}
