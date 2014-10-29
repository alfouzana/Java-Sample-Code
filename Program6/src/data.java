//Name: 		Abdullah Alfouzan
//Class:		CSCI470
//Instructor:	Paul Langhals
//Assignment:	Program6
//Due Date:		03/19/2012

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class data extends JFrame {
	JButton btnShowAuthors = new JButton("Show Authors");
	JButton btnShowTitiles = new JButton("Show Titles");
	JButton btnDelete = new JButton("Update Authors Table");
	JButton btnInsert = new JButton("Insert to the Authors Table");
	
	JPanel frmMain = new JPanel();
	public data()
	{
		// Set Up the Main Form
		frmMain.setLayout(new GridLayout(4,1,2,6));
		frmMain.add(btnShowAuthors);
		frmMain.add(btnShowTitiles);
		frmMain.add(btnDelete);
		frmMain.add(btnInsert);
		
		//Shows author table
		btnShowAuthors.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				dataAuthors ShowAuthors = new dataAuthors();
				
				ShowAuthors.setSize(600, 380);
				ShowAuthors.setVisible(true);
			}

		}
				);
		
		//Shows Titles table
		btnShowTitiles.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				// Show Form Titles
				dataTitles ShowTitles = new dataTitles();
				ShowTitles.setSize(600, 380);
				ShowTitles.setVisible(true);
			}
		
		}
		);
		//Update Authors Table
		btnDelete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				// Show Update Author Form.
				AuthorDelete delete = new AuthorDelete();
				delete.setSize(550, 100);
				delete.setVisible(true);
			}
		}
				);
		
		//Insert Author name Table
		btnInsert.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				dataInsert insert = new dataInsert();
				insert.setSize(550,130);
				insert.setVisible(true);
			}
		}
		);
		

		this.add(frmMain);
		
	}

	
	}


