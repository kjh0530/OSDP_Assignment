package PROJECT221019_김주훈;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz9_3 extends JFrame {
	Quiz9_3() {
		setTitle("BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,10));
		
		for(int i=0; i<10; i++) {
				c.add(new JButton(i + ""));
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz9_3();
	}
}
