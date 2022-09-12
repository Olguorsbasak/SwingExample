import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Text Field Example");
		JLabel lb1,lb2,lb3;
		JTextField tx1,tx2,tx3;
		JButton btn;
		
		lb1=new JLabel("First Number: ");
		lb1.setBounds(50,10,100,30);
		tx1=new JTextField();
		tx1.setBounds(50,40,200,30);
		
		lb2=new JLabel("Second Number: ");
		lb2.setBounds(50,70,200,30);
		tx2=new JTextField();
		tx2.setBounds(50,100,200,30);
		
		lb3=new JLabel("Sum: ");
		lb3.setBounds(50,130,100,30);
		tx3=new JTextField();
		tx3.setBounds(50,160,200,30);
		
		btn= new JButton("Sum");
		btn.setBounds(50,220,200,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1= Integer.parseInt(tx1.getText());
				int num2= Integer.parseInt(tx2.getText());
				int num3=num1+num2;
				
				String sum = String.valueOf(num3);
				
				tx3.setText(sum);
				}
		});
		
		
		frame.add(btn);
		frame.add(lb1);
		frame.add(lb2);
		frame.add(lb3);
		frame.add(tx1);
		frame.add(tx2);
		frame.add(tx3);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
