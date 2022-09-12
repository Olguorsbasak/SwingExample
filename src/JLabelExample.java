import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Label Example");
		JLabel label= new JLabel();
		label.setText("Write Part");
		label.setBounds(100,50,300,30);
		
		JButton button= new JButton("Change");
		button.setBounds(100,100,100,30);
		
		button.addActionListener(new ActionListener() {
			int count=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Clicked the button "+ count++ +".times");
				
			}
		});
		
		frame.add(button);
		frame.add(label);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
