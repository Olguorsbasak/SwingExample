import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("ComboBox Example");
		String arr[]= {"C++","C#","Java","Phyton"};
		JComboBox comboBox=new JComboBox(arr);
		comboBox.setBounds(50,100,90,20);
		JButton btnButton=new JButton("Choose");
		btnButton.setBounds(50,150,80,20);
		
		btnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String textString="Language : "+comboBox.getItemAt(comboBox.getSelectedIndex());
				
			}
		});
		
		frame.add(comboBox);
		frame.add(btnButton);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
