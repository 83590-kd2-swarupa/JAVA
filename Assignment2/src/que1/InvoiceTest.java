package que1;

public class InvoiceTest 
{
	public static void main(String[] args) 
	{
		Invoice in=new Invoice();
	   
		in.setpart_Number("SP07");
		in.setpart_Description("Wheel");
		in.setQuantity(4);
		in.setPrice(5.00);
		
		in.getpart_Number();
		in.getpart_Description();
		in.getQuantity();
		in.getPrice();
		
		System.out.println("part_Number:"+in.getpart_Number());
		System.out.println("part_Description:"+in.getpart_Description());
		System.out.println("Quantity:"+in.getQuantity());
		System.out.println("Price:"+in.getPrice());
		
		in.CalculateAmmount(in.getQuantity(),in.getPrice());
	}

}
