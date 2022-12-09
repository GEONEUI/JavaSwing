package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;




public class BusApp extends JFrame {

	private Image img;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusApp window = new BusApp();
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
	public BusApp() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frame = new JFrame();
		frame.setPreferredSize(new Dimension(700, 450));
		frame.setSize(700, 450);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.pack();

		JPanel main = new JPanel();
		main.setBackground(Color.WHITE);
		main.setBounds(0, 0, 684, 411);
		frame.getContentPane().add(main);
		main.setLayout(null);

		JPanel login = new JPanel();
		login.setBackground(Color.WHITE);
		login.setBounds(0, 0, 684, 411);
		frame.getContentPane().add(login);
		login.setLayout(null);

		JButton btnNewButton = new JButton("login");
		btnNewButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton.setBounds(50, 277, 270, 44);
		main.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				login.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton_1.setBounds(50, 228, 270, 44);
		main.add(btnNewButton_1);

		textField_1 = new JTextField();
		textField_1.setBounds(134, 171, 186, 37);
		main.add(textField_1);
		textField_1.setColumns(10);

		textField = new JTextField();
		textField.setBounds(134, 124, 186, 37);
		main.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(45, 176, 80, 25);
		main.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(45, 129, 57, 24);
		main.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("버스 예약시스템");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 54, 240, 37);
		main.add(lblNewLabel);
		
//		ImagePanel panelImg = new ImagePanel(new ImageIcon("./image/cat1.png").getImage());
		JLabel test = new JLabel("");
		test.setIcon(new ImageIcon("./image/bus-main.png"));
		test.setBounds(166, 10, 574, 391);
		main.add(test);
//		panelImg.setLayout(null);

		JButton btnNewButton_2 = new JButton("가입신청");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(191, 240, 270, 44);
		login.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("메인페이지");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(false);
				main.setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btnNewButton_2_1.setBackground(Color.WHITE);
		btnNewButton_2_1.setBounds(191, 299, 270, 44);
		login.add(btnNewButton_2_1);

		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(191, 34, 57, 24);
		login.add(lblNewLabel_1_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(280, 29, 186, 37);
		login.add(textField_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("핸드폰");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1_1_1.setBounds(191, 81, 80, 25);
		login.add(lblNewLabel_1_1_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(280, 76, 186, 37);
		login.add(textField_3);

		JLabel lblNewLabel_1_3 = new JLabel("아이디");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1_3.setBounds(191, 128, 57, 24);
		login.add(lblNewLabel_1_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(280, 123, 186, 37);
		login.add(textField_4);

		JLabel lblNewLabel_1_1_2 = new JLabel("비밀번호");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setFont(new Font("맑은 고딕", Font.BOLD, 19));
		lblNewLabel_1_1_2.setBounds(191, 175, 80, 25);
		login.add(lblNewLabel_1_1_2);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(280, 170, 186, 37);
		login.add(textField_5);

		login.setVisible(false);
		main.setVisible(true);

	}
}
