/*
Q1. Copy the Point2D class , along with the package from previous assignment.
a) Create a class "TestPointArray1.java" in "tester" package for the following
b) Accept , how many no of points to plot from user.
c) Create suitable data structure
Hint : Point2D[] points=new Point2D[sc.nextInt()];
d) Prompt user for x & y co ordinates n store the data suitably
Hint : for loop
e) Supply Menu to user with various Options like following
1. Display details of a specific point
User i/p : index
O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
2) Display x, y co-ordinates of all points
Hint : for-each
3) User i/p : 2 indices for the points , validate the indices
Display distance between specified points (iff they are not located at the same position)
eg : sop("Enter index of strt point n end point");
validation : boundary condition (0<=index<length-1)
isEqual -- false --compute distance --display it.
4. Exit
*/

package com.app.geometry;

public class Point2D 
{
		int x;
		int y;
		String details;
		
		public Point2D()
		{
			
		}
		
		public Point2D(int x,int y)
		{
			this.x=x;
			this.y=y;	
		}
		
		public void setX(int x)
		{
			this.x=x;
		}
		
		public void setY(int y)
		{
			this.y=y;
		}
		
		public int getX()
		{
			return x;
		}
		
		public int getY()
		{
			return y;
		}
		
		
		public void displayPoint()
		{
			System.out.println("("+x+","+y+")");
		}
		
		public boolean isEqual(int x,int y)
		{
			if (this.x == x && this.y == y)
			
				return true;
			else 
				return false;
		}
		
		public double calculateDistance(Point2D other)
		{	
			double a = Math.pow((x - other.x),2);
			double b= Math.pow((y - other.y),2);
			double d = Math.sqrt(a+b);
	        return d;
		}
		

}
