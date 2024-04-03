package tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint 
{

	public static void main(String[] args) 
	{
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 = ");
		x1 = sc.nextInt();
		System.out.print("Enter y1 = ");
		y1 = sc.nextInt();
		
		System.out.print("Enter x2 = ");
		x2 = sc.nextInt();
		System.out.print("Enter y2 = ");
		y2 = sc.nextInt();
		
		Point2D p1 = new Point2D(x1,y1);
		System.out.println("Details of p1:"+p1.getDetails());
		
		Point2D p2 = new Point2D(x2,y2);
		System.out.println("Details of p2:"+p2.getDetails());
		
		if(p1.isEqual(x2, y2)== true)
		{
			System.out.println("Coordinate you provides are pointing to a same point");
		}
		else
		{
			p1.distance(x2, y2);
		}
	}

}
