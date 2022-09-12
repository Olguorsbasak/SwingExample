import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Radio Button Example");
		JRadioButton r1= new JRadioButton("Woman ",true);
		r1.setBounds(100,50,100,30);
		r1.setActionCommand("Woman ");
		JRadioButton r2= new JRadioButton("Man ");
		r2.setBounds(100,100,100,30);
		r2.setActionCommand("Man ");
		JRadioButton r3= new JRadioButton("None ");
		r3.setBounds(100,150,100,30);
		r3.setActionCommand("None ");
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		buttonGroup.add(r3);
		
		JButton btn = new JButton("Send");
		btn.setBounds(100,200,100,30);
		
			btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) {
					System.out.println(r1.getText()+ "clicked");
				}
				System.out.println(buttonGroup.getSelection().getActionCommand());
				
			}
		});
		
		frame.add(btn);
		frame.add(r3);
		frame.add(r2);
		frame.add(r1);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
