import java.awt.Frame;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Table Example");
		String [][] data= {{"1","Math","85"},{"2","Science","95"},{"3","Turkish","80"}};
		String [] head= {"ID","Lesson","Note"};
		JTable jTable=new JTable(data,head);
		jTable.setBounds(30,40,200,300);
		
		JScrollPane sPane=new JScrollPane(jTable);
		
		frame.add(sPane);
		frame.add(jTable);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
