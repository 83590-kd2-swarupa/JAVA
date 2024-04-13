/*
 Q2. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to
display students
1. sorted on their city (asc)
2. sorted on their on marks (desc)
3. sorted on their on name (asc)
class Student {
private int roll;
private String name;
private String city;
private double marks;
}
*/
package que2;

public class Student
{
    int roll;
	String name;
	String city;
	double marks;
	
	
	public Student() 
	{
		
	}


	public Student(int roll, String name, String city, double marks) 
	{
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}


	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

}
