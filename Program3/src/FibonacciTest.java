//Name: 		Abdullah Alfouzan
//Class:		CSCI470
//Instructor:	Paul Langhals
//Assignment:	Program2
//Due Date:		02/06/2012

import javax.swing.JOptionPane;
public class FibonacciTest {
	
	public static void main(String[] args) {
		
		
		Fibonacci numbers = new Fibonacci(); //declaring object.
		
		//Get the nth number from the user
		int n = Integer.parseInt(JOptionPane.showInputDialog("Please input the nth number for Fibonacci series"));
		
		numbers.getFibonacci(n); //Integer
		numbers.getFibonacci2(n); //double 
		
		
	}

}
