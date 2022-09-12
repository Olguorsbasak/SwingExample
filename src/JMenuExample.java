import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JMenuExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Menu Example");
		JMenuBar menuBar=new JMenuBar();
		JMenu menu=new JMenu("Home Page");
		JMenu submenu=new JMenu("Sub Menu");

		JMenuItem item1=new JMenuItem("Menu 1");
		JMenuItem item2=new JMenuItem("Menu 2");
		JMenuItem item3=new JMenuItem("Menu 3");
		JMenuItem item4=new JMenuItem("Menu 4");
		
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked Menu");
				
			}
		});
		JMenuItem sb1=new JMenuItem("Sub Menu 1");
		JMenuItem sb2=new JMenuItem("Sub Menu 2");
		
		submenu.add(sb1);
		submenu.add(sb2);
		
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		menu.add(item4);
		menu.add(submenu);
		
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
