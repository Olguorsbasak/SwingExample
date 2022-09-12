import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.JavaBean;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;

import org.w3c.dom.html.HTMLFrameSetElement;

public class JListExample {

	public static void main(String[] args) {
	JFrame frame=new JFrame("List Example");
	DefaultListModel<String> list1=new DefaultListModel<>();
	list1.addElement("C++");
	list1.addElement("Java");
	list1.addElement("Javascript");
	list1.addElement("PHP");
	
	JList<String> list2=new JList<>(list1);
	list2.setBounds(100,100,75,75);
	
	DefaultListModel<String> list3=new DefaultListModel<>();
	list3.addElement("Swing");
	list3.addElement("Laravel");
	list3.addElement("Bootstrap");
	
	JList<String> list4=new JList<>(list3);
	list4.setBounds(100,200,75,85);
	
	JButton button=new JButton("Send");
	button.setBounds(200,150,80,30);
	button.addActionListener(new ActionListener() {
		String txt="";
		@Override
		public void actionPerformed(ActionEvent e) {
			if(list2.getSelectedIndex() !=-1) {
				txt="Language: "+ (list2.getSelectedValue());
				
			}
			if(list4.getSelectedIndex() !=-1) {
				txt+=" , Framework: ";
				for(Object item : list4.getSelectedValuesList()){
					txt+= item + " ";
				}
				
			}
			System.out.println(txt);
			
		}
	});
	
	
	frame.add(list2);
	frame.add(list4);
	frame.add(button);
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setSize(400,400);
	
	

	}

}
