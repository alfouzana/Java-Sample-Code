import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.SQLException;
public class dataAuthors extends JFrame {

	private ResultSetTableModel tableModel;
	
	JPanel frmAuthor = new JPanel();
	public dataAuthors()
	{
	      try 
	      {
	         // create TsableModel for results of query SELECT * FROM authors
	         tableModel = new ResultSetTableModel( "jdbc:mysql://localhost/books",
	            "root", "", "SELECT * FROM AUTHORS" );
	         JTable resultTable = new JTable( tableModel );

	         frmAuthor.add(resultTable, BorderLayout.CENTER);
	      }
	      catch ( SQLException sqlException ) 
	      {
	         JOptionPane.showMessageDialog( null, sqlException.getMessage(), 
	            "Database error", JOptionPane.ERROR_MESSAGE );
	               
	         // ensure database connection is closed
	         tableModel.disconnectFromDatabase();
	         
	         System.exit( 1 ); // terminate application
	      } // end catch
	      
	      this.add(frmAuthor);
	}
}
