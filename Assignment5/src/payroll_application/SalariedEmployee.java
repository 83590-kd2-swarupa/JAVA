package payroll_application;

import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	

	public SalariedEmployee() 
	{
		
	}

	public SalariedEmployee(String name, double salary,int num) 
	{
		super(name, salary,num);
	}
	
	

	@Override
	public void acceptData(Scanner sc) 
	{
		super.acceptData(sc);
	}

	@Override
	public void calculateSalary() 
	{
		System.out.println("Total Salary="+ salary);
	}

	@Override
	public String toString() 
	{
		return "SalariedEmployee [name=" + name + "Social security Number="+num+", Weekly salary=" + salary + "]";
	}
	
	
}
