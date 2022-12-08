package swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	
	public Login() {
		
		
		
		JPanel panel = new JPanel();
		JTextField ID = new JTextField(8);
		JLabel labelID = new JLabel("아이디");
		JLabel labelPAS = new JLabel("비밀번호");
		JPasswordField PAS = new JPasswordField(8);

		JButton btn1 = new JButton("로그인");
		
		this.setVisible(true);
		this.setPreferredSize(new Dimension(450, 350));
		this.setSize(450, 350);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		
		panel.add(labelID);
		panel.add(ID);
		panel.add(labelPAS);
		panel.add(PAS);
		panel.add(btn1);
		
		
		btn1.addActionListener(new ActionListener() {
			
			String id = "GEONEUI";
			String pass = "1234";
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id.equals(ID.getText()) && pass.equals(PAS.getText())) {
					JOptionPane.showMessageDialog(null, "로그인성공");
				}else {
					JOptionPane.showMessageDialog(null, "실패");
				}
			}
		});
		
		
	}
	

	
	
	public static void main(String [] args) {
		new Login();
	}
}
