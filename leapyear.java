package day2;

import java.util.Scanner;

public class leapyear 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Year:");
	    Scanner sc=new Scanner(System.in);
	   	int year= sc.nextInt();
	   	sc.close();
		boolean leap = false;
		if (year % 4 == 0)
		{
			if (year % 100 == 0) 
			{
				if (year % 400 == 0)
					leap = true;
				else
					leap = false;
			}
			else
				leap = true;
		}
		else
			leap = false;
		if (leap)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}

