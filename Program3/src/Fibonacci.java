public class Fibonacci {

	public void getFibonacci(int n)
	{

	
	int[] series = new int[n];
	
	//create first series elements
	series[0]=0;
	series[1]=1;
	
	//create the Fibonacci series and store it in an array.
	for(int i=2; i<n;i++)
	{
		series[i]= series[i-1] + series[i-2];
		if(series[i]<0)
		{
			//Print the maximum.
			System.out.println("The maximum number in integer data type is: " + i +"\n");
			break;
		}
	}
	
	//print the Fibonacci series numbers
	System.out.println("Fibonacci Series up to "+ n);
	for(int i=0;i<n;i++)
	{
		System.out.print(series[i]+ " ");
	}
	
	System.out.println("\n");
	}

	public void getFibonacci2(int n)
	{

	
	double[] series = new double[n];
	
	//create first series elements
	series[0]=0;
	series[1]=1;
	
	//create the Fibonacci series and store it in an array.
	for(int i=2; i<n;i++)
	{
		series[i]= series[i-1] + series[i-2];
		if(series[i]>1.3069892237633987E308)
		{
			//Print the maximum.
			System.out.println("The maximum number in double data type is: " + i +"\n");
			break;
		}
	}
	
	//print the Fibonacci series numbers
	System.out.println("Fibonacci Series up to "+ n);
	for(int i=0;i<n;i++)
	{
		System.out.print(series[i]+ " ");
	}
	System.out.println("\n");
	}
}
