import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Button Example");
		JButton button= new JButton("Send");
		button.setBounds(100,100,100,30);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked!");
				
			}
		});
		
		frame.add(button);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
