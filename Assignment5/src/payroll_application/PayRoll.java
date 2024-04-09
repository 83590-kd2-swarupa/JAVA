package payroll_application;

import java.util.Scanner;

public class PayRoll 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type of employee (Salaried, Hourly, Commission, Base-Salaried Commission):");
		String employeeType=sc.nextLine();
		
		Employee emp=null;
		
		switch(employeeType)
		{
		case "Salaried":
		{
			emp= new SalariedEmployee();
			emp.acceptData(sc);
			System.out.println(emp.toString());
		}
		break;
		
		case "Hourly":
		{
			emp=new HourlyEmployee();
			emp.acceptData(sc);
			System.out.println(emp.toString());
		}
		break;
		
		case "Commission ":
		{
			emp=new CommissionEmployee();
			emp.acceptData(sc);
			System.out.println(emp.toString());
		}
		break;
		
		case "Base Salaried Commission":
		{
			emp=new BasePlusCommissionEmployee();
			emp.acceptData(sc);
			System.out.println(emp.toString());
		}	
		break;
		}
		
		if (emp!= null) 
		{
			emp.calculateSalary();
		}
	}

}
