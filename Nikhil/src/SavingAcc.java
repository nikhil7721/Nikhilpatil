import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.naming.InsufficientResourcesException;


public class SavingAcc 
   {
	long accno=7721;
	String name="nikhil";
	static double balance=5000.0;

	

	public static void main(String[] args)
	{
	Scanner	sc=new Scanner(System.in);
	System.out.println("Enter amount to withdrawal");
	int n=sc.nextInt();
	try {if(balance<n) 
	
	{
		MinimumAccountBalance()
	}
		
	}
	
			
	
		

	}

}
