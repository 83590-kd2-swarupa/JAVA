package payroll_application;

import java.util.Scanner;

public class CommissionEmployee extends Employee
{
	public double grossSales;
    public double commissionRate;

   
	public CommissionEmployee() 
	{
	}

	public CommissionEmployee(String name, double salary, int num, double grossSales, double commissionRate) {
		super(name, salary, num);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	

	public void acceptData(Scanner sc) 
	{
		System.out.println("Enter Gross Sales:");
		grossSales=sc.nextDouble();
		System.out.println("Enter Commision Rate:");
		commissionRate=sc.nextDouble();
		super.acceptData(sc);
	}

	@Override
	public void calculateSalary() 
	{
		double totalSalary;
    	totalSalary=salary+commissionRate * grossSales;
    	System.out.println("Total Salary="+ totalSalary);
		
	}


	@Override
	public String toString() {
		return "CommissionEmployee [ name=" + name +"Social security Number="+num+", gross sales =" + grossSales + ", commission rate=" + commissionRate + "]";
	}
	
	
	
}
