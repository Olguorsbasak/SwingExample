import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

import javax.lang.model.element.NestingKind;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class JPasswordFieldExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Password Example");
		
		JLabel lb1= new JLabel("Password: ");
		lb1.setBounds(20,20,100,30);
		
		JPasswordField pass= new JPasswordField();
		pass.setBounds(20,50,100,30);
		
		JButton btn= new JButton("Send");
		btn.setBounds(20,80,100,30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password= new String (pass.getPassword());
				lb1.setText(lb1.getText()+password);
				
			}
		});
		
		frame.add(lb1);
		frame.add(pass);
		frame.add(btn);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
