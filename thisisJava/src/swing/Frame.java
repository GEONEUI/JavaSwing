package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel panelLeft = new JPanel();
		JTextArea textArea = new JTextArea();
		JLabel label = new JLabel("hellow world");
		JButton btn1 = new JButton("글자복사"); 
		JButton btn2 = new JButton("종료하기"); 
		
		frame.setVisible(true);
		frame.setSize(800, 450);
		frame.setPreferredSize(new Dimension(800, 450));
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		panel.add(panelLeft, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);
		
		
		panelLeft.add(btn1, BorderLayout.CENTER);
		panelLeft.add(btn2, BorderLayout.CENTER);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textArea.getText());
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		
		
	}

}
