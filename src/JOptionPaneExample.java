import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Option Pane Example");
		JOptionPane.showMessageDialog(frame, "Hello World");
		JOptionPane.showMessageDialog(frame, "Error","Hello", JOptionPane.WARNING_MESSAGE, null);
		String str=JOptionPane.showInputDialog(frame,"Name: ");

		System.out.println(str);
		frame.setSize(400,400);
		frame.setLayeredPane(null);
		frame.setVisible(true);
	}

}
