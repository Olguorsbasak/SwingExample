import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Tabbed Pane Example");
		
		JLabel label1= new JLabel("First Area");
		JPanel panel1=new JPanel();
		panel1.add(label1);
		JLabel label2= new JLabel("Second Area");
		JPanel panel2=new JPanel();
		panel2.add(label2);
		JLabel label3= new JLabel("Third Area");
		JPanel panel3=new JPanel();
		panel3.add(label3);
		
		JTabbedPane tp= new JTabbedPane();
		tp.setBounds(50,50,200,200);
		tp.add("first",panel1);
		tp.add("second",panel2);
		tp.add("Third",panel3);
		
		frame.add(tp);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);


	}

}
