import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Some Text");
		JButton btn1 = new JButton("Click me!!");//버튼 추가
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea(); //한줄이상
		JTextField txtField = new JTextField(200); //한줄
		JPanel btnPanel = new JPanel();//버튼이 들어갈 패널 추가 
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);//패널안에 버튼추가
		btnPanel.add(btn2);//패널안에 버튼추가2
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(txtArea, BorderLayout.CENTER);
		//panel.add(new JLabel("Welcome this lecture"));
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//txtArea.append("You are amzing\n");
				label.setText(txtArea.getText());
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		frame.add(panel);//프레임에 panel을 추가 해줘야 panel을 frame안에서 사용가능하다.
		
		
		
		frame.setResizable(false);//프레임의 크기를 조정하지 못하게 막는다.
		frame.setVisible(true);//프레임을 보이겠다
		frame.setPreferredSize(new Dimension(840, 840/12*9));//프레임 사이즈
		frame.setSize(840, 840/12*9);//프레임의 크기를 디폴트로 설정해준다.
		frame.setLocationRelativeTo(null);//프레임을 화면의 가운데에서 생성한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 누르면 꺼짐 이게 없으면 x를 눌러도 자바머신이 계속 구동됨
		

	}

}
