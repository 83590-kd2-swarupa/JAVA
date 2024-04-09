package payroll_application;

public class BasePlusCommissionEmployee extends Employee
{
	protected double baseSalary;
	public double grossSales;
    public double commissionRate;
	

	public BasePlusCommissionEmployee() 
	
	{
	}

	public BasePlusCommissionEmployee(String name, double salary,double baseSalary, double grossSales, double commissionRate,int num) {
		this.baseSalary=baseSalary;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	@Override
	public void calculateSalary() 
	{
		double totalSalary;
		salary=baseSalary * 1.1;
		totalSalary= salary + grossSales * commissionRate;
		System.out.println("Total Salary="+ totalSalary);
		
	}

	@Override
	public String toString() {
		return "Base Salaried Commission Employee [name="+name +"Social security Number="+num+", gross sales=" + grossSales + ", commission rate=" + commissionRate+ "Base salary="+baseSalary+"]";
	}	
	
	

}