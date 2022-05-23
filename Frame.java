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
		JButton btn1 = new JButton("Click me!!");//��ư �߰�
		JButton btn2 = new JButton("Exit");
		JTextArea txtArea = new JTextArea(); //�����̻�
		JTextField txtField = new JTextField(200); //����
		JPanel btnPanel = new JPanel();//��ư�� �� �г� �߰� 
		panel.setLayout(new BorderLayout());
		
		btnPanel.add(btn1);//�гξȿ� ��ư�߰�
		btnPanel.add(btn2);//�гξȿ� ��ư�߰�2
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
		
		frame.add(panel);//�����ӿ� panel�� �߰� ����� panel�� frame�ȿ��� ��밡���ϴ�.
		
		
		
		frame.setResizable(false);//�������� ũ�⸦ �������� ���ϰ� ���´�.
		frame.setVisible(true);//�������� ���̰ڴ�
		frame.setPreferredSize(new Dimension(840, 840/12*9));//������ ������
		frame.setSize(840, 840/12*9);//�������� ũ�⸦ ����Ʈ�� �������ش�.
		frame.setLocationRelativeTo(null);//�������� ȭ���� ������� �����Ѵ�.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x ������ ���� �̰� ������ x�� ������ �ڹٸӽ��� ��� ������
		

	}

}
