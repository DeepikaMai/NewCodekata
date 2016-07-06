import java.util.Scanner;

public class RvrseDigit 
{
	public static void main(String[]args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=s.nextInt();
		int result = 0;
		   int rem;
		   while (n > 0) 
		   {
		       rem = n % 10;
		       n = n / 10;
		       result = result * 10 + rem;
	       }
		 System.out.println("Reverse of the Number is: "+result);
	}
}