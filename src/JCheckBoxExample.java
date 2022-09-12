import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("CheckBox Example");
		JLabel lb1= new JLabel("Please Choose ");
		lb1.setBounds(100,50,300,50);
		JCheckBox ch1=new JCheckBox("Java");
		JCheckBox ch2=new JCheckBox("C++");
		ch1.setBounds(100,100,250,50);
		ch2.setBounds(100,150,250,50);
		
		ch1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lb1.setText("Java Box " + (e.getStateChange()==1 ?"choosen": "none" ));
				
			}
		});
		ch2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lb1.setText("C++ Box " + (e.getStateChange()==1 ?"choosen": "none" ));
				
			}
		});
		
	
		
		frame.add(lb1);
		frame.add(ch1);
		frame.add(ch2);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	}


