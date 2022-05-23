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
		JTextField txtID = new JTextField(10);	//ID 입력 field Size는 10
		JPasswordField txtPass = new JPasswordField(10);	// 보이지않는 passworld filed Size는 10
		JButton logBtn = new JButton("Log In");		//로그인 버튼 생성
		
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		

		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "Jein";		//DB속 아이디
				String pass = "0915";	//DB속 비밀번호
				
				// DB속 아이디와 비밀번호가 내가 입력한 아이디와 비밀번호와 맞는가 ?
				if(id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					JOptionPane.showMessageDialog(null, "You have logged in successfully");				
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
					
				}
			}
		});
		add(panel);
		
		
		setVisible(true);	//프레임을 보이겠다.
		setSize(600,400);	//프레임의 사이즈
		setLocationRelativeTo(null);	//프로세스 실행 시 화면 정 중앙에 위치한다.
		setResizable(false);	//사이즈 조정을 허용하지 않는다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// X 버튼으로 종료시 프로세스 종료
	}
	
	public static void main(String[] args) {
		new LogIn();
	}
}
