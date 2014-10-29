import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class AuthorDelete extends JFrame implements ActionListener  {
	private	Connection connection = null;
	private	Statement statement = null;
	JTextField txtLastName = new JTextField(20);
	JTextField txtFirstName = new JTextField(20);
	
	public AuthorDelete()
	{
		super("Update an Author by last Name");
		JPanel main = new JPanel();
		JPanel txt = new JPanel();
		JPanel lbl = new JPanel();
		JButton submit = new JButton("Update");
		
		
		
		lbl.setLayout(new GridLayout(2,1,1,2));
		lbl.add(new JLabel("Last Name: "));
		lbl.add(new JLabel("Update First Name with: "));
		txt.setLayout(new GridLayout(2,1,1,1));
		txt.add(txtLastName);
		txt.add(txtFirstName);
		main.add(lbl, BorderLayout.WEST);
		main.add(txt, BorderLayout.CENTER);
		main.add(submit,BorderLayout.SOUTH);
		
		submit.addActionListener(this);
		this.add(main);
		
	}
	public void actionPerformed(ActionEvent event)
	{

		String lastName=txtLastName.getText();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/books","root","");
			
	         // create Statement for querying database
	         statement = connection.createStatement();
	         
	         // query database                                        
	       statement.executeUpdate("UPDATE Authors SET FirstName = '"+txtFirstName.getText()+"' WHERE LastName ='"+lastName+"';");
	       JOptionPane.showMessageDialog(null, "First Name Updated!");
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

