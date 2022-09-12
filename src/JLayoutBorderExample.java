import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JLayoutBorderExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Border Layout");
		JButton btn1=new JButton("B1");
		JButton btn2=new JButton("B2");
		JButton btn3=new JButton("B3");
		JButton btn4=new JButton("B4");
		JButton btn5=new JButton("B5");
		JPanel panel= new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(btn1,BorderLayout.NORTH);
		panel.add(btn2,BorderLayout.WEST);
		panel.add(btn3,BorderLayout.EAST);
		panel.add(btn4,BorderLayout.SOUTH);
		panel.add(btn5,BorderLayout.CENTER);
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);
		

	}

}
