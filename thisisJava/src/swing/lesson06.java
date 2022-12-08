package swing;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class lesson06 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lesson06 window = new lesson06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lesson06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel endpage = new JPanel();
		endpage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(endpage);
		endpage.setLayout(null);
		
		JButton btnBefor = new JButton("GO TO LAST");
		btnBefor.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		btnBefor.setBounds(150, 88, 213, 281);
		endpage.add(btnBefor);
		
		JPanel startPage = new JPanel();
		startPage.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(startPage);
		startPage.setLayout(null);
		
		JButton btnNext = new JButton("GO TO NEXT");
		btnNext.setBounds(101, 137, 156, 250);
		btnNext.setFont(new Font("나눔고딕", Font.BOLD, 12));
		startPage.add(btnNext);
		
		endpage.setVisible(false);
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endpage.setVisible(true);
				startPage.setVisible(false);
			}
			
		});
		
		btnBefor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				endpage.setVisible(false);
				startPage.setVisible(true);
			}
			
		});
		
	}
}
