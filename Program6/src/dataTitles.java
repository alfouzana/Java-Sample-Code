import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

import java.sql.SQLException;
public class dataTitles extends JFrame {

	private ResultSetTableModel tableModel;
	
    JTable resultTable;
	JPanel frmTitles = new JPanel();
	public dataTitles()
	{
		 try 
	      {
	         // create TableModel for results of query SELECT * FROM authors
	         tableModel = new ResultSetTableModel( "jdbc:mysql://localhost/books",
	            "root", "", "SELECT * FROM Titles" );

	         	resultTable = new JTable(tableModel);
	         frmTitles.add(resultTable,  BorderLayout.CENTER);
	      }
	      catch ( SQLException sqlException ) 
	      {
	         JOptionPane.showMessageDialog( null, sqlException.getMessage(), 
	            "Database error", JOptionPane.ERROR_MESSAGE );
	               
	         // ensure database connection is closed
	         tableModel.disconnectFromDatabase();
	         
	         System.exit( 1 ); // terminate application
	      } // end catch
	     
        final TableRowSorter< TableModel > sorter = 
                new TableRowSorter< TableModel >( tableModel );
              resultTable.setRowSorter( sorter );

		 
	      this.add(frmTitles);
		
	}
}
