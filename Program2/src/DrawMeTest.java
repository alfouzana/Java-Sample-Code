//Name: 		Abdullah Alfouzan
//Class:		CSCI470
//Instructor:	Paul Langhals
//Assignment:	Program2
//Due Date:		01/30/2012
import javax.swing.JFrame;


public class DrawMeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DrawMe panel = new DrawMe(); // declare object
		JFrame application = new JFrame(); // declare object
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//close the application
		
		//add frame
		application.add(panel);
		
		//set size of the frame
		application.setSize(230,250);
		
		// make it visible 
		application.setVisible(true);
	}

}
