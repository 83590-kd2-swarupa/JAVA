/*
Q1 Apply inheritance n polymorphism
a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
c) Add suitable constructors.
d) Override toString correctly to return state of all fruits (including : name ,color , weight )
e) Add a taste() method : public String taste()
For Fruit : it should return "no specific taste"
Apple : should return "sweet n sour"
Mango : should return "sweet"
Orange : should return "sour"
*/

package com.app.fruits;

import java.util.Scanner;

public class Fruit 
{
	String color;
	double weight;
	String name;
	boolean isFresh=true;
	
	public Fruit() 
	{
		
	}
	
	public Fruit(String color, double weight,String name,boolean isFresh) 
	{
		this.color = color;
		this.weight = weight;
		this.name =name;
		this.isFresh = isFresh;
	}

	public String taste()
	{
		return "no specific taste";
	}
	
	public void acceptData(Scanner sc)
	{
		System.out.print("Enter Name:");
		name=sc.next();
		
		System.out.print("Enter Color:");
		color=sc.next();
		
		System.out.print("Enter Weight:");
		weight=sc.nextDouble();
	}

	@Override
	public String toString() 
	{
		return "Fruit [name-" + name + ", color-" + color + ", weight-" + weight +"]";
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public boolean isFresh() 
	{
		return isFresh;
	}

	public void setFresh(boolean isFresh) 
	{
		this.isFresh = isFresh;
	}

}
