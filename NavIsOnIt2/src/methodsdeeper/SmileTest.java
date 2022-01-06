package methodsdeeper;

import javax.swing.JFrame;

public class SmileTest {
	public static void main(String[]args) {
		
		Smiley panel = new Smiley();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(230,250);
		application.setVisible(true);
}
}