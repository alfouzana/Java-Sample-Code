//Name:			Abdullah Alfouzan
//Date:			22-01-2012
//Project:		Program1
//instructor:	Paul Langhals

import javax.swing.JOptionPane;
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object Declarations
		Employee employee1 = new Employee("abdullah","alfouzan",10000);
		Employee employee2 = new Employee("john","smith",20000);
		
		//Display result
		System.out.printf("%s\n%s\n%s\n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
		System.out.printf("%s\n%s\n%s\n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
		
		
		
		//Input from the keyborad
		String FirstName = JOptionPane.showInputDialog("Please enter First Name: ");
		String LastName = JOptionPane.showInputDialog("Please enter Last Name: ");
		double Salary = Double.parseDouble(JOptionPane.showInputDialog("Please Enter the Salary:"));
		
		//Set method
		employee1.setEmployee(FirstName, LastName, Salary);
		
		//raise salary for both employees for %10.
				double raise;
				double totalRaise;
				raise = employee1.getSalary()*.10;
				totalRaise = employee1.getSalary()+raise;
				employee1.setEmployee(FirstName, LastName, totalRaise);
				
				
		//Input from the keyborad
		 FirstName = JOptionPane.showInputDialog("Please enter First Name: ");
		 LastName = JOptionPane.showInputDialog("Please enter Last Name: ");
		 Salary = Double.parseDouble(JOptionPane.showInputDialog("Please Enter the Salary:"));
		
		 
		 //Set method
		 employee2.setEmployee(FirstName, LastName, Salary);
		
	
		//Calculate the raise
		raise = employee2.getSalary()*.10;
		totalRaise = employee2.getSalary()+raise;
		employee2.setEmployee(FirstName, LastName, totalRaise);
		
		//Display the salary with the raise.
		System.out.printf("%s\n%s\n%s\n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
		System.out.printf("%s\n%s\n%s\n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
		

	}

}
