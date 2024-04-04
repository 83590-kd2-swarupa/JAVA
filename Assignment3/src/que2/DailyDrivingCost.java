/*
Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
money could be saved by car pooling, which also has other advantages such as reducing carbon
emissions and reducing traffic congestion. The application should input the following information
and display the user’s cost per day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day.
*/

package que2;

import java.util.Scanner;

public class DailyDrivingCost 
{

	public static void main(String[] args) 
	{
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter total miles driven per day:");
		        double totalMilesDriven = sc.nextDouble();

		        System.out.print("Enter cost per gallon of gasoline:");
		        double costPerGallon = sc.nextDouble();

		        System.out.print("Enter average miles per gallon:");
		        double averageMilesPerGallon = sc.nextDouble();

		        System.out.print("Enter parking fees per day:");
		        double parkingFees = sc.nextDouble();

		        System.out.print("Enter tolls per day:");
		        double tolls = sc.nextDouble();

		        double gallonsUsedPerDay = totalMilesDriven / averageMilesPerGallon;
		        double costPerDay = gallonsUsedPerDay * costPerGallon + parkingFees + tolls;

		        System.out.println("\nYour daily driving cost is Rs." + costPerDay);
		        
		        double carpoolSavings = costPerDay * 0.3;  // Assuming 30% savings with carpooling

		        System.out.println("You could save per day by carpooling, approximately Rs."+ carpoolSavings);

	}

}
