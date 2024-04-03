//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

package que1;

public class Invoice 
{
		private String part_Number;
		private String part_Description;
		private int quantity;
		private double price;
		
	    Invoice()
	    {
	    	
	    }
	    
	    Invoice(String part_Number,String part_Description,int quantity,double price)
	    {
	    	this.part_Number=part_Number;
	    	this.part_Description=part_Description;
	    	this.quantity=quantity;
	    	this.price=price;   		
	    }
	    
	    public void setpart_Number(String part_Number)
	    {
	    	this.part_Number=part_Number;
	    }
	    
	    public void setpart_Description(String part_Description)
	    {
	    	this.part_Description=part_Description;
	    }
	    
	    public void setQuantity(int quantity)
	    {
	    	this.quantity=quantity;
	    }
	    
	    public void setPrice(double price)
	    {
	    	this.price=price;
	    }
	    
	    public String getpart_Number()
	    {
	    	return part_Number;
	    }
	    
	    public String getpart_Description()
	    {
	    	return part_Description;
	    }
	    
	    public int getQuantity()
	    {
	    	if(quantity < 0)
	    	{
	    		return 0;
	    	}
	    	else
	    	{
	    		return quantity;
	    	}
	    }
	    
	    public double getPrice()
	    {
	    	if(price<0)
	    	{
	    		return 0.0;
	    	}
	    	else
	    	{
	    		return price;		
	    	}
	    }
	    
	    public void CalculateAmmount(int quantity,double price)
	    {
	    	double Amount;
	    	Amount=quantity*price;
	    	System.out.println("Total Amount:"+Amount);
	    }
	}


