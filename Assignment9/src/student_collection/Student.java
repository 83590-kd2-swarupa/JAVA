package student_collection;

public class Student implements Comparable<Student>
{
	private int roll;
	private String name;
	private double marks;
	
	
	public Student() 
	{
		
	}


	public Student(int roll, String name, double marks) 
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	@Override
	public boolean equals(Object obj) 
	{
		if(obj == null)
			return false;
		else if (this == obj)
			return true;
		else if(obj instanceof Student)
		{
			Student s = (Student) obj;
			return s.roll==this.roll;
		}
		return false;
	}
	
	

	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public double getMarks() 
	{
		return marks;
	}


	public void setMarks(double marks) 
	{
		this.marks = marks;
	}


	@Override
	public int compareTo(Student o) 
	{
		return this.roll-o.roll;
	}
	

}
