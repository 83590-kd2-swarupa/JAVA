package que2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		Student arr[]=new Student[5];
		arr[0]=new Student(1,"Radha","Barsana",99);
		arr[1]=new Student(3,"Krishna","Dwarka",97);
		arr[2]=new Student(2,"Kanha","Vrindavan",75);
		arr[3]=new Student(5,"Kishori","Braj",80);
		arr[4]=new Student(4,"Ram","Ayodhya",95);
		
		System.out.println("Before Sorting:");
		for(Student std:arr)
		{
			System.out.println(std);
		}
		
		
		class StudentCityComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				int value=o1.city.compareTo(o2.city);
				return value;
			}	
		}
		
		
		class StudentNameComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				int value=o1.name.compareTo(o2.name);
				return value;
			}	
		}
		
		
		
		class StudentMarksComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				int value=Double.compare(o2.marks,o1.marks);
				return value;
			}	
		}
		
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("0.Exit.");
			System.out.println("1.Sorted on their city (asc)");
			System.out.println("2.Sorted on their on marks (desc)");
			System.out.println("3.Sorted on their on name (asc)");
			
			System.out.print("Enter Your Choice:");
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
				Comparator<Student> cityComparator = new StudentCityComparator();
				System.out.println("Students Sorted on City:");
				Arrays.sort(arr,cityComparator);
				for(Student std:arr)
				{
					System.out.println(std);
				}
				
			}
			break;
			
			case 2:
			{
				Comparator<Student> marksComparator = new StudentMarksComparator();
				System.out.println("Students Sorted on Marks:");
				Arrays.sort(arr,marksComparator);
				for(Student std:arr)
				{
					System.out.println(std);
				}
				
			}
			break;
			
			case 3:
			{
				Comparator<Student> nameComparator = new StudentNameComparator();
				System.out.println("Students Sorted on Name:");
				Arrays.sort(arr,nameComparator);
				for(Student std:arr)
				{
					System.out.println(std);
				}
			}
			break;
			
			default:
			{
				System.out.println("Wrong Choice...");
			}
			}
			
		} while(choice!=0);
	}

}
