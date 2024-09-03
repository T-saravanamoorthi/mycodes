package day1;
import java.util.Scanner;
public class armstrong 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number:");
	    Scanner sc=new Scanner(System.in);
	   	int n= sc.nextInt();
	   	sc.close();
		int originalNumber, remainder, result = 0;
		originalNumber = n;
	    while (originalNumber != 0)
	    {
	    	remainder = originalNumber % 10;
	    	result += Math.pow(remainder, 3);
	    	originalNumber /= 10;
	    }
	    if(result == n)
	    	System.out.println(n + " is a Armstrong number.");
	    else
	    	System.out.println(n + " is not a Armstrong number.");
	}
}
