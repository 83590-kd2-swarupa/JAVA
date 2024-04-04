package tester;

import com.app.geometry.*;
import java.util.Scanner;

public class TestPointArray1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Number of Points:");
	int num=sc.nextInt();
	
	Point2D[] points=new Point2D[num];
	
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the x-coordinate for point"+i+":");
		int xcord=sc.nextInt();
		
		System.out.println("Enter the y-coordinate for point"+i+":");
		int ycord=sc.nextInt();
		
		points[i]=new Point2D(xcord,ycord);
	}
	
	int choice;
	do
	{
		System.out.println("Menu:");
		System.out.println("1.Display details of a specific point");
		System.out.println("2.Display x, y co-ordinates of all points");
		System.out.println("3.User i/p : 2 indices for the points , validate the indices");
		System.out.println("4.Exit");
		
		System.out.print("Enter Your Choice:");
		choice=sc.nextInt();
		
		
		switch(choice)
		{
			
			case 1:
			{
				System.out.println("Enter the index of the Point:");
				int index=sc.nextInt();
				
				if(index>=0 && index<num)
				{
					points[index].displayPoint();
				}
				else
				{
					System.out.println("Invalid index , pls retry!!!!");
				}
			}
			break;
			
			case 2:
			{
				for(Point2D point : points)
				{
					point.displayPoint();
				}
			}
			break;
			
			case 3:
			{
				System.out.println("Enter the index of the start point:");
				int startIndex=sc.nextInt();
				
				System.out.println("Enter the index of the end point:");
				int endIndex=sc.nextInt();
				
				if(startIndex>=0 && startIndex<num && endIndex>=0 && endIndex<num)
				{
					if(startIndex != endIndex)
					{
						double Distance=points[startIndex].calculateDistance(points[endIndex]);
						System.out.println("Distance between two points "+ startIndex + " and " + endIndex + " is "+ Distance);
					}
					else
					{
						System.out.println("Start and End Points Are The Same.");
					}
				}
				else
				{
					System.out.println("Invalid Indices...Try Again");
				}
				
			}
			break;
			
			case 4:
			{
				System.out.println("Thank You...\nExiting Program");	
			}
			break;
		}
	} while(choice!=4);
    
	}
}
