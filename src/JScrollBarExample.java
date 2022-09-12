import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class JScrollBarExample {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Scroll Bar Example");
		JLabel label= new JLabel();
		label.setBounds(100,50,300,30);
		
		JScrollBar scrollBar=new JScrollBar(JScrollBar.VERTICAL);
		scrollBar.setMaximum(100);
		scrollBar.setMinimum(0);
		scrollBar.setBounds(100,100,50,100);
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				label.setText("Scroll Bar Value: "+(scrollBar.getValue()+scrollBar.getModel().getExtent()));
			}
		});
		frame.add(label);
		frame.add(scrollBar);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
