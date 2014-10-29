//Name: 		Abdullah Alfouzan
//Class:		CSCI470
//Instructor:	Paul Langhals
//Assignment:	Program2
//Due Date:		01/30/2012
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawMe extends JPanel {
	public void paintComponent(Graphics g)
	 {
		super.paintComponents(g);
			
			// Draw rectangle
			g.setColor(Color.BLACK);
			g.drawRect(10, 10, 200, 200);
			
			// Draw circle
			g.setColor(Color.RED);
			g.fillOval(10, 10, 200, 200);
						
	 }
}
