package payroll_application;

import java.util.Scanner;

abstract class Employee 
{
	protected String name;
	protected double salary;
	protected int num ;
	
	public Employee() 
	{
	}

	public Employee(String name, double salary,int num) 
	{
		this.name=name;
		this.salary=salary;
		this.num=num;
	}
	
	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	public void acceptData(Scanner sc)
	{
		System.out.print("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Salary:");
		salary=sc.nextDouble();
		System.out.println("Enter Social security Number:");
		num=sc.nextInt();
		
	}
	public abstract void calculateSalary();

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", Social security Number="+num+"]";
	}
	

}
