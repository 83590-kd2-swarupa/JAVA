package com.app.fruits;

public class Apple extends Fruit
{
	
	public Apple() 
	{
		super();
	}
	
	public Apple(String color, double weight,String name, boolean isFresh) 
	{
		this.name="Apple";
	}

	public String taste() 
	{
		return "sweet n sour";
	}
	
	

}
