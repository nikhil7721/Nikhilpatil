import java.util.Scanner;
public class JavaExceptionExample {

	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	System.out.println("enter the first no");
	int a=sc.nextInt();
	System.out.println("Enter the second no");
	int b=sc.nextInt();
		try 
		{
			
		     int data=a/b;
		System.out.println(data);
	    }
		catch(ArithmeticException e)
		{
			System.out.println(e);
		
		System.out.println("unsupported operation");
		}
	}

}
