package com.app.fruits;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Basket size:");
		int num=sc.nextInt();
		Fruit arr[]=new Fruit[num];
		
		int index=0;
		
		Fruit f;
		int choice;
			
		do
		{
			System.out.println("0.Exit");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Display names of all fruits in the basket.");
			System.out.println("5.Display name,color,weight,taste of all fresh fruits,in the basket.");
			System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
			System.out.println("7.Mark a fruit as stale");
			System.out.println("8.Mark all sour fruits stale (optional)");
			
			System.out.print("Enter Choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
			{	
				System.out.println("Thank You!");
			}
			break;
			
			case 1:
			{	
				if (index < num)
				{
					f=new Mango();
					f.acceptData(sc);
				    arr[index]=f;
				    index++;	
				}
				else
				{
					System.out.println("Basket Is Full");
				}
			}
			break;
			
			case 2:
			{	
				if (index < num)
				{
					f=new Orange();
					f.acceptData(sc);
				    System.out.println(f.toString());
				    arr[index]=f;
				    index++;	
				}
				else
				{
					System.out.println("Basket Is Full");
				}
			}
			break;
			
			case 3:
			{	
				if (index < num)
				{
					f=new Apple();
					f.acceptData(sc);
				    arr[index]=f;
				    index++;	
				}
				else
				{
					System.out.println("Basket Is Full");
				}
			}
			break;
			
			case 4:
			{	  
				System.out.println("Names of Fruits in the Basket:" );
				for(Fruit fruit : arr) 
				{
					if(fruit!=null)
					{
						System.out.println(fruit.getName());
					}
					else
					{
						System.out.println("Basket is Empty");
					}
					
				}
//				for(int i=0;i<index;i++)
//				{
//					System.out.println(arr[i].getName());
//				}
					
			}
			break;
			
			case 5:
			{	
				for(Fruit fruit : arr)
				{
					System.out.println("Fruits in Basket are:" +fruit);
				}
//				for(int i=0;i<index;i++)
//				{
//					System.out.println(arr[i].toString());
//					System.out.println(arr[i].isFresh());
//					if(arr[i].isFresh()==true)
//					{
//						System.out.println(arr[i].taste());	
//					}
//				}
			}
			break;
			
			case 6:
			{	
				for(int i=0;i<index;i++)
				{
					System.out.println(arr[i].isFresh());
					if(arr[i].isFresh()==false)
					{
						System.out.println(arr[i].taste());	
					}
				}
			}
			break;
			
			case 7:
			{
				System.out.println("To Mark As Stale:");
				int n=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(i==n)
					{
						arr[i].setFresh(false);
					}
				}
			}
			break;
			
			case 8:
			{
				for (Fruit fruit : arr)
				{
					if(fruit.taste()=="sour")
					{
						fruit.setFresh(false);
						System.out.println("The Fruit is stale!");
					}
				}
//				for(int i=0;i<index;i++)
//				{
//					if(arr[i].taste()=="sour")
//					{
//						arr[i].setFresh(false);
//					}
//				}
				
			}
			break;
			
			default:
			{
				System.out.println("Wrong Choice.");
			}
			}
		}while(choice!=0);
		
	}
	
}
