public class Employee {
	private String firstName; //holds first name
	private String lastName; //holds last name
	private double salary; //holds salary
	
	public Employee(String fName, String lName, double wage)
	{ 	// constructor 

		firstName = fName;
		lastName = lName;
		salary = wage;
	}

	public void setEmployee(String fName, String lName, double wage)
	{  //set the values
		firstName = fName;
		lastName = lName;
		if(wage >0)
		salary = wage;
		else
			System.out.println("Please enter a positive value");
	}
	
	public String getFirstName ()
	{ //Get first name
		return firstName;
	}
	
	public String getLastName()
	{ // Get last name
		return lastName;
	}
	
	public double getSalary()
	{ // Get salary
		return salary;
	}

}
