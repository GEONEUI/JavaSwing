package swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Swing_test extends JFrame implements WindowListener, ActionListener {
	
	//JFrame jf = new JFrame("Swing 연습");
	
	
	Swing_test(){
		JButton jb = new JButton("클릭");
		Container cp = this.getContentPane();
		
		this.setVisible(true);
		this.setLayout(null);
		this.setLocation(100, 100);
		this.setSize(800, 800);
		this.setTitle("Swing 연습");
		this.addWindowListener(this);
		jb.addActionListener(this);
		
		
		//버튼
		jb.setBounds(10, 10, 100, 50);

		cp.add(jb);
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭!");
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료");
		System.exit(0);
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {


		new Swing_test();
		
		
	}

}
