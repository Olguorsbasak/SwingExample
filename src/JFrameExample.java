import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Frame Example");
		frame.setSize(400,400);
		
		JPanel panel=new JPanel();
		JButton button= new JButton();
		
		panel.add(button);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
