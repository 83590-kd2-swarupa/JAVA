package payroll_application;

import java.util.Scanner;

public class HourlyEmployee extends Employee
{
	private double hours;
	private double wage;
	
	

	public HourlyEmployee() 
	{
		
	}

	public HourlyEmployee(String name, double salary, double hours, double wage) 
	{
		this.hours=hours;
		this.wage=wage;
	}
	
	

	@Override
	public void acceptData(Scanner sc) 
	{
		System.out.println("Enter Hourly Worked");
		hours=sc.nextDouble();
		System.out.println("Enter Hourly wage");
		wage=sc.nextDouble();
		super.acceptData(sc);
	}

	@Override
	public void calculateSalary() 
	{
		double totalSalary =0;
		if(hours<=40)
		{
			totalSalary=wage * hours;
		}
		else if(hours>40)
		{
			totalSalary =40 * wage +(hours-40)*wage*1.5;
		}
		
		System.out.println("Total Salary="+ totalSalary);
	}

	@Override
	public String toString() {
		return "HourlyEmployee [name=" + name  + "Social security Number="+num+", Hourly wage=" + wage + ", Hourly worked=" + hours +"]";
	}
	
	

}

