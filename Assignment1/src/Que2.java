//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.
//Hint : Check Scanner class for the methods

import java.util.Scanner;

public class Que2 
{
	public static void main(String[] args) 
	{
		double num1;
		double num2;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Num1:");
		
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
			System.out.print("Enter Num2:");
			
			if(sc.hasNextDouble())
			{
				num2=sc.nextDouble();
				avg=(num1+num2)/2;
				System.out.println("Average of Two Numbers:"+avg);
			}
			else
			{
				System.out.println("Second Number is Not Double.");
			}
		}
		else
		{
			System.out.println("The First Number is Not Double.");
		}			
		
	}

}
