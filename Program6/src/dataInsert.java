import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class dataInsert extends JFrame implements ActionListener {
	

	
	// Declaring Connection to mySQL database
	private	Connection connection = null;
	private	Statement statement = null;
	
	// Declaring text fields 
			JTextField txtFirstName = new JTextField(20);
			JTextField txtLastName = new JTextField(20);
	
	public dataInsert()
	{
		super("Insert to Author");
		JPanel main = new JPanel(); // Main Panel
		JPanel Labels = new JPanel(); // Label Panel
		JPanel Text = new JPanel(); // Text Panel
		
		
		// add text fields to the panel
		Text.setLayout(new GridLayout(2,1,1,2));
		Text.add(txtFirstName);
		Text.add(txtLastName);
		
		// Declaring Labels and adding them to the panel
		Labels.setLayout(new GridLayout(2,1,1,2));
		Labels.add(new JLabel("First name:"));
		Labels.add(new JLabel("Last Name:"));
		
		// Declaring button
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(this);
		
		// Adding all panels and button to the main panel
		main.add(Labels, BorderLayout.WEST);
		main.add(Text, BorderLayout.CENTER);
		main.add(btnInsert,BorderLayout.SOUTH);
		
		this.add(main);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/books","root","");
			
	         // create Statement for querying database
	         statement = connection.createStatement();
	         
	         // query database                                        
	       statement.executeUpdate("INSERT INTO Authors (FirstName, LastName) VALUES ('"+txtFirstName.getText()+"','"+txtLastName.getText()+"')");
	       JOptionPane.showMessageDialog(null, "Values added!");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally // ensure statement and connection are closed
	      {                                                             
	         try                                                        
	         {                                                                                             
	            statement.close();                                      
	            connection.close();                                     
	         } // end try                                               
	         catch ( Exception exception )                              
	         {                                                          
	            exception.printStackTrace();                            
	         } // end catch                                             
	      } // end finally  
		
		
	}

}
