import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JProgressBarExample {

	public static void main(String[] args) {
		JFrame frame= new JFrame("Progress Bar Example");
		JProgressBar jBar= new JProgressBar(0,2000);
		jBar.setBounds(40,40,160,30);
		jBar.setValue(0);
		jBar.setStringPainted(true);
		
		frame.add(jBar);
		
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		int i=0;
		while(i<=2000) {
			jBar.setValue(i);
				i=i+20;
				try {
					Thread.sleep(150);
				} catch (InterruptedException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
		}

	}

}
