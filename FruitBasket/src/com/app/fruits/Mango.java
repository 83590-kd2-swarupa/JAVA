package com.app.fruits;

public class Mango extends Fruit
{
	
	public Mango() 
	{
		super();
	}
	
	public Mango(String color, double weight, String name,boolean isFresh) 
	{
		this.name="Mango";
	}

	public String taste() 
	{
		return "sour";
	}	
}
