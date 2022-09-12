import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class JPopupExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Pop-Up Menu Example");
		JPopupMenu popupMenu=new JPopupMenu("Menu");
		JMenuItem cutItem= new JMenuItem("Cut");
		JMenuItem copyItem= new JMenuItem("Copy");
		JMenuItem pasteItem= new JMenuItem("Paste");
		
		popupMenu.add(cutItem);
		popupMenu.add(copyItem);
		popupMenu.add(pasteItem);
		
		frame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				popupMenu.show(frame,e.getX(),e.getY());
			}
		});
		cutItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clicked cut button");
				
			}
		});
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
