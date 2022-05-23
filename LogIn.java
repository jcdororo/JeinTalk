import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LogIn extends JFrame {
	public LogIn() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);	//ID �Է� field Size�� 10
		JPasswordField txtPass = new JPasswordField(10);	// �������ʴ� passworld filed Size�� 10
		JButton logBtn = new JButton("Log In");		//�α��� ��ư ����
		
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		

		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Jein";		//DB�� ���̵�
				String pass = "0915";	//DB�� ��й�ȣ
				
				// DB�� ���̵�� ��й�ȣ�� ���� �Է��� ���̵�� ��й�ȣ�� �´°� ?
				if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");				
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
					
				}
			}
		});
		add(panel);
		
		
		setVisible(true);	//�������� ���̰ڴ�.
		setSize(600,400);	//�������� ������
		setLocationRelativeTo(null);	//���μ��� ���� �� ȭ�� �� �߾ӿ� ��ġ�Ѵ�.
		setResizable(false);	//������ ������ ������� �ʴ´�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// X ��ư���� ����� ���μ��� ����
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}
