package PROJECT221019_김주훈;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


	class NorthPanel1 extends JPanel{
		public NorthPanel1() {
			setBackground(Color.LIGHT_GRAY);
		//	setLayout(new FlowLayout());
			add(new JButton("열기"));
			add(new JButton("닫기"));
			add(new JButton("나가기"));
		}
	}
	class CenterPanel1 extends JPanel{
		public CenterPanel1() {
			setLayout(null);
			for (int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*250);
				int y = (int)(Math.random()*250);
				JLabel label=new JLabel("*");
                label.setForeground(Color.RED);
				label.setLocation(x,y);
				label.setSize(20, 20);
				label.setOpaque(true);
				add(label);
				}
		}
	}
	class SouthPanel1 extends JPanel{
			public SouthPanel1() {
			setBackground(Color.YELLOW);
            setLayout(new FlowLayout());
			add(new JButton("Word Input"));
			add(new TextField(15));
		}
	}
	
public class Quiz9_8 extends JFrame{
    Quiz9_8(){
			setTitle("여러 개의 패널을 가진 프레임");
			setSize(300, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	NorthPanel1 nP=new NorthPanel1();
    CenterPanel1 nC=new CenterPanel1();
	SouthPanel1 nS=new SouthPanel1();
	add(nP, BorderLayout.NORTH);
	add(nS, BorderLayout.SOUTH);
	add(nC);
	setVisible(true);
	}	

	public static void main(String[] args) {
		new Quiz9_8();
	}
}
