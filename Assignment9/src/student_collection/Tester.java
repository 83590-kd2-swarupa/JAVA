package student_collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;



public class Tester 
{

	public static void main(String[] args) 
	{
	
		List<Student> stdlist = new LinkedList<>();
		stdlist.add(new Student(5,"Krishna",99));
		stdlist.add(new Student(3,"Radha",95));
		stdlist.add(new Student(1,"Ram",97));
		stdlist.add(new Student(4,"Sita",80));
		stdlist.add(new Student(2,"Kanha",85));
		
		
		System.out.println("Before Sorting:");
		for(Student student:stdlist)
		{
			System.out.println(student);
		}
		
		System.out.println("After Natural Ordering:");
		Collections.sort(stdlist);
		for(Student student:stdlist)
		{
			System.out.println(student);
		}
		
		System.out.println("Sorting on Student Name:");
		
		class StdNameComparator implements Comparator<Student>
		{

			@Override
			public int compare(Student o1, Student o2) 
			{
				
				return o1.getName().compareTo(o2.getName());
			}
			
		}
		
		Comparator<Student> stdNameComparator=new StdNameComparator();
		
		Collections.sort(stdlist,stdNameComparator);
		
		for(Student student:stdlist)
		{
			System.out.println(student);
		}
		
		Student std=new Student();
		std.setRoll(2);
		if(stdlist.contains(std))
		{
			System.out.println("Student Exists.");
		}
		else
		{
			System.out.println("Student Not Found.");
		}
	}

}
