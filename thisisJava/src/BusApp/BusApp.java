package BusApp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import javax.swing.JPanel;

public class BusApp {

	
	Connection conn;
	Statement stmt;
	ResultSet rs;

	private JFrame frame;
	private JPanel bus_main;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JPanel bus_sub1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JTextField name;
	private JLabel lblNewLabel_5;
	private JTextField birth;
	private JTextField id;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField pass;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

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
	 * 
	 * @throws SQLException
	 */
	public BusApp() throws SQLException {
		
		initialize();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버연결");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "mysql");
			System.out.println("디비연결");
			selectAll();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void insert() throws SQLException {
		stmt = conn.createStatement();
		int resulte = stmt.executeUpdate("insert into users values('" + name.getText() + "','" + birth.getText() + "','"
				+ id.getText() + "','" + pass.getText() + "')");
		System.out.println(resulte + "전송완료");
		

	}
	
	public void selectAll() throws SQLException {
		
	      stmt = conn.createStatement();
	      rs = stmt.executeQuery("select * from users");
	      while (rs.next()) {
	         String name = rs.getString("name");
	         String birth = rs.getString("birth");
	         String userid = rs.getString("userid");
	         String password = rs.getString("password");
	         
	        
	         Users userlist = new Users(name, birth, userid, password);
	         
	         
	         
	 		
	 		System.out.println(userlist.getName().equals("유건의"));
	 		
	 		


	      
	         
	      }
	   }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BusApp");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);

		bus_sub1 = new JPanel();
		bus_sub1.setBounds(0, 0, 354, 591);
		frame.getContentPane().add(bus_sub1);
		bus_sub1.setLayout(null);

		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					insert();
					JOptionPane aa = new JOptionPane();
					aa.showMessageDialog(null, "회원가입이 완료되었습니다.");
					bus_sub1.setVisible(false);
					bus_main.setVisible(true);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.fillInStackTrace();
				}
			}
		});
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(58, 525, 243, 42);
		bus_sub1.add(btnNewButton_3);

		btnNewButton_2 = new JButton("");

		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBounds(143, 486, 69, 27);
		bus_sub1.add(btnNewButton_2);

		id = new JTextField();
		id.setFont(new Font("나눔고딕", Font.PLAIN, 16));
		id.setColumns(10);
		id.setBounds(58, 337, 243, 35);
		bus_sub1.add(id);

		lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_6.setBounds(82, 305, 188, 22);
		bus_sub1.add(lblNewLabel_6);

		lblNewLabel_5 = new JLabel("생년월일");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_5.setBounds(82, 228, 188, 22);
		bus_sub1.add(lblNewLabel_5);

		birth = new JTextField();
		birth.setFont(new Font("나눔고딕", Font.PLAIN, 16));
		birth.setColumns(10);
		birth.setBounds(58, 260, 243, 35);
		bus_sub1.add(birth);

		lblNewLabel_4 = new JLabel("이름");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(82, 151, 188, 22);
		bus_sub1.add(lblNewLabel_4);

		name = new JTextField();
		name.setFont(new Font("나눔고딕", Font.PLAIN, 16));
		name.setBounds(58, 183, 243, 35);
		bus_sub1.add(name);
		name.setColumns(10);

		pass = new JTextField();
		pass.setFont(new Font("나눔고딕", Font.PLAIN, 16));
		pass.setColumns(10);
		pass.setBounds(58, 414, 243, 35);
		bus_sub1.add(pass);

		lblNewLabel_7 = new JLabel("비밀번호");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_7.setBounds(82, 382, 188, 22);
		bus_sub1.add(lblNewLabel_7);

		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\bus-sub4.png"));
		lblNewLabel_2.setBounds(-9, -10, 370, 630);
		bus_sub1.add(lblNewLabel_2);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bus_main.setVisible(true);
				bus_sub1.setVisible(false);
			}
		});
		bus_sub1.setVisible(false);

		bus_main = new JPanel();
		bus_main.setBounds(0, 0, 354, 591);
		frame.getContentPane().add(bus_main);
		bus_main.setLayout(null);

		lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 368, 74, 36);
		bus_main.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(133, 368, 167, 36);
		bus_main.add(textField);
		textField.setColumns(10);

		lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		lblNewLabel_1.setBounds(58, 414, 74, 36);
		bus_main.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 414, 167, 36);
		bus_main.add(textField_1);

		btnNewButton = new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFocusPainted(false);

		btnNewButton.setBounds(125, 492, 97, 23);
		bus_main.add(btnNewButton);

		btnNewButton_1 = new JButton("");

		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(61, 525, 246, 43);
		bus_main.add(btnNewButton_1);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-9, -10, 370, 630);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\bus-main5.png"));
		bus_main.add(lblNewLabel_3);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bus_main.setVisible(false);
				bus_sub1.setVisible(true);
			}
		});
		bus_main.setVisible(true);

		frame.setBounds(100, 100, 370, 630);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
