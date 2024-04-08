package com.app.fruits;

public class Orange extends Fruit
{
	
	public Orange() 
	{
		super();
	}
	
	public Orange(String color, double weight,String name, boolean isFresh) 
	{
		this.name="orange";
	}

	public String taste() 
	{
		return "sweet";
	}
}
