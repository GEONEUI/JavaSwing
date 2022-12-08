package swing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		this.setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		this.setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		this.setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
}

public class Lesson08 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(640, 480);
		frame.setLocationRelativeTo(null);
		ImagePanel panel = new ImagePanel(new ImageIcon("./image/cat1.jpeg").getImage());
		frame.add(panel);
		frame.pack();
		
		File file = new File("./image/cat2.jpeg");
		System.out.println(file.exists()?"있음":"없음");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
