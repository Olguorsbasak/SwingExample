import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextAreaExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Text Area Example");
		JLabel lb1,lb2;
		JTextArea area;
		JButton btn;
		lb1=new JLabel();
		lb1.setBounds(50,25,100,30);
		lb2=new JLabel();
		lb2.setBounds(160,25,100,30);
		
		area=new JTextArea();
		area.setBounds(20,75,250,200);
		
		btn= new JButton("Calculate");
		btn.setBounds(100,300,120,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			String text= area.getText();
			String word[]=text.split("\\s");
			lb1.setText("Word "+word.length);
			lb2.setText("Char: "+text.length());
				}
		});
		frame.add(btn);
		frame.add(area);
		frame.add(lb1);
		frame.add(lb2);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		

	}

}
