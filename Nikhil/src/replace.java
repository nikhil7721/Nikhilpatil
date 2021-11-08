import java.util.Scanner;
public class replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter to replace");
		String Str=sc.next();
		
		System.out.println(Str.replace('a', '$'));


	}

}
