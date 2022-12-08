package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import JDBC.Mom;
import JDBC.StudentDB;

public class SwingEx extends JFrame implements ActionListener {
	
	JButton sel = new JButton("검색");
	JButton del = new JButton("삭제");	

	SwingEx (){
		
		Container con = this.getContentPane();
		
		
		sel.setBounds(50,50,80,50);
		del.setBounds(150,150,180,150);
		
		con.setLayout(null);
		con.add(sel);
		con.add(del);
		sel.addActionListener(this);
		del.addActionListener(this);
		
		
		this.setVisible(true);
		this.setLocation(300,300);
		this.setSize(400,500);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new SwingEx();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sel) {
			System.out.println("sel 버튼 클릭");
		}else if(e.getSource() == del){
			System.out.println("del 버튼 클릭");
		}
		
	}

}
