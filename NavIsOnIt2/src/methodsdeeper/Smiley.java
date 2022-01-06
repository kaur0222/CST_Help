
package methodsdeeper;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Smiley extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		g.setColor(Color.yellow);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.black);
		g.fillOval(55,65, 30, 30);
		g.fillOval(95,65, 30, 30);
		g.fillOval(135,65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.yellow);
		
		g.fillOval(50, 110, 120, 40);
		
		
	}

}


